import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String playAgain = "";
		do {
			// create a random number for user to guess
			// (int) is a type cast -> changes type from decimal to int
			int theNumber = (int)(Math.random() * 200 - 100);
			// System.out.println(theNumber);
			int guess = 0;
			while (guess != theNumber) {
				System.out.println("Guess a number between -100 and 100: ");
				// nextInt() takes the string of text chars entered by user and
				// turns it into the correct numeric value
				guess = scan.nextInt();
				if (guess < theNumber) {
					System.out.println(guess + " is too low. Try again!");
				}
				else if (guess > theNumber) {
					System.out.println(guess + " is too high. Try again!");
				}
				else
					System.out.println(guess + " is correct. You win!");
			}
			// end of while loop
			System.out.println("Would you like to play again? (Y/N)");
			playAgain = scan.next();
		} while (playAgain.equalsIgnoreCase("Y"));
		System.out.println("Thanks for playing! Goodbye.");
		scan.close();
	}

}	
