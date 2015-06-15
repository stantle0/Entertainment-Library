package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.modelo.Movimentacao;
import br.com.caelum.financas.util.JPAUtil;

public class TestaContaMovimentacoes {

	public static void main(String[] args) {
		
		EntityManager manager = new JPAUtil().getEntityManager();
		manager.getTransaction().begin();
		
		Query query = manager.createQuery("select c from Conta c join fetch c.movimentacoes where c.id=1");
		Conta conta = (Conta) query.getSingleResult();
		
		manager.getTransaction().commit();
		manager.close();
		
		for (Movimentacao m : conta.getMovimentacoes()) {
			System.out.println(m.getDescricao());
		}

	}
}
