package exercicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Estoque_loja {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		Collection<String> produtos = new ArrayList();
		produtos.add("PROTEÍNA DE SOJA");
		produtos.add("PÃO DE MEL HUE");
		produtos.add("CHÁ VERDE");
		produtos.add("PAÇOQUINHA");

		System.out.println("\tDigite uma opção: ");
		System.out.println("\n(1)Deseja adicionar produto ao estoque");
		System.out.println("\n(2)Deseja remover um produto do estoque");
		System.out.println("\n(3)Atualizar algum produto do estoque");
		System.out.println("\n(4)Mostrar todos os produtos do estoque");
		System.out.println("\n(0)Encerrar programa.");
		int op = input.nextInt();
		String newProduto;

		do {

			switch (op) {
			case 1:
				System.out.println("Digite o nome do novo produTo: ");
				newProduto = input.nextLine();
				produtos.add(newProduto);
				break;

			case 2:
				System.out.println("Digite o nome do produto para remoÇão:");
				String verifica = input.nextLine();
				if (produtos.contains(verifica)) {
					produtos.remove(verifica);
				}
			}
			break;
		} while (op > 4 && op < 1);

	}

}
