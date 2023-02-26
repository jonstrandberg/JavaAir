public class CrewMember {

    private String name;
    private CrewRank crewRank;

    public CrewMember(String name, CrewRank crewRank){
        this.name = name;
        this.crewRank = crewRank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCrewRank() {
        return crewRank.getRank();
    }

    public void setCrewRank(CrewRank crewRank) {
        this.crewRank = crewRank;
    }

    public String canRelayMessage(){
        return "Hi this is " + this.name + " can you all sit down and shut up, this is not a holiday";
    }

}
