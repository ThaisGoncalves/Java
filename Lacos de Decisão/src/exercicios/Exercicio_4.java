/*Fa�a um programa em que permita a entrada de um n�mero 
 qualquer e exiba se este n�mero � par ou �mpar. Se for par exiba tamb�m 
 a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.*/
package exercicios;

import java.util.*;
import java.math.*;

public class Exercicio_4 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);

		double numero, raiz, quadrado;

		System.out.println("Insira um n�mero qualquer:");
		numero = ler.nextDouble();

		raiz = (double) Math.sqrt(numero);
		quadrado = (double) Math.pow(numero, 2);

		if (numero % 2 == 0) {
			System.out.println("Esse n�mero � par e sua raiz � " + raiz);
		} else if (numero % 2 != 0) {
			System.out.println("Esse n�mero � �mpar e elevado ao quadrado � " + quadrado);
		}
	}
}
