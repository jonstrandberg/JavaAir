import com.sun.org.omg.CORBA.ParDescriptionSeqHelper;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;

    @Before
    public void before(){
        passenger1 = new Passenger("Cameron Poe", 1);
        passenger2 = new Passenger("Garland Greene", 2);
        passenger3 = new Passenger("Cyrus Grissom", 0);
    }

    @Test
    public void passengerHasName(){
        assertEquals("Cameron Poe", passenger1.getName());
    }

    @Test
    public void canChangePassengerName(){
        Passenger passenger4 = new Passenger("Cyrus Grissom", 1);
        passenger4.setName("Cyrus 'the Virus' Grissom");
        assertEquals("Cyrus 'the Virus' Grissom", passenger4.getName());
    }

    @Test
    public void passengerHasNumberOfBags(){
        assertEquals(1, passenger1.getNumberOfBags());
    }

    @Test
    public void passengerCanAddAdditionalBags(){
        passenger3.setNumberOfBags(1);
        assertEquals(1, passenger3.getNumberOfBags());
    }

}
