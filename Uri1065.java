import java.util.Scanner;

public class Uri1065 {
    public static void main(String args []) {
        Scanner leitor = new Scanner(System.in);
        int x;
        int cont = 0;
        for (int i = 0; i < 5; i++) {
        	x = leitor.nextInt();
        	if (x % 2 == 0 ) cont++;
        }
        System.out.println(cont + " valores pares");
    }
	
}