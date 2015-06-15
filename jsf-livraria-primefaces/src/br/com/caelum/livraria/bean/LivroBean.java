package br.com.caelum.livraria.bean;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

import br.com.caelum.livraria.dao.DAO;
import br.com.caelum.livraria.modelo.Autor;
import br.com.caelum.livraria.modelo.Livro;

@ManagedBean
@SessionScoped
public class LivroBean {

	private Livro livro;
	private DAO<Livro> daoTemp;
	private DAO<Autor> daoAutor;
	private Integer idAutor;
	
	public LivroBean() {
		super();
		this.livro = new Livro();
		this.daoTemp = new DAO<Livro>();
		this.idAutor = new Integer(0);
		daoAutor = new DAO<Autor>();
			daoAutor.adiciona(new Autor(0,"Pedro"));
			daoAutor.adiciona(new Autor(1,"José"));
			daoAutor.adiciona(new Autor(2,"Maria"));
			daoAutor.adiciona(new Autor(3,"Guilherme"));
			daoAutor.adiciona(new Autor(4,"Paulo"));
	}

	public String gravar() {
		
		if (livro.getAutores().isEmpty()) {
			//throw new RuntimeException("O livro deve ter pelo menos um autor");
			FacesContext.getCurrentInstance().addMessage("autor", new FacesMessage("O livro deve possuir pelo menos um autor"));
			return "livro";
		}
		
		System.out.println("ADICIONANDO LIVRO");
		System.out.println("Titulo:" + livro.getTitulo());
		
		daoTemp.adiciona(livro);
		livro = new Livro();
		
		System.out.println("Livros:");
		System.out.println(daoTemp.getLista());
		return "livro";
	}
	
	public String gravarAutor () {
		System.out.println("iniciou gravarAutor");
		List<Autor> todosAutores = daoAutor.getLista();
		System.out.println("mensagem: recebeu lista de autores");
		System.out.println("id do autor: " + idAutor.toString());
		Autor autorParaAdicionar = todosAutores.get(idAutor);
		System.out.println("mensagem: recebeu autor com o indice adequado");
		System.out.println("Autor para adicionar: " + autorParaAdicionar);
		System.out.println("id: " + autorParaAdicionar.getId());
		livro.getAutores().add(autorParaAdicionar);
		System.out.println("encerrou gravarAutor");
		return "livro";
	}
	
	public List<Autor> getAutores() {
		return daoAutor.getLista();
	}
	

	public Livro getLivro() {
		return livro;
	}
	

	public Integer getIdAutor() {
		return idAutor;
	}
	
	public void setIdAutor(Integer idAutor) {
		this.idAutor = idAutor;
	}
	
	public List<Autor> getAutoresDoLivro () {
		return livro.getAutores();
	}
	
	public List<Livro> getTodosLivros () {
		return daoTemp.getLista();
	}
	
	public void comecaComDigitoUm (FacesContext fc, UIComponent component, Object value) throws ValidatorException {
		System.out.println("Entrou no metodo comecaComDigitoUm");
		System.out.println("Valor: " + value.toString());
		String valor = value.toString();
		if (!valor.startsWith("1") || valor.toString().isEmpty())
			throw new ValidatorException(new FacesMessage("ISBN deve começar com 1"));
	}
	
	public String formAutor() {
		System.out.println("Chamando o formulário do autor");
		return "autor?faces-redirect=true";
	}
	
	public int getQtdeLivros() {
		return getTodosLivros().size();
	}
	
	//METODOS PARA O EXEMPLO BOOK
	public void addFirstBook() {
		daoTemp.adiciona(livro);
		livro = new Livro();
	}
	
	public int getNumberOfBooks() {
		System.out.println("executou numberOfBooks");
		System.out.println("number of books:" + daoTemp.getLista().size());
		return daoTemp.getLista().size();
	}
	
	public List<Livro> getAllBooks() {
		return daoTemp.getLista();
	}
	
}
