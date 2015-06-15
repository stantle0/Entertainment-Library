package br.com.caelum.financas.teste;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

public class TestaConsultaFuncaoMax {

	public static void main(String[] args) {
		EntityManager manager = new JPAUtil().getEntityManager();
		manager.getTransaction().begin();

		Conta conta = manager.find(Conta.class, 3);
		TypedQuery<BigDecimal> query = manager
				.createQuery(
						"select max(m.valor) from Movimentacao m where m.conta=:pConta",
						BigDecimal.class);
		query.setParameter("pConta", conta);
		BigDecimal maximo = query.getSingleResult();
		System.out.println(maximo);

		manager.getTransaction().commit();
		manager.close();
	}
}
