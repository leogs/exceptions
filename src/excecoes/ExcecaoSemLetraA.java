package excecoes;

public class ExcecaoSemLetraA extends Exception{
	@Override
	 public String getMessage(){
		return "N�o existe letra A em sua string";
	 }
}
