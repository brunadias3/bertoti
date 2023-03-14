class Person {
    private Team team;
    private Employee emplys;
    
    public void setTeam(Team team) {
        this.team = team;
    }
    
    public void partOf() {
        team.partOf();
    }

    public void setEmployee(Employee emplys) {
        this.emplys = emplys;
    }
    
    public float calcSalary(int days) {
        return emplys.calcSalary(days);
    }
}