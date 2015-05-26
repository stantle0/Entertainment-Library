package br.com.entertainmentlibrary.model.util;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import br.com.entertainmentlibrary.model.produto.Produto;

//@Entity
public class UrlImg {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String url;
	
//	@ManyToOne
//	private Produto produto;
//	
//	
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getUrl() {
//		return url;
//	}
//	public void setUrl(String url) {
//		this.url = url;
//	}
//	public Produto getProduto() {
//		return produto;
//	}
//	public void setProduto(Produto produto) {
//		this.produto = produto;
//	}
	
	

}
