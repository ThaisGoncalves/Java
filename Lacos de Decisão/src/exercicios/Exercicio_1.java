/*Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.*/
package exercicios;

import java.util.Scanner;

public class Exercicio_1 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);

		int num1, num2, num3, maior;

		System.out.println("Escreva o primeiro n�mero: ");
		num1 = ler.nextInt();

		System.out.println("Escreva o segundo n�mero: ");
		num2 = ler.nextInt();

		System.out.println("Escreva o terceiro n�mero: ");
		num3 = ler.nextInt();

		if (num1 > num2) {
			if (num1 > num3) {
				System.out.println("O maior n�mero � " + num1);
			}
		}

		else if (num2 > num1) {
			if (num2 > num3) {
				System.out.println("O maior n�mero � " + num2);
			}

			else {
				System.out.println("O maior n�mero � " + num3);
			}

		}
	}
}
