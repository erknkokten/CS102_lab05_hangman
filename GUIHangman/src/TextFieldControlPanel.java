import cs102.Hangman;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldControlPanel extends JPanel implements ActionListener {

    Hangman hangman;
    JTextField textField;

    public TextFieldControlPanel(Hangman hangman){
        this.hangman = hangman;
        textField = new JTextField(10);
        textField.addActionListener(this);


        add(textField);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        char letter;
        for(int i = 0; i < textField.getText().length(); i++ ) {
            letter = textField.getText().charAt(i);
            hangman.tryThis(letter);
        }
        textField.setText("");

    }
}
