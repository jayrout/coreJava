package activity;

/**
 * @author srinivasa.challa
 *
 */
public interface AddressBook {

	/**
	 * @param singleAddress
	 * @return boolean
	 * @throws DuplicateAddressException
	 * @throws NullPointerException
	 */
	public abstract boolean addAddressEntry(final SingleAddress singleAddress)
			throws DuplicateAddressException, NullPointerException;

	/**
	 * @param firstName
	 * @return boolean
	 * @throws NullPointerException
	 */
	public abstract boolean removeAddressEntry(final String firstName)
			throws NullPointerException;

	/**
	 * 
	 */
	public abstract void listAddressDetails();
}
