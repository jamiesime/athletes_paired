package example.codeclan.com.athletes;

/**
 * Created by user on 30/10/2017.
 */

public class Gymnast extends Athlete {

    private int difficulty;
    private int execution;

    public Gymnast(String name, int difficulty, int execution) {
        super(name);
        this.difficulty = difficulty;
        this.execution = execution;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public int getExecution() {
        return execution;
    }
}
