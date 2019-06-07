package aula8.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Chamado implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Date dataChamado;
	private String observacao;
	private Boolean aberto;
	
	@ManyToOne
	@JoinColumn(name="Chamado_Equipamento")
	private Equipamento equipamento;
	
	public  Chamado() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDataChamado() {
		return dataChamado;
	}

	public void setDataChamado(Date dataChamado) {
		this.dataChamado = dataChamado;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Boolean getAberto() {
		return aberto;
	}

	public void setAberto(Boolean aberto) {
		this.aberto = aberto;
	}

	@Override
	public String toString() {
		return "Chamado [id=" + id + ", observacao=" + observacao + ", aberto=" + aberto + "]";
	}
	
}
