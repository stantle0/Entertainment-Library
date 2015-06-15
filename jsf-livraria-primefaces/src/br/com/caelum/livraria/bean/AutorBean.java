package br.com.caelum.livraria.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.caelum.livraria.dao.DAO;
import br.com.caelum.livraria.modelo.Autor;

@ManagedBean
@SessionScoped
public class AutorBean {
	
	private Autor autor;
	private DAO<Autor> daoTemp;
	
	public AutorBean() {
		super();
		autor = new Autor();
		daoTemp = new DAO<Autor>();
	}
	
	public String gravar() {
		daoTemp.adiciona(autor);
		autor = new Autor();
		
		System.out.println("Autores:");
		System.out.println(daoTemp.getLista());
		
		return "livro?faces-redirect=true";
	}
	
	public Autor getAutor() {
		return autor;
	}
	
}