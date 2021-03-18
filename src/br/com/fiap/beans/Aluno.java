package br.com.fiap.beans;
/*
 * Desing Patterns
 * DTO (Data Transfer Object): melhores praticas para a classe modelo
 * - TODOS os atributos devem ser privados
 * - CADA atributo deve possuir INDIVIDUALMENTE um m�todo para entrada e saida de dados
 * 
 * um m�todo getter (output) e setter(input)
 * ??????? pr�xima aula
 */
public class Aluno {
	private int rm;
	private String nome;
	private String email;
	private String fone;
	
	
	public int getRm() {
		return rm;
	}
	public void setRm(int rm) {
		this.rm = rm;
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
