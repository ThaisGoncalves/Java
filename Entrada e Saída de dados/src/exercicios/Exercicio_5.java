/*5. Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
respectivamente.*/
package exercicios;

import java.util.*;

public class Exercicio_5 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		float nota1, nota2, nota3, media;

		System.out.println("Escreva a primeira nota du alune: ");
		nota1 = leia.nextInt();
		System.out.println("Escreva a segunda nota du alune: ");
		nota2 = leia.nextInt();
		System.out.println("Escreva a terceira nota du alune: ");
		nota3 = leia.nextInt();

		media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / (10);
		System.out.println("A m�dia final � " + media);
	}
}
