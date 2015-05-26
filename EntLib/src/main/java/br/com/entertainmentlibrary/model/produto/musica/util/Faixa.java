package br.com.entertainmentlibrary.model.produto.musica.util;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

//@Entity
public class Faixa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nome;
	private int numeroDaFaixa;
	
//	@ManyToOne
//	private Midia midia;
//	@ManyToMany
//	private List<InterpreteBanda> interpretesBandas;
//	
//	
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getNome() {
//		return nome;
//	}
//	public void setNome(String nome) {
//		this.nome = nome;
//	}
//	public int getNumeroDaFaixa() {
//		return numeroDaFaixa;
//	}
//	public void setNumeroDaFaixa(int numeroDaFaixa) {
//		this.numeroDaFaixa = numeroDaFaixa;
//	}
//	public Midia getMidia() {
//		return midia;
//	}
//	public void setMidia(Midia midia) {
//		this.midia = midia;
//	}
//	public List<InterpreteBanda> getInterpretesBandas() {
//		return interpretesBandas;
//	}
//	public void setInterpretesBandas(List<InterpreteBanda> interpretesBandas) {
//		this.interpretesBandas = interpretesBandas;
//	}
	
}
