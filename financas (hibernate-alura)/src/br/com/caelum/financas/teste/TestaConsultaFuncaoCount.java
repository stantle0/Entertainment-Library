package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

public class TestaConsultaFuncaoCount {

	public static void main(String[] args) {
		EntityManager manager = new JPAUtil().getEntityManager();
		manager.getTransaction().begin();

		Conta conta = manager.find(Conta.class, 1);

		TypedQuery<Long> query = manager.createQuery(
				"select count(m) from Movimentacao m where m.conta=:pConta",
				Long.class);
		query.setParameter("pConta", conta);

		Long integer = query.getSingleResult();
		System.out.println(integer);

		manager.getTransaction().commit();
		manager.close();
	}
}
