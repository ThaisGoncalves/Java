/*Faça um programa que receba três inteiros e diga qual deles é o maior.*/
package exercicios;

import java.util.Scanner;

public class Exercicio_1 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);

		int num1, num2, num3, maior;

		System.out.println("Escreva o primeiro número: ");
		num1 = ler.nextInt();

		System.out.println("Escreva o segundo número: ");
		num2 = ler.nextInt();

		System.out.println("Escreva o terceiro número: ");
		num3 = ler.nextInt();

		if (num1 > num2) {
			if (num1 > num3) {
				System.out.println("O maior número é " + num1);
			}
		}

		else if (num2 > num1) {
			if (num2 > num3) {
				System.out.println("O maior número é " + num2);
			}

			else {
				System.out.println("O maior número é " + num3);
			}

		}
	}
}
