//Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.//

package exercicios;

import java.util.Scanner;

public class Exercicio_2 {
	public static void main(String args[])

	{
		Scanner ler = new Scanner(System.in);

		int a, b, c;

		System.out.println("Escreva tr�s n�meros inteiros distintos");

		System.out.println("Entre com o primeiro n�mero ");
		a = ler.nextInt();

		System.out.println("Entre com o segundo n�mero ");
		b = ler.nextInt();

		System.out.println("Entre com o terceiro n�mero ");
		c = ler.nextInt();

		if (a > b && b > c) {
			System.out.println("O maior n�mero � " + a);
			System.out.println("O maior segundo � " + b);
			System.out.println("O menor n�mero � " + c);
		}

		else if (a > b && c > b) {
			System.out.println("O maior n�mero � " + a);
			System.out.println("O maior segundo � " + c);
			System.out.println("O menor n�mero � " + b);
		}

		else if (b > a && a > c) {
			System.out.println("O maior n�mero � " + b);
			System.out.println("O maior segundo � " + a);
			System.out.println("O menor n�mero � " + c);
		}

		else if (b > a && c > a) {
			System.out.println("O maior n�mero � " + b);
			System.out.println("O maior segundo � " + c);
			System.out.println("O menor n�mero � " + a);
		}

		else if (c > a && b > a) {
			System.out.println("O maior n�mero � " + c);
			System.out.println("O maior segundo � " + b);
			System.out.println("O menor n�mero � " + a);

		}

		else if (c > a && a > b) {
			System.out.println("O maior n�mero � " + c);
			System.out.println("O maior segundo � " + a);
			System.out.println("O menor n�mero � " + b);

		} else {
			System.out.println("Entre com n�meros inteiros distintos");
		}
	}
}