import java.util.Scanner;

public class Atividade7{

  public static void main (String[] args){

    Scanner scanner = new Scanner(System.in);
    int numero;
    int maior = Integer.MIN_VALUE;//menor número do INT.

    for(int i = 0; i < 5; i++){
      System.out.print("Entre com o número: ");
      numero = scanner.nextInt();

      if(numero > maior){
        maior = numero;
        System.out.println("O número maior mudou para: " + maior);
      }
}
System.out.println("O número maior digitado foi: " + maior);

}

}
