package exercicios;

import java.util.*;

public class Exercicio_1 {
	public static void main(String args[]) {
		int anos, meses, dias, idade;

		Scanner leia = new Scanner(System.in);

		System.out.println("Qual a sua idade em anos? ");
		anos = leia.nextInt();

		System.out.println("E quantos meses? ");
		meses = leia.nextInt();

		System.out.println("E quantos dias? ");
		dias = leia.nextInt();

		idade = (anos * 365) + (meses * 30) + dias;

		System.out.println("Você já viveu " + idade);
	}
}