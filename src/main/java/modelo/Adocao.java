package modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Adocao implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_adocao")
	private Long id;
	
	private String nomeAnunciante;
    private String cpf;
    private String telefone;
    private String endereco;
    private String numCasa;

    private String nomeAnimal;
    private String descricaoAnimal;
    private String especie;
    private String porte;
    private String peso;
    private String pelagem;
    private String raca;
    private String sexo;
    private String castrado;
    private String idade;
    
    public Adocao(){
    	
    }

	public Adocao(Long id, String nomeAnunciante, String cpf, String telefone, String endereco, String numCasa,
			String nomeAnimal, String descricaoAnimal, String especie, String porte, String peso, String pelagem,
			String raca, String sexo, String castrado, String idade) {
		super();
		this.id = id;
		this.nomeAnunciante = nomeAnunciante;
		this.cpf = cpf;
		this.telefone = telefone;
		this.endereco = endereco;
		this.numCasa = numCasa;
		this.nomeAnimal = nomeAnimal;
		this.descricaoAnimal = descricaoAnimal;
		this.especie = especie;
		this.porte = porte;
		this.peso = peso;
		this.pelagem = pelagem;
		this.raca = raca;
		this.sexo = sexo;
		this.castrado = castrado;
		this.idade = idade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeAnunciante() {
		return nomeAnunciante;
	}

	public void setNomeAnunciante(String nomeAnunciante) {
		this.nomeAnunciante = nomeAnunciante;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumCasa() {
		return numCasa;
	}

	public void setNumCasa(String numCasa) {
		this.numCasa = numCasa;
	}

	public String getNomeAnimal() {
		return nomeAnimal;
	}

	public void setNomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}

	public String getDescricaoAnimal() {
		return descricaoAnimal;
	}

	public void setDescricaoAnimal(String descricaoAnimal) {
		this.descricaoAnimal = descricaoAnimal;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getPelagem() {
		return pelagem;
	}

	public void setPelagem(String pelagem) {
		this.pelagem = pelagem;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCastrado() {
		return castrado;
	}

	public void setCastrado(String castrado) {
		this.castrado = castrado;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}
    
    
    
    



}
