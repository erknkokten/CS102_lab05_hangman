import cs102.Hangman;

import javax.swing.*;
import java.awt.*;

public class LabelsHangmanView extends JPanel implements IHangmanView{
    JLabel incorrectTry, knownSoFar, usedLetters, status;
    HangmanModel hangman;
    public LabelsHangmanView(HangmanModel hangman){
        this.hangman = hangman;
        usedLetters = new JLabel("Used Letters: ");
        incorrectTry = new JLabel("# of incorrect tries: ");
        knownSoFar = new JLabel("Known so far: ");
        status = new JLabel();
        setLayout(new GridLayout(4, 1));
        setPreferredSize(new Dimension(300,300));
        add(incorrectTry);
        add(usedLetters);
        add(knownSoFar);
        add(status);
        setBackground(Color.YELLOW);

    }


    @Override
    public void updateView(Hangman hangmanModel) {
        usedLetters.setText("Used Letters: " + hangman.getUsedLetters());
        incorrectTry.setText("# of incorrect tries: " + hangman.getNumOfIncorrectTries());
        knownSoFar.setText("Known so far: " + hangman.getKnownSoFar());
        if(hangmanModel.isGameOver()) {
            if (hangmanModel.hasLost())
                status.setText("YOU LOST");
            else
                status.setText("YOU WON");
        }
        else
            status.setText("");

    }
}
