import java.util.Scanner;

  public class ForDoWhile{

    public static void main(String[] args){

      Scanner scanner = new Scanner(System.in);
      boolean infoValida = false;
      do{
        System.out.print("Entre com o nome: ");
        String nome = scanner.next();

        System.out.print("Entre com a senha: ");
        String senha = scanner.next();

          if(nome.equalsIgnoreCase(senha)){
            System.out.println("Nome igual a senha, digite novamente!");
          }else {
            infoValida = true;
            System.out.println("Informações gravadas com sucesso!");
          }
} while(!infoValida);//Faça enquanto!



    }
  }
