package br.com.entertainmentlibrary.model.produto.game.util;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import br.com.entertainmentlibrary.model.produto.game.Game;

@Entity
public class Requisitos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Enumerated(EnumType.STRING)
	private TipoRequisito tipoRequisito;
	private String processador;
	private String ram;
	private String hd;
	private String placaVideo;
	private String sistemaOpeacional;
	private String conexaoInternet;

	@ManyToOne
	private Game game;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public TipoRequisito getTipoRequisito() {
		return tipoRequisito;
	}

	public void setTipoRequisito(TipoRequisito tipoRequisito) {
		this.tipoRequisito = tipoRequisito;
	}

	public String getProcessador() {
		return processador;
	}

	public void setProcessador(String processador) {
		this.processador = processador;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getHd() {
		return hd;
	}

	public void setHd(String hd) {
		this.hd = hd;
	}

	public String getPlacaVideo() {
		return placaVideo;
	}

	public void setPlacaVideo(String placaVideo) {
		this.placaVideo = placaVideo;
	}

	public String getSistemaOpeacional() {
		return sistemaOpeacional;
	}

	public void setSistemaOpeacional(String sistemaOpeacional) {
		this.sistemaOpeacional = sistemaOpeacional;
	}

	public String getConexaoInternet() {
		return conexaoInternet;
	}

	public void setConexaoInternet(String conexaoInternet) {
		this.conexaoInternet = conexaoInternet;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	

	
	
		
}
