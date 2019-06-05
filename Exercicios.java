import java.util.Scanner;

public class Exercicios {

public static void main(String[] args) {

 Scanner scanner = new Scanner(System.in);

 System.out.print("Qual a sua idade? ");
 double idade = scanner.nextDouble();

 boolean idadeinicial = idade>=18;

    if (idadeinicial){

      System.out.println("Parabéns, você já pode tirar sua carteira de motorista");

      }

   else{

     System.out.println("Sinto muito, mas você ainda não pode dirigir.");
   }

}

}
