package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;

import br.com.caelum.financas.dao.MovimentacaoDAO;
import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

public class TestaConsultaNamedQuery {

	public static void main(String[] args) {
		EntityManager manager = new JPAUtil().getEntityManager();
		manager.getTransaction().begin();
		
		Conta conta = new Conta();
		conta.setId(1);
		
		Long totalDeMovimentacoes = new MovimentacaoDAO(manager).totalDeMovimentacoes(conta);
		System.out.println(totalDeMovimentacoes);
		
		manager.getTransaction().commit();
		manager.close();
	}
}
