import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewGameButtonControl extends JButton implements ActionListener {
HangmanModel hangmanModel;
    public NewGameButtonControl(HangmanModel hangmanModel){
        setText("New Game");
        addActionListener(this);
        this.hangmanModel= hangmanModel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        hangmanModel.initNewGame();
    }
}
