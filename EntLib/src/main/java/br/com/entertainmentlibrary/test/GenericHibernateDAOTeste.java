package br.com.entertainmentlibrary.test;

import static junit.framework.Assert.assertEquals;

import javax.persistence.EntityManager;

import org.junit.Before;
import org.junit.Test;

import br.com.entertainmentlibrary.dao.DAOFactory;
import br.com.entertainmentlibrary.dao.GenericHibernateDAO;
import br.com.entertainmentlibrary.model.util.Cidade;
import br.com.entertainmentlibrary.model.util.Estado;
import br.com.entertainmentlibrary.util.JPAUtil;


public class GenericHibernateDAOTeste {

//	TODO refatorar criacao de DAO
//	TODO criar testes com JUnit
//	- salvar
//	- salvar com relacionamento
//	- deletar
//	- busca
//	- update
	
	private EntityManager entityManager;
	private GenericHibernateDAO<Cidade> cidadeDao;
	private GenericHibernateDAO<Estado> estadoDao;
	private Cidade cidade;
	private Estado estado;
	
	@Before
	public void before() {
		cidade = new Cidade();
		cidade.setNome("Campo Grande");
		estado = new Estado();
		estado.setNome("Mato Grosso Do Sul");
	}
	

	@Test
	public void testaSave() {
		
		gravaCidade();

		/* Teste */
		abrirManager();
		
		cidadeDao = DAOFactory.getCidadeDAO(entityManager);
		Cidade cidadeBuscada = cidadeDao.getElementById(cidade.getId());
		
		assertEquals(cidade.getId(), cidadeBuscada.getId());
		assertEquals(cidade.getNome(), cidadeBuscada.getNome());
		
		fecharManager();
		
	}


	
	@Test
	public void testaSaveComRelacionamento() {
		
		cidade.setEstado(estado);
		
		gravaEstado();
		gravaCidade();
		
		abrirManager();
		
		Cidade cidadeBuscada = DAOFactory.getCidadeDAO(entityManager).getElementById(cidade.getId());
		Estado estadoBuscado = DAOFactory.getEstadoDAO(entityManager).getElementById(estado.getId());
		
		assertEquals(cidade.getId(), cidadeBuscada.getId());
		assertEquals(cidade.getNome(), cidadeBuscada.getNome());
		assertEquals(estado.getId(), estadoBuscado.getId());
		assertEquals(estado.getNome(), estadoBuscado.getNome());
		
		assertEquals(cidade.getEstado().getId(), estado.getId());
		assertEquals(cidade.getEstado().getNome(), estado.getNome());
		
		fecharManager();
		
	}


	@Test
	public void testaRemove() throws InterruptedException {
		gravaCidade();
		
		abrirManager();
		GenericHibernateDAO<Cidade> cidadeDAO = DAOFactory.getCidadeDAO(entityManager);
		Cidade cidadeParaRemover = cidadeDAO.getElementById(cidade.getId());
		cidadeDAO.delete(cidadeParaRemover);
		fecharManager();

		abrirManager();
		cidadeDAO = DAOFactory.getCidadeDAO(entityManager);
		Cidade cidadeBuscada = cidadeDAO.getElementById(cidade.getId());
		assertEquals(null, cidadeBuscada);
		fecharManager();
		
	}
	
	@Test
	public void testUpdate() {
		gravaCidade();
		
		
		abrirManager();
		
		Cidade cidadeBuscada = DAOFactory.getCidadeDAO(entityManager).getElementById(cidade.getId());
		assertEquals(cidade.getId(), cidadeBuscada.getId());
		assertEquals(cidade.getNome(), cidadeBuscada.getNome());
		
		cidadeBuscada.setNome("Tr�s Lagoas");
		
		fecharManager();
		
		
		abrirManager();
		
		Cidade cidadeAlterada = DAOFactory.getCidadeDAO(entityManager).getElementById(cidade.getId());
		assertEquals("Tr�s Lagoas", cidadeAlterada.getNome());
		
		fecharManager();
	}
	
	private void abrirManager() {
		entityManager = JPAUtil.getEntityManager();
		entityManager.getTransaction().begin();
	}

	private void fecharManager() {
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	private void gravaCidade() {
		abrirManager();
		
		DAOFactory.getCidadeDAO(entityManager).save(cidade);
		
		fecharManager();
	}
	
	private void gravaEstado() {
		abrirManager();	
		
		DAOFactory.getEstadoDAO(entityManager).save(estado);
		
		fecharManager();
	}
}
