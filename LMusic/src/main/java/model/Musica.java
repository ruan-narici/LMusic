package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Musica {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String artista;
	private String dataLancamento;
	private String genero;
	@ManyToOne
	private Usuario proprietario;

	public Musica(String nome, String artista, String dataLancamento, String genero, Usuario proprietario) {
		super();
		this.nome = nome;
		this.artista = artista;
		this.dataLancamento = dataLancamento;
		this.genero = genero;
		this.proprietario = proprietario;
	}

	public Musica() {
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getArtista() {
		return artista;
	}

	public String getDataLancamento() {
		return dataLancamento;
	}

	public String getGenero() {
		return genero;
	}

	public Usuario getProprietario() {
		return proprietario;
	}

}
