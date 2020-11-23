package basiclibrary;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class TallyElectionTest {
    @Test public void testTallying() {

        TallyingElection tallyTest = new TallyingElection();

        List<String> votes = new ArrayList<>();
        String winner = "Bush received the most votes!";

        votes.add("Bush");

        //testing an arraylist with one iten
        assertEquals(winner, tallyTest.tally(votes));
        
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        assertEquals(winner, tallyTest.tally(votes));
    }
}
