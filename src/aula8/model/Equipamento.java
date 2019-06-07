package aula8.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Equipamento implements Serializable{

	private static final long serialVersionUID = 1L;
			
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	
	private Integer id;
	private String modelo;
	private String marca;
	
	@OneToMany(mappedBy="Equipamento")
	 private List<TipoEquipamento> tipoEquipamento = new ArrayList<>();
	
	public Equipamento() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Equipamento [id=" + id + ", modelo=" + modelo + ", marca=" + marca + "]";
	}

	
}
