import java.util.Scanner;

public class Loiane3{

public static void main (String[] args){

  Scanner scanner = new Scanner(System.in);

  System.out.print("Qual é o seu sexo? ");
  String sexo = scanner.next();


  if (sexo.equalsIgnoreCase("f")){
      System.out.println("F - feminino");
    }else if (sexo.equalsIgnoreCase("m")){
        System.out.println("M - masculino");
      }else{
        System.out.println("Sexo inválido");

    }

    }
  }
