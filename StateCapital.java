package IntroductionCS.u10.capitals;

import java.util.Random;

public class StateCapital {
    private String state;
    private String capital;

    public StateCapital(String state, String capital){
        this.state = state;
        this.capital = capital;
    }

    public boolean equals (Object o){
        StateCapital x = (StateCapital) o;
        if (this.state.equals(x.state)){
            return true;
        }
        else{
            return false;
        }
    }

    public String getState(){
        return state;
    }

    public String getCapital(){
        return capital;
    }
}
