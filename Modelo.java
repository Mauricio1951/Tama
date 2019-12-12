package Middleware.SetupTabelas;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="modelos")
public class Modelo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
			
	@ManyToOne(fetch = FetchType.EAGER)
	private Fabricante fabricante;
	
	@Column (nullable = false)
	private String nome;
	
	@Column (nullable = false)
	private int Status;
	
	public Modelo() {
		// TODO Auto-generated constructor stub
	}

	public Modelo(String nome, Fabricante fabricante, int status) {
		super();
		this.nome = nome;
		this.fabricante=fabricante;
		Status = status;
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

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	public int getStatus() {
		return Status;
	}

	public void setStatus(int status) {
		Status = status;
	}

}
