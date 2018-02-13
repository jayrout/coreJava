package activity;

/**
 * @author srinivasa.challa
 *
 */
public class DuplicateAddressException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public DuplicateAddressException() {
		super();

	}

	/**
	 * @param message
	 */
	public DuplicateAddressException(String message) {
		super(message);

	}

	/**
	 * @param cause
	 */
	public DuplicateAddressException(Throwable cause) {
		super(cause);
	}

}
