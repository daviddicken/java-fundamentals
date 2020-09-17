package basiclibrary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class TallyingElection {
    public String tally(List<String> plants)
    {
        // Got help through Marchael from Jack Nelson
        int count = 0;
        HashMap<String, Integer> votes = new HashMap<>();

        for(String name : plants)
        {
            if(votes.containsKey(name))
            {
                count = votes.get(name);
            }else{
                count = 0;
            }
            votes.put(name, count + 1);
        }

//------------------------------------------------
        int mostVotes = 0;
        String winner = "blah";
        for(String potato : votes.keySet())
        {
            if(votes.get(potato) > mostVotes)
            {
                winner = potato;
                mostVotes = votes.get(potato);
            }
        }

        String returnString = winner + " received the most votes!";

        return returnString;
    }
}
