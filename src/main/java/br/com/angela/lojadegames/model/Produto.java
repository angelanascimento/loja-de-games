package br.com.angela.lojadegames.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


@Entity
@Table(name = "tb_produtos")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Size(max = 100, message = "O campo título deve conter no máximo 100 caracteres")
	private String titulo;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;
	
	@NotBlank
	@Size(max = 100, message = "O campo desenvolvedor deve conter no máximo 100 caracteres")
	private String desenvolvedor;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getDesenvolvedor() {
		return desenvolvedor;
	}

	public void setDesenvolvedor(String desenvolvedor) {
		this.desenvolvedor = desenvolvedor;
	}

}
