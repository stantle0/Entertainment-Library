package br.com.caelum.livraria.bean;

import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class TemaBean {
	
	public String tema = "aristo";
//	public String tema = "aristo";

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}
	
	public List<String> getTemas() {
		return Arrays.asList("aristo", "sunny", "black-tie", "vader");
	}
}
