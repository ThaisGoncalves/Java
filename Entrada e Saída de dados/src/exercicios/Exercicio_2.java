/*2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.*/

package exercicios;

import java.util.*;

public class Exercicio_2 {
	public static void main(String args[]) {
		int anos, meses, dias, idade;

		Scanner leia = new Scanner(System.in);
		System.out.println("Insira sua idade em dias: ");
		idade = leia.nextInt();

		anos = idade / 360;
		meses = (idade % 360) / 30;
		dias = (idade % 360) % 30;
		System.out.println("Você tem " + anos + " anos, " + meses + " meses " + dias + " dias de idade.");
	}

}
