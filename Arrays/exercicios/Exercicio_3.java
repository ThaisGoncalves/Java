//Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.//

package exercicios;

import java.util.*;

public class Exercicio_3 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int[][] matriz = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("Insira o número da linha " + (i + 1) + " e da coluna " + (j + 1) + ": ");
				matriz[i][j] = ler.nextInt();
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf(" [" + matriz[i][j] + "] ");
			}

			System.out.println();
		}
	}
}
