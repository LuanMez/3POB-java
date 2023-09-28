package br.edu.faeterj;

import java.util.Date;

public class Aluno {
	private String nome;
	private String cpf;
	private String matricula;
	private Date dtNasc;
	private String endereco;
	private String cep;
	
	public Aluno(String nome, String cpf, String matricula, String dtNasc, String endereco, String cep) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.matricula = matricula;
//		this.dtNasc = dtNasc;
		this.endereco = endereco;
		this.cep = cep;
	}

	public String getMatricula() {
        return matricula;
    }
	

}
