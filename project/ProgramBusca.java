package project;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import entites.People;

public class ProgramBusca {

	public static void main(String[] args) {
		int opcao;
		boolean continua = true;
		Scanner teclado = new Scanner(System.in);
		List<People> pessoas = new ArrayList<>();
		while (continua) {
			// Menu
			System.out.printf("\n\nOp��es:" + "\n1)Adicionar Pessoa" + "\n2)Remover Pessoa" + "\n3)Buscar Pessoa"
					+ "\n4)Imprimir Lista" + "\n5)Sair" + "\nOp��o:");
			opcao = teclado.nextInt();
			teclado.nextLine();
			switch (opcao) {
			case 1:
				System.out.printf("Nome:");
				String nome = teclado.nextLine();
				System.out.printf("CPF:");
				String cpf = teclado.nextLine();
				System.out.printf("telefone:");
				String tel = teclado.nextLine();
				People aux = new People(nome, tel, cpf);
				pessoas.add(aux);
				break;
			case 2:
				System.out.println("Remover por NOME | INICIAL | POSI��O: ");
				String remover = teclado.nextLine().toUpperCase();
				switch (remover) {
				case "NOME":
					System.out.printf("\nNome:");
					nome = teclado.nextLine();
					pessoas.removeIf(x -> nome.equals(x.getNome()));
					break;
				case "INICIAL":
					System.out.printf("\nInicial:");
					nome = teclado.nextLine();
					pessoas.removeIf(k -> k.getNome().charAt(0) == nome.charAt(0));
					break;
				case "POSI��O":
					System.out.printf("\nPosi��o:");
					int posicao = teclado.nextInt();
					teclado.nextLine();
					if (posicao < pessoas.size() && posicao >= 0)
						pessoas.remove(posicao);
					break;
				default:
					System.out.println("\nERRO....\n");
				}
				break;
			case 3:
				System.out.printf("\nBusca por: Nome | CPF | Posi��o:");
				String busca = teclado.nextLine().toUpperCase();
				switch (busca) {
				case "NOME":
					System.out.printf("Nome:");
					String buscaNome = teclado.nextLine();
					for (People x: pessoas){
						if(x.getNome().equals(buscaNome)) System.out.println("______________\n"+x.toString()+"\n");
					}
					break;
				case "CPF":
					System.out.printf("CPF:");
					String buscaCPF = teclado.nextLine();
					for (People x: pessoas){
						if(x.getCpf().equals(buscaCPF)) System.out.println("______________\n"+x.toString()+"\n");
					}
					break;
				case "POSI��O":
					System.out.printf("Posi��o:");
					int buscaPosicao = teclado.nextInt();
					for(int i=0;i<pessoas.size() || i==buscaPosicao;i++){
						if(i==buscaPosicao) System.out.println("______________\n"+pessoas.toString()+"\n");
					}
					
					break;
				}
				break;
			case 4:
				System.out.printf("\nLista:");
				for (People x : pessoas) {
					System.out.println("\n--------------\n" + x.toString());
				}
				break;
			case 5:
				continua = false;
				break;
			default:
				System.out.printf("\nOp��o Invalida...\n\n");
			}
		}

		teclado.close();
	}

}
