import cs102.Hangman;

import javax.swing.*;
import java.awt.*;

public class GallowsHangmanView extends JPanel implements IHangmanView{
    HangmanModel hangmanModel;
    public GallowsHangmanView(HangmanModel hangmanModel){
        this.hangmanModel = hangmanModel;
        setPreferredSize(new Dimension(300,300));

    }

    public void paintComponent( Graphics g ){
        super.paintComponent(g);
        int incorrect = hangmanModel.getNumOfIncorrectTries();

        if(incorrect<=1 && incorrect >0) {
            //gallows
            g.fillRect(25, 200, 100, 10);
        }
        else if(incorrect<=2 && incorrect >0) {
            g.fillRect(25, 200, 100, 10);

            g.drawLine(75, 50, 75, 200);
            g.drawLine(75, 50, 175, 50);
            g.drawLine(75, 100, 125, 50);
            g.drawLine(175, 50, 175, 75);
        }
        else if(incorrect<=3 && incorrect >0) {
            g.fillRect(25, 200, 100, 10);

            g.drawLine(75, 50, 75, 200);
            g.drawLine(75, 50, 175, 50);
            g.drawLine(75, 100, 125, 50);
            g.drawLine(175, 50, 175, 75);
            //head
            g.drawOval(162, 75, 25, 25);
        }
        else if(incorrect<=4 && incorrect >0) {
            g.fillRect(25, 200, 100, 10);

            g.drawLine(75, 50, 75, 200);
            g.drawLine(75, 50, 175, 50);
            g.drawLine(75, 100, 125, 50);
            g.drawLine(175, 50, 175, 75);
            //head
            g.drawOval(162, 75, 25, 25);
            //body
            g.drawLine(175, 100, 175, 150);
        }
        else if(incorrect<=5 && incorrect >0) {
            g.fillRect(25, 200, 100, 10);

            g.drawLine(75, 50, 75, 200);
            g.drawLine(75, 50, 175, 50);
            g.drawLine(75, 100, 125, 50);
            g.drawLine(175, 50, 175, 75);
            //head
            g.drawOval(162, 75, 25, 25);
            //body
            g.drawLine(175, 100, 175, 150);
            //left arm
            g.drawLine(175, 110, 150, 130);

            //right arm
            g.drawLine(175, 110, 200, 130);
        }
        else if(incorrect<=6 && incorrect >0) {
            g.fillRect(25, 200, 100, 10);

            g.drawLine(75, 50, 75, 200);
            g.drawLine(75, 50, 175, 50);
            g.drawLine(75, 100, 125, 50);
            g.drawLine(175, 50, 175, 75);
            //head
            g.drawOval(162, 75, 25, 25);
            //body
            g.drawLine(175, 100, 175, 150);
            //left arm
            g.drawLine(175, 110, 150, 130);

            //right arm
            g.drawLine(175, 110, 200, 130);
            //left leg
            g.drawLine(175, 150, 150, 170);

            //right leg
            g.drawLine(175, 150, 200, 170);

        }
        if(hangmanModel.hasLost())
            setBackground(Color.RED);
        else
            setBackground(Color.GREEN);
        
    }


    @Override
    public void updateView(Hangman hangmanModel) {
        repaint();

    }
}
