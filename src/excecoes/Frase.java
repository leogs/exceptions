package excecoes;

public class Frase {
	//Exemplo com exceção e finally
	public static void fraseMaiuscula(String frs1) {
		String frase = frs1;
	    String novaFrase = null;
	    
	    try
	    {
	      novaFrase = frase.toUpperCase();
	    }
	    catch(NullPointerException e)
	    {
	      System.out.println("O frase inicial está nula e foi lhe atribuito um valor default.");
	      frase = "Frase vazia";
	    }
	    finally
	    {
	      novaFrase = frase.toUpperCase();
	    }
	    System.out.println("Frase antiga: "+frase);
	    System.out.println("Frase nova: "+novaFrase);
	}
		
	//Exemplo com throws
	public static void aumentarLetras(String frs1) throws NullPointerException //lançando exceção
	{
		String frase = frs1;
		String novaFrase = frase.toUpperCase();
		System.out.println("Frase antiga: "+frase);
		System.out.println("Frase nova: "+novaFrase);
	}
	
	//Exemplo com throw
	public static void aumentarLetrasThrow(String frs1) throws Exception
	{
	    String frase = frs1;
	    String novaFrase = null;
	    try
	    {
	      novaFrase = frase.toUpperCase();
	    }
	    catch(NullPointerException e)
	    {
	      throw new Exception(e);
	    }
	    System.out.println("Frase antiga: "+frase);
	    System.out.println("Frase nova: "+novaFrase);
	  }
}
