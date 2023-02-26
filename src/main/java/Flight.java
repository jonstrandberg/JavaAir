import java.util.ArrayList;
import java.util.Date;

public class Flight {

    private Pilot pilot;
    private ArrayList<CrewMember> crewMembers;
    private ArrayList<Passenger> passengers;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private Date departureTime;
    private int maximumWeightAllowance;
    private final Plane plane;


    public Flight(Pilot pilot, String flightNumber, String destination, Plane plane, String departureAirport, Date departureTime, int maximumWeightAllowance, ArrayList<CrewMember> crewMembers){
        this.pilot = pilot;
        this.passengers = new ArrayList<>();
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.maximumWeightAllowance = maximumWeightAllowance;
        this.crewMembers = crewMembers;
        this.plane = plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public int getMaximumWeightAllowance() {
        return maximumWeightAllowance;
    }

    public void setMaximumWeightAllowance(int maximumWeightAllowance) {
        this.maximumWeightAllowance = maximumWeightAllowance;
    }

    public ArrayList<CrewMember> getCrewMembers() {
        return crewMembers;
    }

    public int getNumberOfCrew(){
        return this.crewMembers.size();
    }

    public void setCrewMembers(ArrayList<CrewMember> crewMembers) {
        this.crewMembers = crewMembers;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public int getPassengerCount(){
        return passengers.size();
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    public int getFlightCapacity(){
        return plane.getPlaneModel().getCapacity();
    }

    public void flightCanAddPassenger(Passenger passenger){
        if(getFlightCapacity() > getPassengerCount()){
            passengers.add(passenger);
        }
    }

    public int flightHasAvailableSeats() {
        return plane.getPlaneModel().getCapacity() - this.passengers.size();
    }


    public boolean flight_can_checkIn_passenger_if_seat_available(Passenger passenger) {
        if (getFlightCapacity() > getPassengerCount()) {
            passengers.add(passenger);
            return true;
        }
        return false;
    }

    public int getCrewCount(){
        return crewMembers.size();
    }

    public ArrayList<CrewMember> getCrew() {
        return crewMembers;
    }


}
