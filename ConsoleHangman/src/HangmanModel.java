import cs102.Hangman;
import cs102.IHangmanSetup;

public class HangmanModel extends Hangman {

    IHangmanView hangmanView;

    public HangmanModel(IHangmanSetup setup) {
        super(setup);
    }

    /**
     * sets the view
     * @param view
     */
    public void addView( IHangmanView view){
        hangmanView = view;
    }

    /**
     * calls the view's updateView
     */
    public void update(){
        hangmanView.updateView(this);
    }



    public int tryThis(char letter){
        int num = super.tryThis(letter);
        update();
        return num;
    }

    public void initNewGame(){
        super.initNewGame();
        if(hangmanView != null)
            update();
    }

}
