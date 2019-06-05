import java.util.Scanner;

public class MaisExercicios {

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

System.out.print("Por favor, informe o valor total: ");
double valorTotal = scanner.nextDouble();

boolean valorMinimo = valorTotal >= 50;
double desconto = 0;

if (valorMinimo){
desconto = 10.0;

  }

else {
System.out.println("Não há desconto para esse valor!");


}
double valorDesconto = (valorTotal * desconto)/100;
double valorComDesconto = valorTotal - valorDesconto;


System.out.println("O valor da sua compra é: "+ valorComDesconto+ ".");


}

}
