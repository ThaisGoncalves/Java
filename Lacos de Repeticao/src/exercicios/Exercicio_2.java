//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.//
package exercicios;

import java.util.Scanner;

public class Exercicio_2 {
	public static void main(String args[]) {

		Scanner ler = new Scanner(System.in);

		int num, par = 0, impar = 0, i;

		for (i = 1; i <= 10; i++) {

			System.out.println("Digite o " + i + "� n�mero");
			num = ler.nextInt();

			if (num % 2 == 0) {
				par++;
			}

			else {
				impar++;
			}
		}
		System.out.println("Foram digitados " + par + " n�meros pares \n");
		System.out.println("E " + impar + " n�meros �mpares");
	}
}
