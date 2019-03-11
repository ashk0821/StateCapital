package IntroductionCS.u10.capitals;

import javax.swing.*;
import java.io.FileNotFoundException;

public class StateCapitalQuiz {
    public static void main(String[] args) throws FileNotFoundException{
        int correct = 0;
        int guess = 0;
        String[] files = {"states_central.txt", "states_east.txt","states_small_test.txt", "states_south.txt",
                "states_west.txt"};

        String choice = (String) JOptionPane.showInputDialog(null, "Which quiz would you like to take?",
                "File Choice:", JOptionPane.QUESTION_MESSAGE, null, files, files[0]);

        if (choice == null){
            System.exit(0);
        }
        StateCapitalList quiz = new StateCapitalList(choice);
        while (quiz.statesRemaining() > 0){
            StateCapital state = quiz.getRandomState();
            String answer = JOptionPane.showInputDialog("What is the capital of " + state.getState() + "?");
            if (answer == null){
                break;
            }
            else if (answer.equalsIgnoreCase(state.getCapital())){
                JOptionPane.showMessageDialog(null, "Correct!");
                quiz.remove(state);
                correct++;
            }
            else{
                JOptionPane.showMessageDialog(null, "Incorrect, the capital is " +
                        state.getCapital());
            }
            guess++;

        }
        JOptionPane.showMessageDialog(null, "You guessed " + correct + " capitals in " + guess
                + " guesses.");

    }
}
