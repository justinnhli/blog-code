import java.util.Scanner;

public class Main {

	/* This functions should prompt the user to enter information that would
	 * populate a visitor. This function should also check for errors in the
	 * user's input, and re-prompt them if necessary. The Visitor instance is
	 * created in this function and returned.
	 */
	public static Visitor inputNewVisitor() {
		// we need this to read from input
		Scanner scanner = new Scanner(System.in);

		// this will get a single integer
		//int i = scanner.nextInt();

		// this will get a single line (as a string)
		//String s = scanner.nextLine();

		// create the new visitlr
		Visitor visitor = new Visitor();
	
		// ask for and set the email
		System.out.println("Enter your email:");
		String email = scanner.nextLine();
		visitor.setEmail(email);

		return visitor;
	}

	/* In a real scenario, a main() might loop forever asking for users to
	 * enter information, then return them all in a list (or save it to file).
	 * For this assignment, getting one Visitor is sufficient.
	 */
	public static void main(String[] args) {
		Visitor visitor = inputNewVisitor();
		System.out.println();
		// FIXME add more printouts here
		System.out.println("Email: " + visitor.getEmail());
	}
}
