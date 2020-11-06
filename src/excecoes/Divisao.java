package excecoes;

public class Divisao {
	//Exemplo sem exce��o
	public static void divisaoSimples(int num1, int num2) {
		int res = num1/num2;
		System.out.println("O resultado �: " + res);
	}
		
	//Exemplo com exce��o
	public static void divisaoComExcecao(int num1, int num2) {
		try {
			int res = num1/num2;
			System.out.println("O resultado � " + res);
			
		} catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("N�o � poss�vel dividir por zero");
		}
	}
}
