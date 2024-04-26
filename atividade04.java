package estruturarepeticao;
import java.util.Scanner;


public class atividade04 {
	public static void main (String[] args) {
	try (Scanner ler = new Scanner(System.in)) {
		int somaimpar=0, somapar=0, numero=0;
		
		
		for(int i=1; i<=10; i++) {
			System.out.println("informe um numero:");
			numero = ler.nextInt();
			if (numero %2 == 0) {
				somapar++;
			}
			else {
				int somaimpar1 = 0;
				somaimpar1++;
			}

		}
		System.out.println("A quantidade de numeros pares é: " + somapar);
		System.out.println("A quantidade de numeros impares é: " + somaimpar);
	}
}
}

