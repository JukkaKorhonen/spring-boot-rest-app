package fi.korhonen.jukka.error;

public class TechnicalException extends Exception {

	private static final long serialVersionUID = 1L;

	private String message; 
		
	public Throwable throwable;
	
	public TechnicalException(String message, Throwable e) {
		this.message = message;
		this.throwable = e;	
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Throwable getThrowable() {
		return throwable;
	}

	public void setThrowable(Throwable throwable) {
		this.throwable = throwable;
	}
	
	
}
