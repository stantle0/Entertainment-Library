package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;

import br.com.caelum.financas.dao.MovimentacaoDAO;
import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

public class TestaConsultaDAO {

	public static void main(String[] args) {
		EntityManager manager = new JPAUtil().getEntityManager();
		manager.getTransaction().begin();
		
		Conta conta = new Conta();
		conta.setId(1);
		
		Double mediaDaConta = new MovimentacaoDAO(manager).mediaDaConta(conta);
		System.out.println(mediaDaConta);
		
		manager.getTransaction().commit();
		manager.close();
	}
}
