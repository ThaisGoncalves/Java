/*Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.*/
package exercicios;

import java.util.Scanner;

public class Exercicio_5 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int num, soma = 0;

		System.out.println("Escreva um n�mero ");
		num = ler.nextInt();

		soma = soma + num;
		do {
			System.out.println("Escreva um n�mero ");
			num = ler.nextInt();

		} while (num > 0);

		System.out.println("A soma dos n�meros � " + soma);

	}
}
