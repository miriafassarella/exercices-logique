import java.util.Scanner;

  public class Aula17{ //loops: entendido como continuação do programa até que a informação seja negada!

    public static void main (String[] args){

      Scanner scanner = new Scanner(System.in);
      String nome, genero, estadoSivil;
      double idade,salario;
      boolean infoValida = false;

                do{
                System.out.print("Entre com o nome: ");
                nome = scanner.next();

                  if(nome.length() >= 3){
                    infoValida = true;
                  }else{
                    System.out.println("Nome precisa de no mínimo 3 caracteres.");
                  }
                }while (!infoValida);


infoValida = false;


              do{
              System.out.print("Entre com a idade: ");
              idade = scanner.nextInt();

                if(idade >=0 && idade <= 150){
                  infoValida = true;
                }else{
                  System.out.println("Idade precisa ser entre 0 e 150.");
                }
              }while (!infoValida);

infoValida = false;
            do{
            System.out.print("Entre com o salário: ");
            salario = scanner.nextDouble();

              if(salario > 0){
                infoValida = true;
              }else{
                System.out.println("Salário precisa ser maior que 0.");
              }
            }  while (!infoValida);

infoValida = false;
            do{
            System.out.print("Entre com o gênero: ");
            genero = scanner.next();

              if(genero.equalsIgnoreCase("f") || genero.equalsIgnoreCase("m")){
                infoValida = true;
              }else{
                System.out.println("Gênero precisa ser igual a 'F' ou 'M'.");
              }
            }while (!infoValida);

            infoValida = false;
            do{
            System.out.print("Entre com o Estado Sivil: ");
            estadoSivil= scanner.next();

              if(estadoSivil.equalsIgnoreCase("c") || estadoSivil.equalsIgnoreCase("s") || estadoSivil.equalsIgnoreCase("d") || estadoSivil.equalsIgnoreCase("v")){
                infoValida = true;
              }else{
                System.out.println("Estado Sivil precisa ser 'c', 's', 'd' ou 'v'.");
              }
            }while (!infoValida);

         System.out.println("As informações coletadas foram: ");
         System.out.println("Nome: " + nome);
         System.out.println("Idade: " + idade);
         System.out.println("Salário: " + salario);
         System.out.println("Gênero: " + genero);
         System.out.println("Estado Silvil: " + estadoSivil);

}
}
