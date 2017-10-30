package example.codeclan.com.athletes;

import java.util.ArrayList;

/**
 * Created by user on 30/10/2017.
 */

public class BoxingMatch extends Event {

    public BoxingMatch(){
        super();
    }

    public void calcPoints(Boxer boxer1, Boxer boxer2){
        int boxer1result = (boxer1.getHitsGiven() - boxer1.getHitsTaken());
        boxer1.setPoints(boxer1result);
        int boxer2result = (boxer2.getHitsGiven() - boxer2.getHitsTaken());
        boxer2.setPoints(boxer2result);
    }

}
