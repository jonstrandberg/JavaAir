import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class FlightTest {

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


        flight1 = new Flight(pilot, "ConAir234", "Carson City, Nevada", plane, "Mobile, Alabama",flightDate, 20, crewMembers);
        flight1.setPassengers(passengers);
    }

    @Test
    public void flightHasFlightNumber() {
        assertEquals("ConAir234", flight1.getFlightNumber());
    }

    @Test
    public void flightCanChangeFlightNumber(){
        flight1.setFlightNumber("Jailbird");
        assertEquals("Jailbird", flight1.getFlightNumber());
    }

    @Test
    public void flightHasDestination() {
        assertEquals("Carson City, Nevada", flight1.getDestination());
    }

    @Test
    public void flightCanChangeDestination(){
        flight1.setDestination("San Francisco, CA");
        assertEquals("San Francisco, CA", flight1.getDestination());
    }

    @Test
    public void flightHasDepartureAirport(){
        assertEquals("Mobile, Alabama", flight1.getDepartureAirport());
    }

    @Test
    public void flightCanChangeDepartureAirport(){
        flight1.setDepartureAirport("New York, New York");
        assertEquals("New York, New York", flight1.getDepartureAirport());
    }

    @Test
    public void flightHasDepartureTime(){
        assertEquals(flightDate, flight1.getDepartureTime());
    }

    @Test
    public void flightCanChangeFlightTime(){
            Calendar calendar = Calendar.getInstance();
            calendar.set(2007, 9, 22, 18, 0, 0);
            flight1.setDepartureTime(calendar.getTime());
            assertEquals(calendar.getTime(), flight1.getDepartureTime());
        }

    @Test
    public void flightHasMaximumWeightAllowance() {
        assertEquals(20, flight1.getMaximumWeightAllowance());
    }

    @Test
    public void flightCanChangeMaximumWeightAllowance(){
        flight1.setMaximumWeightAllowance(15);
        assertEquals(15, flight1.getMaximumWeightAllowance());
    }

   @Test
   public void flightHasCrewMembers() {
       assertEquals(3, flight1.getNumberOfCrew());
   }

   @Test
    public void flightCanChangeCrewMembers(){
       ArrayList<CrewMember> crewMembers = new ArrayList<>();
       crewMembers.add(new CrewMember("Vince Larkin", CrewRank.US_MARSHALL));
       crewMembers.add(new CrewMember("Sally Bishop", CrewRank.GUARD));
       flight1 = new Flight(pilot,"ConAir234", "Carson City, Nevada", plane, "Mobile, Alabama",flightDate, 80000, crewMembers);
       flight1.setCrewMembers(crewMembers);
       assertEquals(crewMembers, flight1.getCrewMembers());
   }

   @Test
    public void flightHasPilot(){
        assertEquals(pilot, flight1.getPilot());
   }

   @Test
    public void flightCanSetPilot(){
        Pilot pilot = new Pilot("Jimbo Collins", CrewRank.CAPTAIN, "84738324");
        flight1 = new Flight (pilot, "ConAir234", "Carson City, Nevada",  plane, "Mobile, Alabama",flightDate, 80000, crewMembers);
        flight1.setPilot(pilot);
        assertEquals(pilot, flight1.getPilot());
   }

   @Test
    public void flightHasPassengers(){
        assertEquals(5, flight1.getPassengerCount());
   }

    @Test
    public void flightHasACapacity(){
        assertEquals(7, flight1.getFlightCapacity());
    }

    @Test
    public void flightHasSeatsAvailable(){
        assertEquals(1, flight1.flightHasAvailableSeats());
    }

    @Test
    public void flightCanAddPassenger(){
        Passenger passenger1 = new Passenger("Billy Joe Randall", 2);
        flight1.flightCanAddPassenger(passenger1);
        assertEquals(6, flight1.getPassengerCount());
    }

    @Test
    public void flight_can_check_if_passenger_can_be_checkedIn(){
        assertEquals(true, flight1.flight_can_checkIn_passenger_if_seat_available(passenger1));
    }

    @Test
    public void flightHasCrew(){
        assertEquals(3, flight1.getCrewCount());
    }



}
