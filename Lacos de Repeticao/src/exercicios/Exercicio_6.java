/*Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
0(zero).*/
package exercicios;

import java.util.*;

public class Exercicio_6 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);

		int numero, media = 0, soma = 0, acumulador = 0;

		do {
			System.out.println("Digite um n�mero: ");
			numero = ler.nextInt();
			if (numero % 3 == 0) {
				soma = soma + numero;
				acumulador++;
			}
		} while (numero != 0);

		media = soma / acumulador;

		System.out.println("A media dos n�mero digitados m�ltiplos de 3 tr�s �: " + media);
	}
}
