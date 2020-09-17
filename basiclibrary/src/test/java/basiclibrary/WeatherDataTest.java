package basiclibrary;

import org.junit.Test;
import static org.junit.Assert.*;

public class WeatherDataTest {
    @Test public void testAnalyze() {
        WeatherData weatherTest = new WeatherData();

        int[][] temps = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        String returnString = "High: 72\nLow: 51\nNever saw temperature: 63\nNever saw temperature: 67\nNever saw temperature: 68\nNever saw temperature: 69";

        assertEquals(returnString, weatherTest.analize(temps));
    }
}
