package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String senha;
	private String tipo;

	public Usuario(String nome, String senha, tipoEnum tipo) {
		this.nome = nome;
		this.senha = senha;
		this.tipo = tipo.toString();
	}

	public Usuario() {
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getSenha() {
		return senha;
	}

	public String getTipo() {
		return tipo;
	}

}
