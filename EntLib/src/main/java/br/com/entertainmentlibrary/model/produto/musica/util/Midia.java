package br.com.entertainmentlibrary.model.produto.musica.util;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import br.com.entertainmentlibrary.model.produto.musica.Musica;

//@Entity
public class Midia {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private int numeroDaMidia;
	private TipoMidia tipoMidia;
	
//	@ManyToOne
//	private Musica musica;
//	@OneToMany(mappedBy="midia")
//	private List<Faixa> faixas;
//	
//	
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public int getNumeroDaMidia() {
//		return numeroDaMidia;
//	}
//	public void setNumeroDaMidia(int numeroDaMidia) {
//		this.numeroDaMidia = numeroDaMidia;
//	}
//	public TipoMidia getTipoMidia() {
//		return tipoMidia;
//	}
//	public void setTipoMidia(TipoMidia tipoMidia) {
//		this.tipoMidia = tipoMidia;
//	}
//	public Musica getMusica() {
//		return musica;
//	}
//	public void setMusica(Musica musica) {
//		this.musica = musica;
//	}
//	public List<Faixa> getFaixas() {
//		return faixas;
//	}
//	public void setFaixas(List<Faixa> faixas) {
//		this.faixas = faixas;
//	}
	
}
