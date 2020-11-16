/*Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.*/
package exercicios;

import java.util.Scanner;

public class Exercicio_5 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int num, soma = 0;

		System.out.println("Escreva um número ");
		num = ler.nextInt();

		soma = soma + num;
		do {
			System.out.println("Escreva um número ");
			num = ler.nextInt();

		} while (num > 0);

		System.out.println("A soma dos números é " + soma);

	}
}
