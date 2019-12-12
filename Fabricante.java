package Middleware.SetupTabelas;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "fabricantes", schema = "middleware")
public class Fabricante {
// Fabricantes de Celular
	
	@Id
	@Column (length=45)
	private String marca;
	
	@Column (nullable = false)
	private String descri��o;
	
	@OneToMany(mappedBy = "fabricante", fetch = FetchType.LAZY)
	private List<Modelo> modelos;

	public Fabricante() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fabricante(String marca, String descri��o) {
		super();
		this.marca = marca;
		this.descri��o = descri��o;
	}

	public Fabricante(String marca) {
		super();
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDescri��o() {
		return descri��o;
	}

	public void setDescri��o(String descri��o) {
		this.descri��o = descri��o;
	}

	public List<Modelo> getModelos() {
		return modelos;
	}

	public void setModelos(List<Modelo> modelos) {
		this.modelos = modelos;
	}

	
		
	}
