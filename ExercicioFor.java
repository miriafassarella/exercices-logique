import java.util.Scanner;

  public class ExercicioFor{

    public static void main (String[] args){

      Scanner scanner = new Scanner(System.in);

          boolean notaValida = true; 
            do{
        System.out.print("Entre com uma nota: ");
        double nota = scanner.nextDouble();

          if(nota>=0 && nota<=10){
            System.out.println("Você digitou: "+ nota);
            System.out.println("Nota válida!");
          } else {
            System.out.println("Nota inválida!");
          }
}while (!notaValida);
    }

  }
