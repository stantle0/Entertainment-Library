package br.com.caelum.livraria.modelo;

public class Autor {
	
	private int id;
	private String nome;
	
	public Autor () {}
	
	public Autor(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	@Override
	public String toString() {
		return this.nome;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
