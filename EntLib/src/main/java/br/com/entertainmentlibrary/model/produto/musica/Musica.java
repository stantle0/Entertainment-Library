package br.com.entertainmentlibrary.model.produto.musica;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import br.com.entertainmentlibrary.model.produto.Produto;
import br.com.entertainmentlibrary.model.produto.musica.util.InterpreteBanda;

@Entity
@Table(name="PRODUTO")
@DiscriminatorValue(value="MUSICA")
public class Musica extends Produto {
	
	private String duracao;
	@Column(length=2000)
	private String escutarOnline;
		
	@ManyToMany
	private List<InterpreteBanda> interpretesBandas;
//	@OneToMany(mappedBy="musica")
//	private List<Midia> midias;
//	
//	
//	public String getDuracao() {
//		return duracao;
//	}
//	public void setDuracao(String duracao) {
//		this.duracao = duracao;
//	}
//	public String getEscutarOnline() {
//		return escutarOnline;
//	}
//	public void setEscutarOnline(String escutarOnline) {
//		this.escutarOnline = escutarOnline;
//	}
//	public int getNumeroDeMidias() {
//		return numeroDeMidias;
//	}
//	public void setNumeroDeMidias(int numeroDeMidias) {
//		this.numeroDeMidias = numeroDeMidias;
//	}
//	public List<InterpreteBanda> getInterpretesBandas() {
//		return interpretesBandas;
//	}
//	public void setInterpretesBandas(List<InterpreteBanda> interpretesBandas) {
//		this.interpretesBandas = interpretesBandas;
//	}
//	public List<Midia> getMidias() {
//		return midias;
//	}
//	public void setMidias(List<Midia> midias) {
//		this.midias = midias;
//	}
	
	
	
	
}
