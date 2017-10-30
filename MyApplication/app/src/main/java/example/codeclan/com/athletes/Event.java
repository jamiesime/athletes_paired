package example.codeclan.com.athletes;

import java.util.ArrayList;

/**
 * Created by user on 30/10/2017.
 */

public abstract class Event {

    protected ArrayList<Athlete> competitors;

    public Event(){
        this.competitors = new ArrayList<Athlete>();
    }

    public void enterAthletes(Athlete athlete){
        this.competitors.add(athlete);
    }

    public int getCompetitors() {
        return competitors.size();
    }

    public void startEvent(){
        for (Athlete athlete : competitors){
            athlete.prepare();
        }
        System.out.println("Let the festivities begin");
        for (Athlete athlete : competitors){
            athlete.compete();
        }
        System.out.println("They gave it their best shot. Here are the results:");
    }

    public String award(){
        for(Athlete athlete : competitors) {
            if (athlete.getPoints() >= 15) {
                System.out.println(athlete.getName() + " : Gold Medal");
            }
            if (athlete.getPoints() >= 10) {
                System.out.println(athlete.getName() + " : Silver Medal");
            }
            if (athlete.getPoints() >= 5) {
                System.out.println(athlete.getName() + " : Bronze Medal");
            }
            else {
                System.out.println(athlete.getName() + " did not achieve medal status.");

            }

        } return "Games are over, go home.";
    }

}
