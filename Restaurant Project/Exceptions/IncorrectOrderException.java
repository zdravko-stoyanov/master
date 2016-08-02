package Exceptions;

public class IncorrectOrderException extends Exception {

	private static final long serialVersionUID = 2143073567214266132L;

	public IncorrectOrderException() {
		super();
	}

	public IncorrectOrderException(String message, Throwable cause) {
		super(message, cause);
	}

	public IncorrectOrderException(String message) {
		super(message);
	}

	public IncorrectOrderException(Throwable cause) {
		super(cause);
	}

}
