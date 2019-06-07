package aula8.model;

import java.io.Serializable;

public class Funcionario implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;
	private String matricula;
	private String telefone;
	private String email;
	
	public void Funcionario() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + ", matricula=" + matricula + ", telefone=" + telefone
				+ ", email=" + email + "]";
	}

}
