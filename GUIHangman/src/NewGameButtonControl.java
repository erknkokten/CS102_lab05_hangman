import cs102.Hangman;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewGameButtonControl extends JButton implements ActionListener, IHangmanView {
HangmanModel hangmanModel;
    public NewGameButtonControl(HangmanModel hangmanModel){
        setText("New Game");
        addActionListener(this);
        this.hangmanModel= hangmanModel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.setEnabled(false);
        hangmanModel.initNewGame();
    }

    @Override
    public void updateView(Hangman hangmanModel) {
        if(hangmanModel.isGameOver())
            this.setEnabled(true);

    }
}
