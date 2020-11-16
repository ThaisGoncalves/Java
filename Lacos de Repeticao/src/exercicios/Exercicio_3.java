/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99.*/
package exercicios;

import java.util.*;

public class Exercicio_3 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int idade = 0, menos21 = 0, mais50 = 0;

		while (idade < 99) {
			System.out.println("Informe a idade ");
			idade = ler.nextInt();

			if (idade <= 21) {
				menos21++;
			}

			else if (idade >= 50) {
				mais50++;
			} else {
				System.out.println("A idade está entre 21 e 50");

			}

		}
		System.out.println("Foram escritos  " + menos21 + " números menores que 21");
		System.out.println("Foram escritos " + mais50 + " números maiores que 50");

	}
}
