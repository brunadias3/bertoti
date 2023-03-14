class Actor implements Employee {
  public float calcSalary(int days) {
    float resultado;
    resultado = days * 100;
    System.out.println(resultado);
    return resultado;
  }
}