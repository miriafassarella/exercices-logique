class FolhaPagamento {
  double calcularSalario(int horasNormais, int horasExtras,
  double valorHoraNormal, double valorHoraExtra) {
    // cálculo do salário
    double valorHorasNormais = horasNormais * valorHoraNormal;
    double valorHorasExtras = horasExtras * valorHoraExtra;
    return valorHorasNormais + valorHorasExtras;
}



    public static void main(String[] args) {
      FolhaPagamento folha = new FolhaPagamento();
      double salario = folha.calcularSalario(160, 20, 32.5, 40.2);
      System.out.println("Salário calculado: " + salario);
    }
}
