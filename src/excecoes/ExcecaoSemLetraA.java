package excecoes;

public class ExcecaoSemLetraA extends Exception{
	@Override
	 public String getMessage(){
		return "Não existe letra A em sua string";
	 }
}
