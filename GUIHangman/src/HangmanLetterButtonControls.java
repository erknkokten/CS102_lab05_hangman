import cs102.Hangman;

public class HangmanLetterButtonControls extends LetterButtonControls implements IHangmanView {
    public HangmanLetterButtonControls(String letters, int rows, int cols) {
        super(letters, rows, cols);
    }

    @Override
    public void updateView(Hangman hangmanModel) {
        if(hangmanModel.getUsedLetters().equals(""))
            setEnabledAll(true);
        else
            setDisabled(hangmanModel.getUsedLetters());
    }
}
