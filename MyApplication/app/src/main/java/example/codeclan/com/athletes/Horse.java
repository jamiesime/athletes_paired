package example.codeclan.com.athletes;

import java.util.ArrayList;

/**
 * Created by user on 30/10/2017.
 */

public class Horse extends Event {

    public Horse() {
    }

    public void calcPoints(){
        for (Athlete athlete : competitors){
            Gymnast gymnast = (Gymnast) athlete;
            int result = (gymnast.getDifficulty() + gymnast.getExecution());
            gymnast.setPoints(result);
        }
    }
}
