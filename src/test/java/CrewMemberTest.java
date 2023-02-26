import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CrewMemberTest {

    CrewMember crewMember1;
    CrewMember crewMember2;

    @Before
    public void before(){
        crewMember1 = new CrewMember("Vince Larkin", CrewRank.US_MARSHALL);
        crewMember2 = new CrewMember("Sally Bishop", CrewRank.GUARD);

    }

    @Test
    public void crewHasName(){
        assertEquals("Vince Larkin", crewMember1.getName());
    }

    @Test
    public void crewSetName(){
        CrewMember crewMember3 = new CrewMember("Duncan Malloy", CrewRank.AGENT);
        crewMember3.setName("DEA AGENT Duncan Malloy");
        assertEquals("DEA AGENT Duncan Malloy", crewMember3.getName());
    }

    @Test
    public void crewMemberHasRank(){
        assertEquals(2, crewMember1.getCrewRank());
    }

    @Test
    public void canSetCrewRank(){
        CrewMember crewMember4 = new CrewMember("Fredric Lehne", CrewRank.CAPTAIN);
        crewMember4.setCrewRank(CrewRank.AGENT);
        assertEquals(3, crewMember4.getCrewRank());
    }

    @Test
    public void crewMemberCanRelayMessage(){
        CrewMember crewMember3 = new CrewMember("Duncan Malloy", CrewRank.AGENT);
        crewMember3.setName("DEA AGENT Duncan Malloy");
        assertEquals("Hi this is DEA AGENT Duncan Malloy can you all sit down and shut up, this is not a holiday", crewMember3.canRelayMessage());
    }

}
