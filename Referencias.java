import java.util.Scanner;

public class Referencias {

  public static void main (String[] args){

    Scanner scanner = new Scanner(System.in);

    System.out.print("Qual é o primeiro número? ");
    double n1 = scanner.nextDouble();

    System.out.print("Qual é o segundo número? ");
    double n2 = scanner.nextDouble();

    System.out.print("Qual é o terceiro número? ");
    double n3 = scanner.nextDouble();

    double maior = n1;
    double menor = n1;

    if (n2 > maior) {
      maior = n2;
    } else {
      menor = n2;
    }
    if (n3 > maior) {
      maior = n3;
    } else {
      menor = n3;
    }

    System.out.println("Maior: " + maior);
    System.out.println("Menor: " + menor);


  }
}
