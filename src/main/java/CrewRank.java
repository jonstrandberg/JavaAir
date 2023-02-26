public enum CrewRank {

    CAPTAIN(1),
    US_MARSHALL(2),
    AGENT(3),
    GUARD(4);

    private final int rank;
    CrewRank(int rank){
        this.rank = rank;
    }

    public int getRank(){
        return rank;
    }
}
