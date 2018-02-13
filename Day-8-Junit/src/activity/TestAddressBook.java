package activity;

/**
 * @author srinivasa.challa
 *
 */
public class TestAddressBook {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("I Am From Main Method");
		SingleAddress singleAddress = new SingleAddress(" Challa",
				"Srinivasa Reddy", "XyzStreet", "Mysore", "KA", 570023);
		SingleAddress singleAddress1 = new SingleAddress("Challa",
				"Srinivasa Reddy", "ABCStreet", "Mysore", "KA", 570023);

		AddressBook addressBook = new AddressBookImpl();
		try {
			addressBook.addAddressEntry(singleAddress);
			addressBook.addAddressEntry(singleAddress1);
			addressBook.listAddressDetails();
			addressBook.removeAddressEntry("Srinivasa Reddy");
			addressBook.listAddressDetails();
		} catch (DuplicateAddressException e) {
			System.err.println("Error Message From Main Method:"
					+ e.getMessage());
		}
		System.out.println("End Of Main Method");
	}
}
