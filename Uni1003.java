import java.util.Scanner;
public class Uni1003{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int A,B, SOMA;

    // entrada
    //System.out.printin("digite um numero inteiro = ");
    A = teclado.nextInt();

   //System.out.printin("digite mais um numero inteiro = ");
    B = teclado.nextInt();

    // processamento
    SOMA = A + B;

    // saida
    System.out.println("SOMA = " + SOMA);
    }
    }