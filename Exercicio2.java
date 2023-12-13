package exerciciosFilaPilha;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio2 {

	public static void main(String[] args) {
		Stack<String> pilha = new Stack<String>();
		int opcao;
		String livro, retirado;
		Scanner leia = new Scanner(System.in);
		
		do {
	        System.out.println("\n╔════════════════════════╗");
	        System.out.println("║   Menu de Livros       ║");
	        System.out.println("╠════════════════════════╣");
	        System.out.println("║ 1 - Adicionar livros   ║");
	        System.out.println("║ 2 - Listar todos       ║");
	        System.out.println("║ 3 - Retirar livro      ║");
	        System.out.println("║ 0 - Sair               ║");
	        System.out.println("╚════════════════════════╝\n");
		
		System.out.println("\nEntre com a opção desejada:");
		opcao = leia.nextInt();
		
		switch(opcao) {
		case 1:
			System.out.println("Digite o nome:");
			livro = leia.next();
			pilha.push(livro);
			System.out.println("Livro "+livro+" adicionado!");
			break;
		case 2:
			if(!pilha.isEmpty()) {
			System.out.println("\nLista de livros na p1ilha:");
			for (String livros:pilha) {
				System.out.println(livros);
			} 
			} else {
				System.out.println("Pilha vazia!");
			}
			break;
		case 3: 
			if(!pilha.isEmpty()) {
				retirado = pilha.pop();
				System.out.println("Pilha:");
				for (String livros:pilha) {
					System.out.println(livros);
				}
				System.out.println("O livro "+retirado+" foi retirado da pilha!");
			} else {
				System.out.println("A pilha está vazia!");
			}	
			break;
		case 0:
			System.out.println("Programa finalizado.");
			break;
		default:
			System.out.println("Digite uma opção válida.");	
		}
		} while(opcao!=0);

}
}


