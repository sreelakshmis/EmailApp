package emailApp;

import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String department;
	private String company;
	private int defaultPasswordLength = 10;
	private String email;
	private String companysuffix = "mycompany.com";
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private String password;

	// constructor to set the first and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;

		// get the department input
		this.department = setDepartment();

		// get a random password
		this.password = setRandomPassword(defaultPasswordLength);

		// create email
		this.email = createEmail();

	}

	private String setDepartment() {
		System.out.print("Enter the department\n 1 for Sales \n 2 for Engineering \n 3 for Finance \n 0 for none");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int dept = in.nextInt();
		if (dept == 1)
			return "Sales";
		else if (dept == 2)
			return "Engineering";
		else if (dept == 3)
			return "Finance";
		else
			return ""; // none or invalid departments
	}

	private String setRandomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";
		char password[] = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}

	public String createEmail() {
		if (!department.isEmpty()) {
			return firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "."
					+ companysuffix;
		}
		return firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + companysuffix;
	}

	public void setAlternateMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}

	public void changePassword(String newPassword) {
		this.password = newPassword;

	}

	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}

	// print the details
	public String showInfo() {

		return "Dsiplay name:" + firstName.toUpperCase() + " " + lastName.toUpperCase() + "\nCorporate email:" + email
				+ "\nAlternate email:" + alternateEmail + "\nPassword:" + password + "\nMailbox capacity:"
				+ mailboxCapacity + " mbs";

	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the mailboxCapacity
	 */
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}

	/**
	 * @param mailboxCapacity
	 *            the mailboxCapacity to set
	 */
	public void setMailboxCapacity(int mailboxCapacity) {
		this.mailboxCapacity = mailboxCapacity;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the alternateEmail
	 */
	public String getAlternateEmail() {
		return alternateEmail;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * @param department
	 *            the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * @param company
	 *            the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}

}
