/*Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual
categoria ela se encontra:
10-14 infantil
15-17 juvenil
18-25 adulto*/

package exercicios;

import java.util.Scanner;

public class Exercicio_3 {
	public static void main(String args[]) {

		Scanner ler = new Scanner(System.in);
		int idade;

		System.out.println("Qual a sua idade? ");
		idade = ler.nextInt();

		if (idade >= 10 && idade <= 14) {
			System.out.println("Voc� pertence ao grupo infantil");
		}

		else if (idade >= 15 && idade <= 17) {
			System.out.println("Voc� pertence ao grupo juvenil");
		}

		else if (idade >= 18 && idade <= 25) {
			System.out.println("Voc� pertence ao grupo adulto");
		}

		else {
			System.out.println("N�o h� turmas dispon�veis para a sua idade");

		}

	}

}
