

  public class While{

    public static void main (String[] args){

     int i = 1;
      int max = 10;

      System.out.println("Contando até: " + max);

        while (i <= max){ //quando o valor de "i" deixar de ser menor que 10 a contagem enserra.
          System.out.println("Valor de i: " + i);
          i++; //soma o valor de i+1.
  }
              System.out.println(i);
//diferenças: while(se avalia primeiro a expressão e depois imprime o que é pedido.)
              //doWhile:(primeiro imprime e depois avalia)
               do {
                  i++;
                  System.out.println("Valor de i: " +i);
                } while (i < 11);
                System.out.println(i);
    }

  }
