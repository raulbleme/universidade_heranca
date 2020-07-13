package br.com.universidade.modelo;

public class Professor extends Pessoa {

	private String cpf;
	private String dtContratacao;
	private float valorHora;
	
	public Professor() {
		super();
	}

	public Professor(String nome, String email, String fone, Endereco endereco, String cpf, String dtContratacao,
			float valorHora) {
		super(nome, email, fone, endereco);
		this.cpf = cpf;
		this.dtContratacao = dtContratacao;
		this.valorHora = valorHora;
	}
	
	public void setAll(String nome, String email, String fone, Endereco endereco, String cpf, String dtContratacao,
			float valorHora) {
		super.setAll(nome, email, fone, endereco);
		this.cpf = cpf;
		this.dtContratacao = dtContratacao;
		this.valorHora = valorHora;
	}
	
	public String getAll() {
		return
				//super.getAll() + "\n" +
				getNome() + "\n" +    //métodos getNome() e getEmail() são da classe Pessoa
				getEmail() + "\n" +   //tomar cuidado para não haver conflito com nome dos métodos em pai e filho.
				"CPF: " + cpf + "\n" +
				"Contratação: " + dtContratacao + "\n" +
				"CPF: " + cpf + "\n";
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getDtContratacao() {
		return dtContratacao;
	}
	public void setDtContratacao(String dtContratacao) {
		this.dtContratacao = dtContratacao;
	}
	public float getValorHora() {
		return valorHora;
	}
	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}
	
	
	
}
