package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;

import br.com.caelum.financas.modelo.Movimentacao;
import br.com.caelum.financas.util.JPAUtil;

public class TestaMovimentacaoConta {

	public static void main(String[] args) {
		EntityManager manager = new JPAUtil().getEntityManager();
		manager.getTransaction().begin();
		
		/* APAGAR TODO O CONTEUDO DE 
		 * EXECUTAR POPULACONTA E POPULAMOVIMENTACAO*/
		Movimentacao movimentacao = manager.find(Movimentacao.class,2);
		
		System.out.println(movimentacao.getConta().getTitular());
		
		manager.getTransaction().commit();
		manager.close();
	}
}
