package br.com.caelum.livraria.modelo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Livro {
	private String titulo;
	private String isbn;
	private double preco;
	private Calendar data;
	private List<Autor> autores;
	
	
	public Livro() {
		autores = new ArrayList<Autor>();
		data = Calendar.getInstance();
	}
	
	@Override
	public String toString() {
		return "\nlivro com titulo: " + titulo + "\n"
				+ "autores do livro: " + autores.toString();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public List<Autor> getAutores() {
		return this.autores;
	}

	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}
}