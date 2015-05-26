package br.com.entertainmentlibrary.model.avaliacao;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import br.com.entertainmentlibrary.model.produto.Produto;
import br.com.entertainmentlibrary.model.usuario.Usuario;

@Entity
public class Avaliacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int nota;
	@Column(length=3000)
	private String descricao;
	
	@ManyToOne
	private Usuario usuarioCriador;
	@ManyToOne
	private Produto produto;
	@OneToMany(mappedBy="avaliacao")
	private List<UsuarioAvaliacao> avaliacaoUtil;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Usuario getUsuarioCriador() {
		return usuarioCriador;
	}
	public void setUsuarioCriador(Usuario usuarioCriador) {
		this.usuarioCriador = usuarioCriador;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public List<UsuarioAvaliacao> getAvaliacaoUtil() {
		return avaliacaoUtil;
	}
	public void setAvaliacaoUtil(List<UsuarioAvaliacao> avaliacaoUtil) {
		this.avaliacaoUtil = avaliacaoUtil;
	}

	
}
