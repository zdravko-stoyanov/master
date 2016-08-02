package Exceptions;

public class ClientException extends Exception {

	private static final long serialVersionUID = -3951672865927609126L;

	public ClientException() {
		super();
	}

	public ClientException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public ClientException(String arg0) {
		super(arg0);
	}

	public ClientException(Throwable arg0) {
		super(arg0);
	}

}
