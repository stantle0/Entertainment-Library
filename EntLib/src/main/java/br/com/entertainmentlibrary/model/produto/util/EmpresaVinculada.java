package br.com.entertainmentlibrary.model.produto.util;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import br.com.entertainmentlibrary.model.produto.Produto;

@Entity
public class EmpresaVinculada {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nome;
	@Column(length=2000)
	private String fotoLogoURL;
	@Enumerated(EnumType.STRING)
	private TipoEmpresa tipoEmpresa;
	
	@ManyToMany(mappedBy="empresasVinculadas")
	private List<Produto> produtos;

	
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

	public String getFotoLogoURL() {
		return fotoLogoURL;
	}

	public void setFotoLogoURL(String fotoLogoURL) {
		this.fotoLogoURL = fotoLogoURL;
	}

	public TipoEmpresa getTipoEmpresa() {
		return tipoEmpresa;
	}

	public void setTipoEmpresa(TipoEmpresa tipoEmpresa) {
		this.tipoEmpresa = tipoEmpresa;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}



}
