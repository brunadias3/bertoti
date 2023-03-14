class Main {
  public static void main(String[] args) {
    Person p1 = new Person();
    p1.setTeam(new Cast());
    p1.partOf();

    System.out.println("");
    
    Person p2 = new Person();
    p2.setTeam(new Crew());
    p2.partOf();
  }
}