package br.com.universidade.modelo;

public class Pessoa {
	
	/*
	 * Tipos de modificadores para atributos:
	 * (-) private: mais alto grau de encapsulamento
	 * (+) public: mais baixo grau de encapsulamento
	 * (~) package: permite acesso para as classes dentro do mesmo diret�rio
	 * (#) protected: permite acesso para as classes filhas
	 */

	private String nome;
	private String email;
	private String fone;
	private Endereco endereco;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, String email, String fone, Endereco endereco) {
		super();
		this.nome = nome;
		this.email = email;
		this.fone = fone;
		this.endereco = endereco;
	}
	
	public String getAll() {
		return "Nome: " + nome + "\n" +
				"E-mail: " + email + "\n" +
				"Telefone: " + fone + "\n" +
				"Logradouro: " + endereco.getLogradouro() + "\n" +
				"Bairro: " + endereco.getBairro() + "\n" +
				"Cidade: " + endereco.getCidade() + "\n" +
				"CEP: " + endereco.getCep() + "\n" +
				"N�mero: " + endereco.getNumero() + "\n" +
				"UF: " + endereco.getUf() + "\n" +
				"Complemento: " + endereco.getComplemento();
	}
	
	public void setAll(String nome, String email, String fone, Endereco endereco) {
		this.nome = nome;
		this.email = email;
		this.fone = fone;
		this.endereco = endereco;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
}
