import cs102.Hangman;
import cs102.IHangmanSetup;

import java.util.Scanner;

public class copyConsoleHangman {

    public static void main( String[] args)
    {
        Scanner scan = new Scanner( System.in);

        System.out.println( "Start of ConsoleHangman\n");

        // VARIABLES
        HangmanModel  hangman;

        // PROGRAM COD

        hangman = new HangmanModel ( new BasicSetup () );

        IHangmanView view = new ConsoleHangmanView();
        IHangmanView view1 = new ConsoleHangmanView();
        hangman.addView( view );
        hangman.addView(view1);
        System.out.println( hangman.getKnownSoFar() );

        // ToDo - allow user to repeatedly enter a letter and tryThis letter
        //		  then show game status, until gameover. Finally report win/lose.

        char letter;
        do {
            System.out.print("Enter a letter: ");
            letter = scan.nextLine().charAt(0);
            hangman.tryThis(letter);

        }while(!hangman.isGameOver());

        if(hangman.hasLost())
            System.out.println("You lost");
        else
            System.out.println("You won");


        System.out.println( "\nEnd of ConsoleHangman\n" );
    }
}
