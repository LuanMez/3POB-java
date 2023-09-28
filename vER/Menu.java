package br.edu.faeterj;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Menu {
	private ArrayList<Aluno> alunos = new ArrayList();
	private int opcao = 0;
	private int num;
	private String mat;
	
	public void Processamento() {
		String nome = "";
		String cpf;
		Date dtNasc;
		String dtAux;
		String matricula;
		String endereco;
		String cep;
		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.println("Digite 1 para incluir um aluno");
			System.out.println("Digite 2 para excluir um aluno");
			System.out.println("Digite 3 para alterar um aluno");
			System.out.println("Digite 4 para listar");
			System.out.println("Digite 0 para sair do programa");
			opcao=sc.next();
			
			switch(opcao){
				case 1:
					System.out.println("Digite seu primeiro nome ");
					nome = sc.next();
					System.out.println("o nome digitado é: " + nome);
					System.out.println("Digite seu CPF (somente os numeros): ");
					cpf = sc.next();
					System.out.println("Seu CPF é: " + cpf);
					System.out.println("Digite sua data de nascimento: dd/mm/aaaa: ");
					dtAux = sc.next();
			//		dtNasc = sc.next();
					System.out.println("sua data de nascimento é: " + dtAux);
			//		dtNasc = LocalDateTime.parse();
					System.out.println("Digite sua matricula: ");
					matricula = sc.next();
					System.out.println("Digite seu Endereço: ");
					endereco = sc.next();
					System.out.println("valor de endereco: " + endereco);
					System.out.println("Digite seu CEP (somente os numeros): ");
					cep = sc.next();
					System.out.println("valor de cep: " + cep);
					
					Aluno aluno = new Aluno(nome, cpf, matricula, dtAux, endereco, cep);
					
					alunos.add(aluno);
					break;

					case 2:
					System.out.println("Digite a matrícula do aluno a ser excluído: ");
					mat = sc.next();
					for (int i = 0; i < alunos.size(); i++) {
						if (alunos.get(i).getMatricula().equals(mat)) {
							alunos.remove(i);
							System.out.println("Aluno removido com sucesso.");
							break;
						}
					}
					break;
				
				case 3:
					System.out.println("Digite a matrícula do aluno a ser alterado: ");
					mat = sc.next();
					for (int i = 0; i < alunos.size(); i++) {
						if (alunos.get(i).getMatricula().equals(mat)) {
							System.out.println("Digite o novo nome: ");
							nome = sc.next();
							System.out.println("Digite o novo CPF (somente números): ");
							cpf = sc.next();
							System.out.println("Digite a nova data de nascimento (dd/mm/aaaa): ");
							dtAux = sc.next();
							System.out.println("Digite o novo endereço: ");
							endereco = sc.next();
							System.out.println("Digite o novo CEP (somente números): ");
							cep = sc.next();
				
							Aluno novoAluno = new Aluno(nome, cpf, mat, dtAux, endereco, cep);
							alunos.set(i, novoAluno);
							System.out.println("Aluno alterado com sucesso.");
						}
					}
					break;
				
				case 4:
					System.out.println("Lista de Alunos:");
					for (Aluno a : alunos) {
						System.out.println(a.toString());
					}
				}
			
		}while(opcao!=0);
	}

}
