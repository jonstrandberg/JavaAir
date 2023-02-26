public class Pilot {

        private String name;
        private String pilotLicenseNumber;
        private final CrewRank crewRank;

        public Pilot(String name, CrewRank crewRank,String pilotLicenseNumber){
            this.name = name;
            this.crewRank = crewRank;
            this.pilotLicenseNumber = pilotLicenseNumber;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPilotLicenseNumber() {
        return pilotLicenseNumber;
    }

    public void setPilotLicenseNumber(String pilotLicenseNumber) {
        this.pilotLicenseNumber = pilotLicenseNumber;
    }

    public int getCrewRank() {
        return crewRank.getRank();
    }

    public String flyPlane(){
            return "Welcome on this JavaAir flight I'm your captain " + this.name + " we will take off in a few minutes";
    }
}
