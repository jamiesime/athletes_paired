package example.codeclan.com.athletes;

/**
 * Created by user on 30/10/2017.
 */

public abstract class Athlete {

    private String name;
    private int points;

    public Athlete(String name) {
        this.name = name;
        this.points = 0;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String prepare(){
        System.out.println(getName() + " is preparing");
        return "Athlete is preparing";
    }

    public String compete(){
        System.out.println(getName() + " is competing");
        return "Athlete is competing";
    }

}

