/*8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
consumidor.*/

package exercicios;

import java.util.*;

public abstract class Exercicio_7 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);

		float custoConsu, custoFab, porcDist, porcImp;

		System.out.println("Escreva o custo de fábrica do carro R$ ");
		custoFab = leia.nextFloat();

		porcDist = (custoFab * 28) / 100;
		porcImp = (custoFab * 45) / 100;
		custoConsu = custoFab + porcDist + porcImp;

		System.out.println("O custo do carro para o consumirdor é R$ " + custoConsu);
	}
}
