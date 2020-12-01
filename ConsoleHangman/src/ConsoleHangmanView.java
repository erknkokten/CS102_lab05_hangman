import cs102.Hangman;

public class ConsoleHangmanView implements IHangmanView {

    @Override
    public void updateView(Hangman hangmanModel) {
        System.out.println( hangmanModel.getKnownSoFar() );
    }
}
