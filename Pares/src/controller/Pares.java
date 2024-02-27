package controller;

public class Pares
{
	public Pares()
	{
		super();
	}
	
	public int contar_pares(int[] arr, int len, int qtd)
	{
		len--;
		if (len == -1) {
			System.out.println("Vetor inexistente!");
			System.exit(0);
		}
		if (arr[len] % 2 == 0)
			qtd++;
		if (len == 0)
			return qtd;
		return contar_pares(arr, len, qtd);
	}
	
	public int contar_pares(int[] arr, int len)
	{
		return contar_pares(arr, len, 0);
	}
}
