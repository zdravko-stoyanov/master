package Exceptions;

public class NoMoneyException extends Exception {

	private static final long serialVersionUID = -8645571558867282849L;

	protected NoMoneyException() {
		super();
	}

	protected NoMoneyException(String message, Throwable cause) {
		super(message, cause);
	}

	public NoMoneyException(String message) {
		super(message);
	}

	protected NoMoneyException(Throwable cause) {
		super(cause);
	}

}
