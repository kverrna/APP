package excessao;

public class TempoErradoException extends Exception {
	
	String mensagem;
	 
	public TempoErradoException(String string) {
		this.mensagem =string;
	}
	
	public String getMessage() {
		return mensagem;
	}
}