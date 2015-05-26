package br.com.entertainmentlibrary.model.produto.livro;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.entertainmentlibrary.model.produto.Produto;
import br.com.entertainmentlibrary.model.produto.livro.util.Acabamento;
import br.com.entertainmentlibrary.model.produto.livro.util.Autor;

@Entity
@Table(name="PRODUTO")
@DiscriminatorValue(value="LIVRO")
public class Livro extends Produto {
	
	private String edicao;
	private int paginas;
	
	@ManyToOne
	private Acabamento acabamento;
	@ManyToMany
	private List<Autor> autores;
	
	
	public String getEdicao() {
		return edicao;
	}
	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	public Acabamento getAcabamento() {
		return acabamento;
	}
	public void setAcabamento(Acabamento acabamento) {
		this.acabamento = acabamento;
	}
	public List<Autor> getAutores() {
		return autores;
	}
	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}
	

}
