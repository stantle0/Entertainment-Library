package br.com.entertainmentlibrary.model.avaliacao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import br.com.entertainmentlibrary.model.usuario.Usuario;

@Entity
public class UsuarioAvaliacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private boolean util;
	
	@ManyToOne
	private Usuario usuario;
	@ManyToOne
	private Avaliacao avaliacao;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isUtil() {
		return util;
	}
	public void setUtil(boolean util) {
		this.util = util;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Avaliacao getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(Avaliacao avaliacao) {
		this.avaliacao = avaliacao;
	}

}
