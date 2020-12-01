import cs102.Hangman;
import cs102.IHangmanSetup;

import java.util.ArrayList;

public class HangmanModel extends Hangman {

    ArrayList<IHangmanView> views;

    public HangmanModel(IHangmanSetup setup) {
        super(setup);
        views = new ArrayList<IHangmanView>();

    }

    /**
     * sets the view
     * @param view
     */
    public void addView( IHangmanView view){
        views.add(view);

    }

    /**
     * calls the view's updateView
     */
    public void update(){
        for(int i = 0; i< views.size(); i++){
            views.get(i).updateView(this);
        }

    }



    public int tryThis(char letter){
        int num = super.tryThis(letter);
        update();
        return num;
    }

    public void initNewGame(){
        super.initNewGame();
        if(views != null)
            update();
    }

}
