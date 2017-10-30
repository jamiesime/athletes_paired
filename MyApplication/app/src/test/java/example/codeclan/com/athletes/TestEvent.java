package example.codeclan.com.athletes;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 30/10/2017.
 */

public class TestEvent {

    Boxer boxer1;
    Boxer boxer2;
    Gymnast gymnast1;
    Gymnast gymnast2;
    Gymnast gymnast3;
    Horse horse;
    BoxingMatch boxingMatch;

    @Before
    public void setUp(){
        boxer1 = new Boxer("Takam", 50, 44);
        boxer2 = new Boxer("Mayweather", 100, 20);
        gymnast1 = new Gymnast("Gregorio", 6, 12);
        gymnast2 = new Gymnast("Loaf", 1, 1);
        gymnast3 = new Gymnast("Alan Duboir", 4, 7);
        horse = new Horse();
        boxingMatch = new BoxingMatch();
    }

    @Test
    public void testAddCompetitors(){
        boxingMatch.enterAthletes(boxer1);
        boxingMatch.enterAthletes(boxer2);
        assertEquals(2, boxingMatch.getCompetitors());
    }

    @Test
    public void testAddPoints(){
        horse.enterAthletes(gymnast1);
        horse.enterAthletes(gymnast2);
        horse.calcPoints();
        assertEquals(18, gymnast1.getPoints());
    }


}
