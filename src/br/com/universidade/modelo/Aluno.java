package br.com.universidade.modelo;

public class Aluno extends Pessoa{
	
	private int rm;
	//private String nome;
	//private String email;
	//private String fone;
	private String dtMatricula;
	
	public Aluno() {
			super();
		
	}
	
	public Aluno(int rm, String nome, String email, String fone, String dtMatricula, Endereco endereco) {
		this.rm = rm;
		super.setAll(nome, email, fone, endereco);
		this.dtMatricula = dtMatricula;
	}
	
	public void setAll(int rm, String nome, String email, String fone, String dtMatricula, Endereco endereco) {
		this.rm = rm;
		super.setAll(nome, email, fone, endereco);
		this.dtMatricula = dtMatricula;
	}
	
	public String getAll() {
		return "RM: " + rm + "\n" +
				super.getAll() + "\n" +
				"Data de Matrícula: " + dtMatricula + "\n";
	}
	
	public int getRm() {
		return rm;
	}
	public void setRm(int rm) {
		this.rm = rm;
	}

	public String getDtMatricula() {
		return dtMatricula;
	}
	public void setDtMatricula(String dtMatricula) {
		this.dtMatricula = dtMatricula;
	}

}
