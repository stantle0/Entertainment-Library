package br.com.entertainmentlibrary.test;

import javax.persistence.EntityManager;

import br.com.entertainmentlibrary.dao.GenericHibernateDAO;
import br.com.entertainmentlibrary.model.util.Cidade;
import br.com.entertainmentlibrary.model.util.Estado;
import br.com.entertainmentlibrary.util.JPAUtil;


public class DAOTeste {
	
	public static void main(String[] args) {
//		Cidade cidade1 = new Cidade("Campo Grande");
//		Cidade cidade2 = new Cidade("Maracaju");
//		Cidade cidade3 = new Cidade("S�o Paulo");
//		
//		Estado estado1 = new Estado("Mato Grosso do Sul");
//		Estado estado2 = new Estado("S�o Paulo");
//		
//		cidade1.setEstado(estado1);
//		cidade2.setEstado(estado1);
//		cidade3.setEstado(estado2);
		
		EntityManager entityManager = JPAUtil.getEntityManager();
		GenericHibernateDAO<Estado> estadoDao = new GenericHibernateDAO<Estado>(entityManager, Estado.class);
		GenericHibernateDAO<Cidade> cidadeDao = new GenericHibernateDAO<Cidade>(entityManager, Cidade.class);
		entityManager.getTransaction().begin();
		
//		estadoDao.save(estado1);
//		estadoDao.save(estado2);
//		
//		System.out.println(estadoDao.listAll());
//		
//		cidadeDao.save(cidade1);
//		cidadeDao.save(cidade2);
//		cidadeDao.save(cidade3);
		
//		String nome = cidadeDao.getElementById(9).getNome();
		
		Cidade cidade = entityManager.find(Cidade.class, 14);
		System.out.println(cidade);
		
		entityManager.getTransaction().commit();
		entityManager.close();
		
		criar testes com JUnit
		- salvar
		- salvar e deletar
		- salvar e busca
		- salvar e update
		
	}

}
