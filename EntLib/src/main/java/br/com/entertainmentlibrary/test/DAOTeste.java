package br.com.entertainmentlibrary.test;

import javax.persistence.EntityManager;

import org.junit.Test;

import br.com.entertainmentlibrary.dao.GenericHibernateDAO;
import br.com.entertainmentlibrary.model.util.Cidade;
import br.com.entertainmentlibrary.model.util.Estado;
import br.com.entertainmentlibrary.util.JPAUtil;


public class DAOTeste<T> {

//	criar testes com JUnit
//	- salvar
//	- salvar e deletar
//	- salvar e busca
//	- salvar e update
	
	private EntityManager entityManager;
	
	private void abrirManager() {
		entityManager = JPAUtil.getEntityManager();
		entityManager.getTransaction().begin();
	}
	
	@Test
	public void testaInsercaoEListagem() {
		
		Cidade cidade = new Cidade();
		cidade.setNome("Campo Grande");
		Estado estado = new Estado();
		estado.setNome("Mato Grosso Do Sul");
		
		abrirManager();
		GenericHibernateDAO<Estado> estadoDao = new GenericHibernateDAO<Estado>(entityManager, Estado.class);
		GenericHibernateDAO<Cidade> cidadeDao = new GenericHibernateDAO<Cidade>(entityManager, Cidade.class);

		cidadeDao.save(cidade);
		estadoDao.save(estado);
		
		entityManager.getTransaction().commit();
		entityManager.close();
		
		
		listaTodosEstadosECidades();
		
		
	}

	private static void listaTodosEstadosECidades() {
		EntityManager entityManager = JPAUtil.getEntityManager();
		GenericHibernateDAO<Estado> estadoDao = new GenericHibernateDAO<Estado>(entityManager, Estado.class);
		GenericHibernateDAO<Cidade> cidadeDao = new GenericHibernateDAO<Cidade>(entityManager, Cidade.class);
		entityManager.getTransaction().begin();
		
		System.out.println(estadoDao.listAll());
		System.out.println(cidadeDao.listAll());
		
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	

}
