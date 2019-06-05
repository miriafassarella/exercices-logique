import java.util.Scanner;

  public class Atividade06{

    public static void main (String[] args){

      Scanner scanner = new Scanner(System.in);

        System.out.print("Qual é o primeiro número? ");
        double numeroA = scanner.nextDouble();

        System.out.print("Qual é o segundo número? ");
        double numeroB = scanner.nextDouble();

        System.out.print("Qual é o terceiro número? ");
        double numeroC = scanner.nextDouble();

        if (numeroA > numeroB && numeroA > numeroC){ //Aplicar os operadores lógicos dentro dos parênteses
          System.out.println("O número maior é o " + numeroA);
        }else if(numeroB > numeroA && numeroB > numeroC){
          System.out.println("O número maior é o " + numeroB);
        }else{
          System.out.println("O número maior é o " + numeroC);
        }
    }
    }
