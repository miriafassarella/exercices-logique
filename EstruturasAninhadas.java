import java.util.Scanner;

public class EstruturasAninhadas{



public static void main(String[] args){


  int hora = 20;

if (hora < 0) //primeiro exemplo!
    System.out.print("Erro: A hora deve ser maior que 0.");
else if (hora >= 24)
    System.out.print("Erro: A hora deve ser menor que 24.");
else if (hora <= 12)
    System.out.print(hora + " AM é o mesmo que " + hora + " horas.");
else
    System.out.print(hora + " PM é o mesmo que " + hora + " horas.");
}


int hora = 20; //segundo exemplo!

if (hora < 0)
    System.out.print("Erro: A hora deve ser maior que 0.");
else
    if (hora >= 24)
        System.out.print("Erro: A hora deve ser menor que 24.");
    else
        if (hora <= 12)
            System.out.print(hora + " AM é o mesmo que " + hora + " horas.");
        else
            System.out.print(hora + " PM é o mesmo que " + hora + " horas.");



}
}
