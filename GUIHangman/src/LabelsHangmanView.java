import cs102.Hangman;

import javax.swing.*;
import java.awt.*;

public class LabelsHangmanView extends JPanel implements IHangmanView{
    JLabel incorrectTry, knownSoFar, usedLetters;
    HangmanModel hangman;
    public LabelsHangmanView(HangmanModel hangman){
        this.hangman = hangman;
        usedLetters = new JLabel("Used Letters: ");
        incorrectTry = new JLabel("# of incorrect tries: ");
        knownSoFar = new JLabel("Known so far: ");
        setLayout(new GridLayout(3, 1));
        setPreferredSize(new Dimension(300,300));
        add(incorrectTry);
        add(usedLetters);
        add(knownSoFar);
        setBackground(Color.YELLOW);

    }


    @Override
    public void updateView(Hangman hangmanModel) {
        usedLetters.setText("Used Letters: " + hangman.getUsedLetters());
        incorrectTry.setText("# of incorrect tries: " + hangman.getNumOfIncorrectTries());
        knownSoFar.setText("Known so far: " + hangman.getKnownSoFar());

    }
}
