public class FlightManager {

    private Flight flight;
    private Weight weight;

    public FlightManager(Flight flight, Weight weight) {
        this.flight = flight;
        this.weight = weight;
    }


    public double getPassengerWeight(){
        double passengerWeight = flight.getPassengerCount() * weight.getWeight();
        return passengerWeight;
    }

    public double getBaggageWeight(){
        double baggageWeight = 0.0;
        for (Passenger passenger : flight.getPassengers()) {
            baggageWeight += passenger.getNumberOfBags() * flight.getMaximumWeightAllowance();
        }
        return baggageWeight;
    }

    public double getTotalWeight() {
        double totalWeight = this.getBaggageWeight() + this.getPassengerWeight() + this.getCrewWeight();
        return totalWeight;
    }

    public double getCrewWeight(){
        double crewWeight = flight.getCrewCount() * weight.getWeight();
        return crewWeight;
    }

    public double getRemainingHWeightAllowance(PlaneModel planeModel) {
        double remainingWeightAllowance = planeModel.getMaxHaulageWeight() - getTotalWeight();
        return remainingWeightAllowance;
    }
}
