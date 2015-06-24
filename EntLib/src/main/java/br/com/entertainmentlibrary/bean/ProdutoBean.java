package br.com.entertainmentlibrary.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;

import br.com.entertainmentlibrary.dao.DAOFactory;
import br.com.entertainmentlibrary.dao.GenericHibernateDAO;
import br.com.entertainmentlibrary.model.produto.Produto;
import br.com.entertainmentlibrary.util.JPAUtil;

@ManagedBean
public class ProdutoBean {
	
	public String getNome() {
		return "Produto";
	}
	
	public List<Produto> getProdutos() {
		EntityManager manager = JPAUtil.getEntityManager();
		GenericHibernateDAO<Produto> produtoDAO = new DAOFactory().getProdutoDAO(manager);
		return new ArrayList<Produto>(produtoDAO.listAll());
	}
	
	
}
