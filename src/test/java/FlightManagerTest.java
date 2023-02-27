import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {


    private Flight flight1;
    private Pilot pilot;
    private CrewMember crewMember1;
    private CrewMember crewMember2;
    private CrewMember crewMember3;
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;
    private Passenger passenger4;
    private Passenger passenger5;
    private ArrayList<CrewMember> crewMembers;
    private ArrayList<Passenger> passengers;
    private Date flightDate;
    private Plane plane;
    private FlightManager flightManager;
    private Weight weight;


    @Before
    public void before(){
        pilot = new Pilot("Jimbob McGee", CrewRank.CAPTAIN, "43456467");
        crewMember1 = new CrewMember("Vince Larkin", CrewRank.US_MARSHALL);
        crewMember2 = new CrewMember("Sally Bishop", CrewRank.GUARD);
        crewMember3 = new CrewMember("Duncan Malloy", CrewRank.AGENT);
        passenger1 = new Passenger("Cameron Poe", 1);
        passenger2 = new Passenger("Garland Greene", 2);
        passenger3 = new Passenger("Cyrus 'the Virus' Grissom", 1);
        passenger4 = new Passenger("Garland Greene", 2);
        passenger5 = new Passenger("Ramon Martinez", 1);
        crewMembers = new ArrayList<>();
        crewMembers.add(crewMember1);
        crewMembers.add(crewMember2);
        crewMembers.add(crewMember3);
        passengers = new ArrayList<>();
        passengers.add(passenger1);
        passengers.add(passenger2);
        passengers.add(passenger3);
        passengers.add(passenger4);
        passengers.add(passenger5);
        Calendar calendar = Calendar.getInstance();
        calendar.set(2007, 5, 23, 12, 0, 0);
        flightDate = calendar.getTime();
        plane = new Plane(PlaneModel.FAIRCHILDC_123);
        weight = new Weight(80, "kg");
        flight1 = new Flight(pilot, "ConAir234", "Carson City, Nevada", plane, "Mobile, Alabama",flightDate, 20, crewMembers);
        flight1.setPassengers(passengers);
        flightManager = new FlightManager(flight1, weight);
    }

    @Test
    public void canCalculateWeightOfPassengers(){
        assertEquals(400.0, flightManager.getPassengerWeight(), 0.01);
    }

    @Test
    public void canCalculateWeightOfBaggage(){
        assertEquals(140.0, flightManager.getBaggageWeight(),0.01);
    }

    @Test
    public void calculateWeightOfCrew(){
        assertEquals(240, flightManager.getCrewWeight(), 0.01);
    }


    @Test
    public void canCalculateTotalWeight(){
        assertEquals(780, flightManager.getTotalWeight(),0.01);
    }

    @Test
    public void canCalculateRemainingHaulageAllowance(){
        assertEquals(7220.0, flightManager.getRemainingHWeightAllowance(PlaneModel.FAIRCHILDC_123), 0.01);
    }



}
