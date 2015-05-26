package br.com.caelum.financas.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.modelo.Movimentacao;
import br.com.caelum.financas.modelo.TipoMovimentacao;
import br.com.caelum.financas.util.JPAUtil;

public class TesteConsultaJPQL {
	public static void main(String[] args) {
		EntityManager manager = new JPAUtil().getEntityManager();
		manager.getTransaction().begin();

		Conta conta = new Conta();
		conta.setId(1);

		// Query query =
		// manager.createQuery("select m from Movimentacao m where m.conta.id=?1"
		// +
		// " and m.tipoMovimentacao=?2");
		// query.setParameter(1, conta.getId());
		// query.setParameter(2, TipoMovimentacao.ENTRADA);

		Query query = manager
				.createQuery("select m from Movimentacao m where m.conta=:pConta"
						+ " and m.tipoMovimentacao=:pTipoMovimentacao"
						+ " order by m.valor desc");
		query.setParameter("pConta", conta);
		query.setParameter("pTipoMovimentacao", TipoMovimentacao.SAIDA);

		List<Movimentacao> movimentacoes = query.getResultList();
		for (Movimentacao m : movimentacoes) {
			System.out.println("\nDescricao: " + m.getDescricao());
			System.out.println("Valor: " + m.getValor());
		}

		manager.getTransaction().commit();
		manager.close();
	}
}
