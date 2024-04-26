package estruturarepeticao;

import java.util.Scanner;

public class atividade02 {
	
 public static void main(String[] argss){
	 
Scanner ler = new Scanner (System.in);
    	  
 int numero1, numero2;
    	  
 System.out.println("informe o primeiro numero");
    	  
 int numeros = ler.nextInt();
    	  
 System.out.println("informe o segundo numero");
    	  
 numero1 = ler.nextInt();
    	  
 for(int i=numeros ; i <=numero1; i++) {
    		  
 if (i %2 == 1) {
    		  
 System.out.println("o numero é impar");
    		  
  ler.close();
    		  
    	  
        	}
    	
    }
    }
    	 
    	  
      }
