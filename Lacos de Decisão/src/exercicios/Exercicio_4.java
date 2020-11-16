/*Faça um programa em que permita a entrada de um número 
 qualquer e exiba se este número é par ou ímpar. Se for par exiba também 
 a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.*/
package exercicios;

import java.util.*;
import java.math.*;

public class Exercicio_4 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);

		double numero, raiz, quadrado;

		System.out.println("Insira um número qualquer:");
		numero = ler.nextDouble();

		raiz = (double) Math.sqrt(numero);
		quadrado = (double) Math.pow(numero, 2);

		if (numero % 2 == 0) {
			System.out.println("Esse número é par e sua raiz é " + raiz);
		} else if (numero % 2 != 0) {
			System.out.println("Esse número é ímpar e elevado ao quadrado é " + quadrado);
		}
	}
}
