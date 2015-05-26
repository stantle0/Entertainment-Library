package br.com.caelum.financas.teste;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.modelo.Movimentacao;
import br.com.caelum.financas.util.JPAUtil;

public class TesteConsulta {
	public static void main(String[] args) {
		EntityManager manager = new JPAUtil().getEntityManager();
		manager.getTransaction().begin();
		
		Conta conta = new Conta();
		conta.setId(1);
		
		Query query = manager.createQuery("select m from Movimentacao m where m.conta.id=" + conta.getId());

		List<Movimentacao> movimentacoes = query.getResultList();
		for (Movimentacao m : movimentacoes) {
			System.out.println("\nDescricao: " + m.getDescricao());
			System.out.println("Valor: " + m.getValor());
		}
		
		manager.getTransaction().commit();
		manager.close();
	}
}
