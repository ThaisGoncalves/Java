//Faça um programa que entre com três números e coloque em ordem crescente.//

package exercicios;

import java.util.Scanner;

public class Exercicio_2 {
	public static void main(String args[])

	{
		Scanner ler = new Scanner(System.in);

		int a, b, c;

		System.out.println("Escreva três números inteiros distintos");

		System.out.println("Entre com o primeiro número ");
		a = ler.nextInt();

		System.out.println("Entre com o segundo número ");
		b = ler.nextInt();

		System.out.println("Entre com o terceiro número ");
		c = ler.nextInt();

		if (a > b && b > c) {
			System.out.println("O maior número é " + a);
			System.out.println("O maior segundo é " + b);
			System.out.println("O menor número é " + c);
		}

		else if (a > b && c > b) {
			System.out.println("O maior número é " + a);
			System.out.println("O maior segundo é " + c);
			System.out.println("O menor número é " + b);
		}

		else if (b > a && a > c) {
			System.out.println("O maior número é " + b);
			System.out.println("O maior segundo é " + a);
			System.out.println("O menor número é " + c);
		}

		else if (b > a && c > a) {
			System.out.println("O maior número é " + b);
			System.out.println("O maior segundo é " + c);
			System.out.println("O menor número é " + a);
		}

		else if (c > a && b > a) {
			System.out.println("O maior número é " + c);
			System.out.println("O maior segundo é " + b);
			System.out.println("O menor número é " + a);

		}

		else if (c > a && a > b) {
			System.out.println("O maior número é " + c);
			System.out.println("O maior segundo é " + a);
			System.out.println("O menor número é " + b);

		} else {
			System.out.println("Entre com números inteiros distintos");
		}
	}
}