class Director implements Employee {
  public float calcSalary(int days) {
    float resultado;
    resultado = days * 240;
    System.out.println(resultado);
    return resultado;
  }
}