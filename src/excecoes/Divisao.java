package excecoes;

public class Divisao {
	//Exemplo sem exceção
	public static void divisaoSimples(int num1, int num2) {
		int res = num1/num2;
		System.out.println("O resultado é: " + res);
	}
		
	//Exemplo com exceção
	public static void divisaoComExcecao(int num1, int num2) {
		try {
			int res = num1/num2;
			System.out.println("O resultado é " + res);
			
		} catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("Não é possível dividir por zero");
		}
	}
}
