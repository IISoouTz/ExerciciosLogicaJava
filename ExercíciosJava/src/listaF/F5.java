package F1;

import java.util.Scanner;

public class F5 {

	public static void main(String[] args) {
		float sal, cod, perc;
		
		double reaj=0;
		
		Scanner leitura = new Scanner (System.in);
		
		System.out.println("Digite o salário: ");
		sal=leitura.nextFloat();
		
		System.out.println("Digite o código do salário: ");
		cod=leitura.nextFloat();
		
		if(cod==1) {
			reaj=sal/100*5;
		}else if(cod==2) {
			reaj=sal/100*10;
		}else if(cod==3) {
			reaj=sal/100*15;
		}else if(cod==4) {
			reaj=sal/100*20;
		}else if(cod==5) {
			reaj=sal/100*25;
		}else if (cod==6) {
			reaj=sal/100*30;
		}else {
			System.out.println("Código inválido: ");
		}
		
		System.out.println("O seu reajuste é: " + reaj);
		
		
		
		
	}

}
