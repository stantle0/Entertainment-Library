package br.com.entertainmentlibrary.model.produto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.entertainmentlibrary.model.avaliacao.Avaliacao;
import br.com.entertainmentlibrary.model.produto.util.EmpresaVinculada;
import br.com.entertainmentlibrary.model.produto.util.Genero;
import br.com.entertainmentlibrary.model.produto.util.Idioma;
import br.com.entertainmentlibrary.model.produto.util.Tag;
import br.com.entertainmentlibrary.model.usuario.Usuario;
import br.com.entertainmentlibrary.model.util.Pais;

@Entity
@Table(name="PRODUTO")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
		name = "tipo_produto",
		discriminatorType=DiscriminatorType.STRING
)
@DiscriminatorValue(value="PRODUTO")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nome;
	@Column(length = 4000)
	private String descricao;
	@Column(length = 2000)
	private String fotoLibraryURL;
	@Column(length = 2000)
	private String fotoPerfilURL;
	private int ano;
	private boolean wishlist;
	
	//TODO
//	@OneToMany(mappedBy="produto")
//	private List<UrlImg> fotoProduto;
//	@OneToMany(mappedBy="produto")
//	private List<UrlVideo> videoProduto;
	@ManyToOne
	private Usuario usuario;
	@ManyToMany
	private List<Pais> paises;
	@ManyToMany
	private List<Tag> tags;
	@ManyToMany
	private List<EmpresaVinculada> empresasVinculadas;
	@ManyToMany
	private List<Genero> generos;
	@ManyToMany
	private List<Idioma> idiomas;
	@OneToMany(mappedBy="produto")
	private List<Avaliacao> avaliacoes;
	
	
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
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getFotoLibraryURL() {
		return fotoLibraryURL;
	}
	public void setFotoLibraryURL(String fotoLibraryURL) {
		this.fotoLibraryURL = fotoLibraryURL;
	}
	public String getFotoPerfilURL() {
		return fotoPerfilURL;
	}
	public void setFotoPerfilURL(String fotoPerfilURL) {
		this.fotoPerfilURL = fotoPerfilURL;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public boolean isWishlist() {
		return wishlist;
	}
	public void setWishlist(boolean wishlist) {
		this.wishlist = wishlist;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public List<Pais> getPaises() {
		return paises;
	}
	public void setPaises(List<Pais> paises) {
		this.paises = paises;
	}
	public List<Tag> getTags() {
		return tags;
	}
	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}
	public List<EmpresaVinculada> getEmpresasVinculadas() {
		return empresasVinculadas;
	}
	public void setEmpresasVinculadas(List<EmpresaVinculada> empresasVinculadas) {
		this.empresasVinculadas = empresasVinculadas;
	}
	public List<Genero> getGeneros() {
		return generos;
	}
	public void setGeneros(List<Genero> generos) {
		this.generos = generos;
	}
	public List<Idioma> getIdiomas() {
		return idiomas;
	}
	public void setIdiomas(List<Idioma> idiomas) {
		this.idiomas = idiomas;
	}
	public List<Avaliacao> getAvaliacoes() {
		return avaliacoes;
	}
	public void setAvaliacoes(List<Avaliacao> avaliacoes) {
		this.avaliacoes = avaliacoes;
	}

	
	

	
}
