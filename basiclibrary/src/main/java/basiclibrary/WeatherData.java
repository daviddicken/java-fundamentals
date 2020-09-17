package basiclibrary;

import java.util.HashSet;

public class WeatherData {
    public String analize(int[][] data)
    {
        int high = data[0][0];
        int low = data[0][0];
        HashSet<Integer> temps = new HashSet<>();

        for(int i = 0; i < data.length; i++)
        {
            for(int j = 0; j < data[i].length; j++)
            {
                temps.add(data[i][j]);
                if(data[i][j] > high)
                {
                    high = data[i][j];
                }
                else if(data[i][j] < low)
                {
                    low = data[i][j];
                 }
            }
        }

        String returnString = "High: " + high + "\nLow: " + low;

        for(int k = low; k < high; k++)
        {
            if(!temps.contains(k))
            {
               returnString = returnString + "\nNever saw temperature: " + k;
            }
        }

        return returnString;
    }
}
