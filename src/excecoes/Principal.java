package excecoes;

public class Principal {
	public static void main(String args[]){
//		Divisao.divisaoSimples(4, 0);
//		Divisao.divisaoComExcecao(4, 0);
//		Frase.fraseMaiuscula(null);
//		deixarFraseMaiuscula("frase de exemplo");
//		novoFraseMaiuscula("testando");
		try {
			testandoMinhaExcecao("indio");
		} catch (ExcecaoSemLetraA e) {
			System.out.println(e.getMessage());
		}
		System.out.println("E o programa continua");
	}
	
	private static void novoFraseMaiuscula(String frs1) {
		try
		{
			Frase.aumentarLetras(frs1);
		}
		catch(NullPointerException e)
		{
			System.out.println("Ocorreu um NullPointerException ao executar o método aumentarLetras() "+e);
		}
	}
	
	public static void testandoMinhaExcecao(String texto) throws ExcecaoSemLetraA
	  {
		if(!texto.contains("a")) {
			throw new ExcecaoSemLetraA();
		}
	  }
}
