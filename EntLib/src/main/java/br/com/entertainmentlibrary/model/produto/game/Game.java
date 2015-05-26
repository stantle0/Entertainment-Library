package br.com.entertainmentlibrary.model.produto.game;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.entertainmentlibrary.model.produto.Produto;
import br.com.entertainmentlibrary.model.produto.game.util.Plataforma;
import br.com.entertainmentlibrary.model.produto.game.util.Requisitos;

@Entity
@Table(name="PRODUTO")
@DiscriminatorValue(value="GAME")
public class Game extends Produto {
	
	@ManyToOne
	private Plataforma plataforma;
	@OneToMany(mappedBy="game")
	private List<Requisitos> requisitos;
	
	
	public Plataforma getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(Plataforma plataforma) {
		this.plataforma = plataforma;
	}
	public List<Requisitos> getRequisitos() {
		return requisitos;
	}
	public void setRequisitos(List<Requisitos> requisitos) {
		this.requisitos = requisitos;
	}


	
	
}
