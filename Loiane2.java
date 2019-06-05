import java.util.Scanner;

public class Loiane2 {

public static void main (String[] args){

Scanner scanner = new Scanner(System.in);

System.out.print("Qual o valor? ");
double valor = scanner.nextDouble();

boolean negativo = valor < 0;
boolean positivo = valor > 0;

  if (positivo){
    System.out.println("Valor Positivo: " + valor);
  } else {
    System.out.println("Valor Negativo: " + valor);
  }

scanner.close();

}
}
