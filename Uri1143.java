import java.util.Scanner;

public class Uri1143 {

	public static void main(String[] args) {
		int N;
		Scanner teclado =new Scanner(System.in);
		N = teclado.nextInt();
		for (int i = 1; i <= N; i++) {
			for (int j = i, k = (j* i), l = (k * j);j == i ;j++) {
				System.out.print(j+" "+k+" "+l+"\n");
			}
		}

	}

}

