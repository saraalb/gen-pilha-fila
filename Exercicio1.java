package exerciciosFilaPilha;

//import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		//declaraçao de variaveis
		Queue<String> clientes = new LinkedList<String>();
		String nome="";
		int opcao;
		String sair;
		Scanner leia = new Scanner(System.in);
		
		//dados de entrada / laço do while / switch / processamento / dados de saida
		do {
			System.out.println("\n╔════════════════════════╗");
	        System.out.println("║    Menu Principal      ║");
	        System.out.println("╠════════════════════════╣");
	        System.out.println("║  1 - Adicionar Cliente ║");
	        System.out.println("║  2 - Listar Clientes   ║");
	        System.out.println("║  3 - Retirar Cliente   ║");
	        System.out.println("║  0 - Sair              ║");
	        System.out.println("╚════════════════════════╝\n");
		
		
		System.out.println("\nEntre com a opção desejada: ");
		opcao = leia.nextInt();
		switch(opcao) {
		case 1:
			System.out.println("Digite o nome:");
			nome = leia.next();
			clientes.add(nome);
			System.out.println("Cliente "+nome+" Adicionado!");
			break;
		case 2:
			if(!clientes.isEmpty()) {
			System.out.println("Lista de clientes na Fila:");
			for(String cliente: clientes) {
				System.out.println(cliente);
			}
			}else {
				System.out.println("Lista vazia!");
			} 
			/*Iterator<String> iterator = clientes.iterator();
			while(iterator.hasNext()) {
				System.out.println(iterator.next());
			}*/
			break;
		case 3:
			if(!clientes.isEmpty()) {
				String removido = clientes.poll();
				System.out.println("O cliente "+removido+" foi chamado.");
			} else {
				System.out.println("Fila vazia!");
			} 
			break;
		case 0:
			clientes.clear();
			System.out.println("Programa finalizado!");
			break;
		default:
			System.out.println("Insira um valor válido.");
		}
		} while(opcao!=0);

	}
}

