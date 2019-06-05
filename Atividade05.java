import java.util.Scanner;

public class Atividade05{

  public static void main(String[] args){

    Scanner scanner = new Scanner (System.in);

        System.out.print("Qual é a primeira nota? ");
        double primeiraNota = scanner.nextDouble();

        System.out.print("Qual é a segunda nota? ");
        double segundaNota = scanner.nextDouble();

        double media = (primeiraNota + segundaNota) /2;

        if (media == 10){
          System.out.println("Aprovado com distinção");
        }else if(media >=7){
          System.out.println("Aprovado");
        }else {
          System.out.println("Reprovado");
        }



  }
}
