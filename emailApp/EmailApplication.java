package emailApp;

import java.util.Scanner;

/**
 * @author Sree 
 * 
 * Application to automate the creation of a new hire and his/her
 *         email address. Application lets you add alternate email, modify the
 *         password and modify the mailbox capacity from default 500 mbs
 *
 */
public class EmailApplication {

	public static void main(String[] args) {

		Email newHire = new Email("Mary", "George");

		System.out.println(newHire.showInfo());
		modifyDetails(newHire);
	}

	static private void modifyDetails(Email email) {
		System.out.print("Do you wish to modify details? Enter Y or N");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String response = in.next();
		
		if(response.equals("Y")) {
			System.out.print("Enter alternate email\n");
			email.setAlternateEmail( in.next());
			System.out.print("Enter mailbox capacity (default 500 mbs)\n");
			email.setMailboxCapacity( in.nextInt());
			System.out.print("Enter new password\n");
			email.changePassword(in.next());
			System.out.println(email.showInfo());
		}else System.out.println("Email creation complete");
	}
}
