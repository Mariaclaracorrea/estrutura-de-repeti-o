package estruturarepeticao;
 
import java.util.Scanner;

public class atividade03 {
	public static void main (String[] args) {
	Scanner ler = new Scanner (System.in);
	double valor, som=0, med;
	for(double i=0; i<=4; i++) {
    System.out.println("informe o valor");
    valor = ler.nextInt();
	som+= valor;
		}
	med = som/5;
	System.out.println("a media foi: " + med);
	ler.close();

}
}