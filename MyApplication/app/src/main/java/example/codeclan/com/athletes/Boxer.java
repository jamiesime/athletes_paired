package example.codeclan.com.athletes;

/**
 * Created by user on 30/10/2017.
 */

public class Boxer extends Athlete {

    private int hitsGiven;
    private int hitsTaken;

    public Boxer(String name, int hitsGiven, int hitsTaken) {
        super(name);
        this.hitsGiven = hitsGiven;
        this.hitsTaken = hitsTaken;
    }

    public int getHitsGiven() {
        return hitsGiven;
    }

    public int getHitsTaken() {
        return hitsTaken;
    }
}
