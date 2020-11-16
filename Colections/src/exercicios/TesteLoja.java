package exercicios;
import java.util.*;
public class TesteLoja {

public static void main(String args[]){
	Scanner ler=new Scanner (System.in);
	
	Collection <String> produtos = new ArrayList();
	int opcao;
	String novoProduto;
	String produtoAtual;
	String produto;
	do {
	produtos.add("sapato");
	produtos.add("camiseta");
	produtos.add("blusa");
	produtos.add("tenis");
	

	System.out.println("O que você deseja fazer? \n");
	System.out.println("\n1.Adicionar Produto ");
	System.out.println("\n2.Remover Produto ");
	System.out.println("\n3.Atualizar Estoque ");
	System.out.println("\n4.Mostrar itens ");
	
	opcao=ler.nextInt();
	
	switch (opcao) {
	case 1: System.out.println("Qual produto irá adicionar? ");
	novoProduto=ler.nextLine();
	produtos.add(novoProduto);
	break;
	
	
	case 2: System.out.println("Qual produto irá remover? ");
	produto=ler.nextLine();
		if(produtos.contains(produto)) {
			produtos.remove(produto);
		}else {System.out.println("Não existe esse produto em nosso catálogo ");
	}break;
	
	case 3: System.out.println("Qual produto deseja atualizar? ");
		produtoAtual=ler.nextLine();
			if(produtos.contains(produtoAtual)) {
				produtos.remove(produtoAtual);
				System.out.println("Qual o novo produto? ");
				novoProduto=ler.nextLine();
			}else {
				System.out.println("Produto indisponível ");
			}
	break;
	
	case 4: System.out.println("Itens\n ");
			System.out.println("\t"+produtos);
			break;
			
			default:
			System.out.println("Finalizar");
		
	}}while(opcao>=1 && opcao<5);
	
}}
	


