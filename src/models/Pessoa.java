package models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Pessoa {

	@Id
	@GeneratedValue
	private int id;
	@Column
	private String nome;
	@Column
	private String telefone;
	@Column
	private String email;

	public Pessoa(String nome, String telefone, String email) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "Nome: "+this.getNome()+", Telefone: "+this.getTelefone()+", E-mail: "+this.getEmail();
	}

}
