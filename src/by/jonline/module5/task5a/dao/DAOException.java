package by.jonline.module5.task5a.dao;

public class DAOException extends Exception {

	private static final long serialVersionUID = -1813188713417849199L;

	public DAOException() {
		super();
	}

	public DAOException(String message) {
		super(message);
	}

	public DAOException(Exception e) {
		super(e);
	}

	public DAOException(String message, Exception e) {
		super(message, e);
	}

}
