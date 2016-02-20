import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {

		System.out.println("Bitte geben Sie einen String ein:");
		
		Scanner s = new Scanner(System.in);
		String pal = s.next();
		int start = 0;
		int ende = pal.length() - 1;

		boolean isPal = true;

		while (start < ende) {
			String StartBuchstabe = pal.substring(start, start + 1);
			String EndBuchstabe = pal.substring(ende, ende + 1);

			if (StartBuchstabe.equals(EndBuchstabe) == false) {
				isPal = false;
				break;
			}
			start++;
			ende--;
		}

		if (isPal == true) {
			System.out.println("String \"" + pal + "\" ist ein Palidrom!");
		} else {
			System.out.println("String \"" + pal + "\" ist KEIN Palidrom!");
		}
	}
}
