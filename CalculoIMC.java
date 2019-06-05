import java.util.Scanner;

  public class CalculoIMC {

    public static void main (String[] args){

      Scanner scanner = new Scanner(System.in);

        System.out.print("Massa (kg): ");
        double massa = scanner.nextDouble();

          System.out.print("Altura (M): ");
          double altura = scanner.nextDouble();

            double imc = massa / (altura²);

            System.out.println("IMC: ", imc);

              boolean resultado1 = imc >= 17;
              boolean resultado2 = imc >= 18.5;
              boolean resultado3 = imc < 17;
              boolean resultado4 = imc < 18.5;
              boolean resultado5 = imc >= 25;
              boolean resultado6 = imc < 25;
              boolean resultado7 = imc < 30;
              boolean resultado8 = imc >= 30;
              boolean resultado9 = imc < 35;
              boolean resultado10 = imc >= 35;
              boolean resultado11 = imc < 40;
                if (resultado3) {

                    System.out.println("Muito baixo do Peso");
                  }
                  

                  if (resultado1 && resultado4) {
                    System.out.println("Abaixo do Peso");
                  }

                 if (resultado2 && resultado6);{
                    System.out.println("Peso ideal");
                  }


                    if (resultado5 && resultado7){
                      System.out.System.out.println("Sobrepeso");
                    }


                    if(resultado8 && resultado9);{
                      System.out.System.out.println("Obesidade");
                    }


                    if (resultado10 && resultado11);{
                      System.out.println("Obesidade Severa");

                    } else {
                    System.out.println("Obesidade Morbida");
                  }


                    System.out.println("FIM");

                    scanner.close();
    }
}
