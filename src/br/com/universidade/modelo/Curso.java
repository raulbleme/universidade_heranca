package br.com.universidade.modelo;

public class Curso {
	
	private String descricao;
	private String nivel;
	private int duracao;
	private String periodo;
	private float mensalidade;
	
	public Curso() {
		
	}
	
	public Curso(String descricao, String nivel, int duracao, String periodo, float mensalidade) {
		this.descricao = descricao;
		this.nivel = nivel;
		this.duracao = duracao;
		this.periodo = periodo;
		this.mensalidade = mensalidade;
	}
	
	public void setAll(String descricao, String nivel, int duracao, String periodo, float mensalidade) {
		this.descricao = descricao;
		this.nivel = nivel;
		this.duracao = duracao;
		this.periodo = periodo;
		this.mensalidade = mensalidade;
	}
	
	public String getAll() {
		return "Descrição: " + descricao + "\n" +
				"Nível: " + nivel + "\n" +
				"Duração: " + duracao + "\n" +
				"Período: " + periodo + "\n" +
				"Mensalidade: " + mensalidade;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public float getMensalidade() {
		return mensalidade;
	}
	public void setMensalidade(float mensalidade) {
		this.mensalidade = mensalidade;
	}
	
	

}
