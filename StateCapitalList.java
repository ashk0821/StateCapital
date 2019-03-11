package IntroductionCS.u10.capitals;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.Random;


public class StateCapitalList {
    private ArrayList<StateCapital> states = new ArrayList<>();
    public StateCapitalList(java.lang.String fileName) throws FileNotFoundException{
        Scanner in = new Scanner(new FileReader(fileName));
        while (in.hasNextLine()){
            String [] x = in.nextLine().split("\t");
            states.add(new StateCapital(x[0], x[1]));
        }
    }
    public StateCapital getRandomState(){
        Random rand = new Random();
        return states.get(rand.nextInt(states.size()));
    }

    public int statesRemaining(){
        return states.size();
    }
    public void remove(StateCapital sc){
        states.remove(sc);
    }
}
