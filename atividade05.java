package estruturarepeticao;

import java.util.Scanner;

public class atividade05 {
	public static void main (String[] args) {
		} {
		    
 try (Scanner ent = new Scanner(System.in)) {
 int num, fat = 1;
 int cont = 1;

 do{
 System.out.println("Digite um nº");
 num = ent.nextInt();
				    
 for(int i = 1;i <= num; i++){
 fat = fat * i;
				    }
				    
 System.out.println("!" + num + " = " + fat);
 cont++;
				    
      }while(cont < 2);
		ler.close();
			}
		}
	}

