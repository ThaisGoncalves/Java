/*4. Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
calcule a seguinte expressão: D=(R+S)/2. Onde R=(A+B)^2 e S=(B+C)^2*/

package exercicios;

import java.util.*;

public class Exercicio_4 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);

		int a, b, c;
		float d, r, s;

		System.out.println("Digite o valor de a: ");
		a = leia.nextInt();
		System.out.println("Digite o valor de b: ");
		b = leia.nextInt();
		System.out.println("Digite o valor de c: ");
		c = leia.nextInt();

		r = (a + b) * (a + b);
		s = (b + c) * (b + c);
		d = (r + s) / 2;

		System.out.println("O valor de D é: " + d);
	}
}
