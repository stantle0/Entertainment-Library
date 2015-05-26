package br.com.entertainmentlibrary.model.produto.game.util;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import br.com.entertainmentlibrary.model.produto.game.Game;

@Entity
public class Plataforma {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nome;
	@Column(length=2000)
	private String fotoLogo;
	
	@OneToMany(mappedBy="plataforma")
	private List<Game> game;

	
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

	public String getFotoLogo() {
		return fotoLogo;
	}

	public void setFotoLogo(String fotoLogo) {
		this.fotoLogo = fotoLogo;
	}

	public List<Game> getGame() {
		return game;
	}

	public void setGame(List<Game> game) {
		this.game = game;
	}
	
}
