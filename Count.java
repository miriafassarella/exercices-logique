import java.util.Scanner;

public class Count{

  public static void main (String[] args){

    Scanner scanner = new Scanner(System.in);

    /*int popA = 80000;
    int popB = 200000;
    int cont = 0;

      while(popA < popB){
        popA += (popA / 100) * 3; //a cada cambalhota soma-se essa expressão (popA / 100) * 3; ao popA.
        popB += (popB / 100) *1.5; // A cada cambalhota soma-se essa expressão (popB / 100) *1.5; ao popB.
        cont = cont + 1; //Quantidade de anos de acordo com a quantidade de voltas que o programa vai dar até popA
      }//ser maior que popB.
        System.out.println("População A: " + popA);
        System.out.println("População B: " + popB);
        System.out.println("Quantidade de anos: " + cont);*/

double popA, popB;
int cont = 0;
boolean valida = false;

do{

  System.out.print("Entre com a População A: ");
  popA = scanner.nextDouble();

  System.out.print("Entre com a População B: ");
  popB = scanner.nextDouble();

    if(popA < popB){
      valida = true;
      popA += (popA / 100) * 3;
      popB += (popB / 100) * 1.5;
      cont++;
      System.out.println("População A : " + popA);
      System.out.println("População B : " + popB);
      System.out.println("Quantidade de anos: " + cont);
    } else {

    }
  }while (!valida);



}
}
