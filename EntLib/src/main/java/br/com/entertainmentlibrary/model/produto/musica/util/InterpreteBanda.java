package br.com.entertainmentlibrary.model.produto.musica.util;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import br.com.entertainmentlibrary.model.produto.musica.Musica;

@Entity
public class InterpreteBanda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nome;
	@Column(length=2000)
	private String foto_perfil;
	
//	@ManyToMany(mappedBy="interpretesBandas")
//	private List<Faixa> faixas;
	@ManyToMany(mappedBy="interpretesBandas")
	private List<Musica> musicas;
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
//	public String getFoto_perfil() {
//		return foto_perfil;
//	}
//	public void setFoto_perfil(String foto_perfil) {
//		this.foto_perfil = foto_perfil;
//	}
//	public List<Faixa> getFaixas() {
//		return faixas;
//	}
//	public void setFaixas(List<Faixa> faixas) {
//		this.faixas = faixas;
//	}
//	public List<Musica> getMusicas() {
//		return musicas;
//	}
//	public void setMusicas(List<Musica> musicas) {
//		this.musicas = musicas;
//	}
	
	
	

}