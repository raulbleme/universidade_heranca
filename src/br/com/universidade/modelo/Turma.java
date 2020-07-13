package br.com.universidade.modelo;

public class Turma {

	private int codigo;
	private String nome;
	private Curso curso;
	private String sala;
	private Aluno aluno;
	
	public Turma() {
		
	}
	
	public Turma(int codigo, String nome, Curso curso, String sala, Aluno aluno) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.curso = curso;
		this.sala = sala;
		this.aluno = aluno;
	}
	
	public void setAll(int codigo, String nome, Curso curso, String sala, Aluno aluno) {
		this.codigo = codigo;
		this.nome = nome;
		this.curso = curso;
		this.sala = sala;
		this.aluno = aluno;
	}

	public String getAll() {
		return "Codigo: " + codigo + "\n" +
				"Nome: " + nome + "\n" +
				"Curso: " + curso.getDescricao() + "\n" +
				"Sala: " + sala + "\n" +
				"Aluno: " + aluno.getNome() ;
	}
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public String getSala() {
		return sala;
	}
	public void setSala(String sala) {
		this.sala = sala;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	
}
