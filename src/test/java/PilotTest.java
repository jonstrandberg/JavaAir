import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Jimbob McGee", CrewRank.CAPTAIN, "435345345");
    }

    @Test
    public void pilotHasName(){
        assertEquals("Jimbob McGee", pilot.getName());
    }

    @Test
    public void canChangePilotName(){
        pilot.setName("Bob Hoskins");
        assertEquals("Bob Hoskins", pilot.getName());
    }

    @Test
    public void pilotHasPilotLicenseNumber(){
        assertEquals("435345345", pilot.getPilotLicenseNumber());
    }

    @Test
    public void canChangePilotLicenseNumber(){
        pilot.setPilotLicenseNumber("65849402");
        assertEquals("65849402", pilot.getPilotLicenseNumber());
    }

    @Test
    public void pilotHasCrewRank(){
        assertEquals(1, pilot.getCrewRank());
    }

    @Test
    public void pilotCanFlyPlane(){
        assertEquals("Welcome on this JavaAir flight I'm your captain Jimbob McGee we will take off in a few minutes", pilot.flyPlane());
    }


}
