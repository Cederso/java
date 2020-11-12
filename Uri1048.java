import java.util.Scanner;
public class URI_1048 {
	public static void main(String args []) {

        Scanner teclado =new Scanner(System.in);
        int parcent;
		float sal, novsal, reaj;
		
	
		sal =teclado.nextFloat();
		
		if (sal >= 0 && sal <= 400.00) {
            novsal = sal + sal * 0.15;
            reaj = novsal - sal;
            System.out.printf("Novo salario: %.2f\n",novsal);
	    	System.out.printf("Reajuste ganho: %.2f\n",reaj);
		    System.out.print("Em percentual: 15 %%\n");
			
		}else if (sal >= 400.01 && sal <= 800.00) {
            novsal = sal + sal * 0.12;
            reaj = novsal - sal;
            System.out.printf("Novo salario: %.2f\n",novsal);
	    	System.out.printf("Reajuste ganho: %.2f\n",reaj);
		    System.out.print("Em percentual: 12 %%\n");
            
		}else if (sal >= 800.01 && sal <= 1200.00) {
            novsal = sal + sal * 0.10;
            reaj = novsal - sal;
            System.out.printf("Novo salario: %.2f\n",novsal);
	    	System.out.printf("Reajuste ganho: %.2f\n",reaj);
		    System.out.print("Em percentual: 10 %%\n");
            
			
		}else if (sal >= 1200.01 && sal <= 2000.00) {
            novsal = sal + sal * 0.07;
            reaj = novsal - sal;
            System.out.printf("Novo salario: %.2f\n",novsal);
	    	System.out.printf("Reajuste ganho: %.2f\n",reaj);
		    System.out.print("Em percentual: 0,07 %%\n");
            

		}else if (sal >= 2000.01) {
			novsal = sal + sal * 0.04;
            reaj = novsal - sal;
            System.out.printf("Novo salario: %.2f\n",novsal);
	    	System.out.printf("Reajuste ganho: %.2f\n",reaj);
		    System.out.print("Em percentual: 0,04 %%\n");
		}

	}

}