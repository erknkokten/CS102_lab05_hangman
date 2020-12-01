import java.util.Scanner;
import cs102.*;

/**
 * ConsoleHangman
 *
 * @author
 * @version 1.00 2013/4/7
 */

public class ConsoleHangman
{
    public static void main( String[] args)
	{
    	Scanner scan = new Scanner( System.in);

    	System.out.println( "Start of ConsoleHangman\n");

		// VARIABLES
		Hangman hangman;

		// PROGRAM CODE
		hangman = new Hangman( new BasicSetup() );

		System.out.println( hangman.getKnownSoFar() );

		// ToDo - allow user to repeatedly enter a letter and tryThis letter
		//		  then show game status, until gameover. Finally report win/lose.

		char letter;
		do {
			System.out.print("Enter a letter: ");
			letter = scan.nextLine().charAt(0);
			hangman.tryThis(letter);
			System.out.println( hangman.getKnownSoFar() );
		}while(!hangman.isGameOver());

		if(hangman.hasLost())
			System.out.println("You lost");
		else
			System.out.println("You won");


		System.out.println( "\nEnd of ConsoleHangman\n" );
	}

} // end of class ConsoleHangman
