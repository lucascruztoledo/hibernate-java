package aula8.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class TipoEquipamento implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 

	private String nomeTipoEq;
	
	@ManyToOne
	@JoinColumn(name="TipoEquipamento_Equipamento")
	private Equipamento equipamento;
	
	public TipoEquipamento() {
		
	}

	public String getNomeTipoEq() {
		return nomeTipoEq;
	}

	public void setNomeTipoEq(String nomeTipoEq) {
		this.nomeTipoEq = nomeTipoEq;
	}

	@Override
	public String toString() {
		return "TipoEquipamento [nomeTipoEq=" + nomeTipoEq + "]";
	}
	
	
}

