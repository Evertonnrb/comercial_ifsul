package br.com.comercial.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="tbl_pais")
public class Pais implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO	)
	@Column(name="id_pais",nullable=false)
	private Long id;
	
	@NotBlank(message="campo nome precisa ser preenchido")
	@NotNull(message="campo nao pode ser nulo")
	@Column(name="nome_pais",length=100,nullable=false)
	private String nome;

	@NotBlank(message="Iso deve ser informada")
	@NotNull(message="Iso não deve ser nulo")
	@Length(min=3,max=3,message="Campo iso deve ter {max} caracteres")
	@Column(name="iso_pais",length=3,nullable=false)
	private String iso;

	public Pais(){}
		
	public Pais(Long id, String nome, String iso) {
		super();
		this.id = id;
		this.nome = nome;
		this.iso = iso;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIso() {
		return iso;
	}

	public void setIso(String iso) {
		this.iso = iso;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pais other = (Pais) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pais [id=" + id + ", nome=" + nome + ", iso=" + iso + "]";
	}
	
}
