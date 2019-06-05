import java.util.Scanner;

public class Loiane4{

  public static void main (String[] args){

    Scanner scanner = new Scanner(System.in);

      System.out.print("Qual é a letra? ");
      String letra = scanner.next();




          /*if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")){
            System.out.println("Esta é uma vogal");
          }else {
            System.out.println("Esta é uma consoante");
          }*/

          switch (letra) {
            case "a":
              case "e":
                case "i":
                  case "o":
                    case "u": System.out.println("Esta é uma vogal"); break;
                    default: System.out.println("Esta é uma consoante");


          }

  }
}
