import java.util.Scanner;

public class ExercicioGuanabara {

public static void main (String[] args) {

Scanner scanner = new Scanner (System.in);

System.out.print("Em que ano eu nasci? ");
double ano = scanner.nextDouble();

System.out.print("Em que ano nós estamos? ");
double anoAtual = scanner.nextDouble();

double Resultado = anoAtual - ano;

System.out.println("Eu tenho exatamente: "+ Resultado +" anos.");

boolean condicao = Resultado >= 21;

if(condicao){

  System.out.println("Vous êtes déjà majeur");
}
else {
  System.out.println("Você ainda não é de maior");
}
scanner.close();
}


}
