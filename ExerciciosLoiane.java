import java.util.Scanner;

public class ExerciciosLoiane{

public static void main(String[] args){

  Scanner scanner = new Scanner(System.in);

  System.out.print("Quantos cachorros você tem? ");
  double cachorros = scanner.nextDouble();

  System.out.print("Quantos gatos você tem? ");
  double gatos = scanner.nextDouble();

  boolean totalCachorros = cachorros > gatos;
  boolean totalGatos = gatos > cachorros;

    if (totalCachorros) {
      System.out.println("O número de cachorros foi: "+ cachorros);
    }else {
      if (totalGatos){
        System.out.println("O número de gatos foi: "+ gatos);
      }
    }
scanner.close();


  }

}
