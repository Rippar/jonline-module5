package by.jonline.module5.task5a.logic;

public class LogicException extends Exception {

	private static final long serialVersionUID = -5742292661643960940L;

	public LogicException() {
		super();
	}

	public LogicException(String message) {
		super(message);
	}

	public LogicException(Exception e) {
		super(e);
	}

	public LogicException(String message, Exception e) {
		super(message, e);
	}

}
