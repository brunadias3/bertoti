class Person {
    private Team team;
    
    public void setTeam(Team team) {
        this.team = team;
    }
    
    public void partOf() {
        team.partOf();
    }
}