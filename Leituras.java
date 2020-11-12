import java.util.scanner;
*/
public class Leituras{
    public static void Main(string args[]){

        //preciso criar o componente
        scanner teclado;
        teclado = new scanner(Syste.in); //crio o componente apontando-o para
                                        // o dispositivo de entrada padrão (teclado)
int valorinteiro;
float valorReal;
System.ou.println("por favor digite um numero inteiro");
valorInteiro = teclado.nextint();
System.out.printnl("o valor inteiro " + valorInteiro+ "foi digitado");
System.out.printnl("agora digite o valor real:");
valorReal = teclado.nextfloat();
System.out.printnl("o valor real digitado vale" +valorReal);                                  }
}