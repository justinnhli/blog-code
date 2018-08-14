import java.util.Scanner;

class Visitor {

	private String email;
	// FIXME add additional member variables here

	/* Get the visitor's email
	 *
	 * @returns  The visitor's email
	 */
	public String getEmail() {
		return this.email;
	}

	/* Set the visitor's email
	 * 
	 * @param email  The new email
	 * @returns      true if the email is valid, false otherwise
	 */
	public boolean setEmail(String email) {
		// email is notoriously difficult to validate, so we're not even going to try
		// https://haacked.com/archive/2007/08/21/i-knew-how-to-validate-an-email-address-until-i.aspx/
		this.email = email;
		return true;
	}

	// FIXME add additional getters and setters here

	/* Search for characters in a string.
	 *
	 * Examples:
	 *
	 * hasAnyOf("", "0123") returns false
	 * hasAnyOf("0", "0123") returns true
	 * hasAnyOf("Justin", "0123456789") returns false
	 *
	 * @param haystack  The string to be searched through.
	 * @param needle    The characters to search for.
	 * @returns         True if the haystack contains any needle
	 */
	public static boolean hasAnyOf(String haystack, String needles) {
		// check for each undesirable character
		for (int i = 0; i < needles.length(); i++) {
			if (haystack.contains(String.valueOf(needles.charAt(i)))) {
				return true;
			}
		}
		return false;
	}

	/* Check for other characters in a string.
	 *
	 * Examples:
	 *
	 * hasOnly("", "0123") returns true
	 * hasOnly("0", "0123") returns true
	 * hasOnly("Justin", "0123456789") returns false
	 *
	 * @param haystack  The string to be searched through.
	 * @param needle    The characters to search for.
	 * @returns         True if the haystack only contains needles
	 */
	public static boolean hasOnly(String haystack, String needles) {
		for (int i = 0; i < haystack.length(); i++) {
			if (!needles.contains(String.valueOf(haystack.charAt(i)))) {
				return false;
			}
		}
		return true;
	}
}
