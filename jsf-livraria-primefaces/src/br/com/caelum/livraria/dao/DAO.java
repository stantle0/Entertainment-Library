package br.com.caelum.livraria.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.livraria.modelo.Livro;

public class DAO<T> {
	
	private List<T> lista;

	public DAO() {
		this.lista = new ArrayList<T>();
	}

	public void adiciona(T elemento) {
		this.lista.add(elemento);
	}
	
	public List<T> getLista() {
		return lista;
	}

}
