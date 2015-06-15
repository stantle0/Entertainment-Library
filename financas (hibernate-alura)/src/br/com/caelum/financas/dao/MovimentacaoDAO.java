package br.com.caelum.financas.dao;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.caelum.financas.modelo.Conta;

public class MovimentacaoDAO {
	
	private EntityManager manager;
	
	public MovimentacaoDAO(EntityManager manager) {
		this.manager = manager;
	}
	
	public Double mediaDaConta(Conta conta) {
		TypedQuery<Double> query = manager.createQuery("select avg(m.valor) from Movimentacao m where m.conta=:pConta", Double.class);
		query.setParameter("pConta", conta);
		Double media = query.getSingleResult();
		return media;
	}
	
	public Long totalDeMovimentacoes(Conta conta) {
		TypedQuery<Long> query = manager.createNamedQuery("totalDeMovimentacoes", Long.class);
		query.setParameter("pConta", conta);
		Long total = query.getSingleResult();
		return total;
	}

}
