package basiclibrary;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class TallyElectionTest {
    @Test public void testTallying() {

        TallyingElection tallyTest = new TallyingElection();

        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        String winner = "Bush received the most votes!";
        assertEquals(winner, tallyTest.tally(votes));
    }
}
