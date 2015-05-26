package br.com.entertainmentlibrary.model.usuario;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import br.com.entertainmentlibrary.model.avaliacao.Avaliacao;
import br.com.entertainmentlibrary.model.avaliacao.UsuarioAvaliacao;
import br.com.entertainmentlibrary.model.produto.Produto;
import br.com.entertainmentlibrary.model.util.Cidade;

@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nome;
	private String email;
	
	@ManyToOne
	private Cidade cidade;
	@OneToMany(mappedBy="usuario")
	private List<Produto> produtos;
	@OneToMany(mappedBy="usuarioCriador")
	private List<Avaliacao> avaliacoes;
	@OneToMany(mappedBy="usuario")
	private List<UsuarioAvaliacao> avaliacoesUteis;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	public List<Avaliacao> getAvaliacoes() {
		return avaliacoes;
	}
	public void setAvaliacoes(List<Avaliacao> avaliacoes) {
		this.avaliacoes = avaliacoes;
	}
	public List<UsuarioAvaliacao> getAvaliacoesUteis() {
		return avaliacoesUteis;
	}
	public void setAvaliacoesUteis(List<UsuarioAvaliacao> avaliacoesUteis) {
		this.avaliacoesUteis = avaliacoesUteis;
	}

	
	

}
