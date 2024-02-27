package view;

import controller.Pares;

public class Principal
{
	public static void main(String[] args)
	{
		int qtd;
		int[] array = {2, 3, 4, 5, 10};
		int tamanho = array.length;
		Pares p = new Pares();
		
		qtd = p.contar_pares(array, tamanho);
		System.out.println("A quantidade de pares nesse vetor é: " + qtd);		
	}
}