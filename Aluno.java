import java.util.Scanner;

public class Aluno {

public static void main (String[] args){

Scanner scanner = new Scanner(System.in);

System.out.print("Qual é a sua primeira nota? ");
double primeiraNota = scanner.nextDouble();

System.out.print("Qual é a sua segunda nota? ");
double segundaNota = scanner.nextDouble();

double media = (primeiraNota + segundaNota) / 2;

System.out.println("A média do aluno foi:  "+ media +".");

boolean Aprovado = media >= 7;
boolean Recuperação = media >= 5;
boolean AlunoRecuperacao = media < 7;

      if (Aprovado) {
        System.out.println("Aluno Aprovado");
      } else  {
        if (Recuperação && AlunoRecuperacao) {
          System.out.println("Aluno em Recuparação");
        }
        else{
          System.out.println("Aluno Reprovado");
        }
      }

System.out.println("FIM");

scanner.close ();


}

}
