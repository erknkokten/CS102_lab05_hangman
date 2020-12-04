import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HangmanLetterButtonsController implements ActionListener {
    HangmanModel hangmanModel;
    LetterButtonControls controls;
    public HangmanLetterButtonsController(HangmanModel hangman,LetterButtonControls controls){
        hangmanModel = hangman;
        this.controls = controls;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        hangmanModel.tryThis(button.getText().charAt(0));
        controls.setDisabled(button.getText());
    }
}

