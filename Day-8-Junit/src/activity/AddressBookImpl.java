package activity;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author srinivasa.challa
 *
 */
public class AddressBookImpl implements AddressBook {
	private Set<SingleAddress> addressBook;

	/**
	 * 
	 */
	public AddressBookImpl() {
		addressBook = new HashSet<SingleAddress>();
	}

	@Override
	public boolean addAddressEntry(final SingleAddress singleAddress)
			throws DuplicateAddressException, NullPointerException {
		boolean registrationFlag = false;
		final String METHOD_NAME = "addAddressEntry";
		System.out.println("Method Invoked:" + METHOD_NAME + ":"
				+ singleAddress);
		if (singleAddress == null) {
			throw new NullPointerException("Address Object Is Null");
		}
		registrationFlag = addressBook.add(singleAddress);
		if (!registrationFlag) {
			throw new DuplicateAddressException("Duplicate Address Entry Found");
		}
		System.out.println("Response From The Method:" + METHOD_NAME + ":"
				+ registrationFlag);
		return registrationFlag;

	}

	@Override
	public boolean removeAddressEntry(final String firstName)
			throws NullPointerException {
		boolean removeFlag = false;
		final String METHOD_NAME = "removeAddressEntry";
		System.out.println("Method Invoked:" + METHOD_NAME + ":" + firstName);
		if (firstName == null) {
			throw new NullPointerException("First Name IS Nuill");
		}
		Iterator<SingleAddress> iterator = addressBook.iterator();
		while (iterator.hasNext()) {
			SingleAddress singleAddress = iterator.next();
			if (singleAddress.getFirstName().equals(firstName)) {
				iterator.remove();
				removeFlag = true;
			}
		}
		System.out.println("Response From The Method:" + METHOD_NAME + ":"
				+ removeFlag);
		return removeFlag;
	}

	@Override
	public void listAddressDetails() {
		System.out.println("***************************************");
		System.out.println("Address Book Entry's");
		System.out.println("***************************************");
		for (SingleAddress address : addressBook) {
			System.out.println("------------------------------------------");
			System.out.println("First Name:" + address.getFirstName());
			System.out.println("Last Name:" + address.getLastName());
			System.out.println("Street Name:" + address.getStreetName());
			System.out.println("City Name:" + address.getCityName());
			System.out.println("State Name:" + address.getState());
			System.out.println("Pincode:" + address.getPinCode());
			System.out.println("------------------------------------------");
		}
		System.out.println("***************************************");
	}

}
