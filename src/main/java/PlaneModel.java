public enum PlaneModel {

    FAIRCHILDC_123(7, 8000),
    AIRBUS_A320CE(180, 27000);

    private final int capacity;
    private final double maxHaulageWeight;

    PlaneModel(int capacity, double maxHaulageWeight){
        this.capacity = capacity;
        this.maxHaulageWeight = maxHaulageWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getMaxHaulageWeight() {
        return maxHaulageWeight;
    }
}
