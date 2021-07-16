package F1;

import java.util.Scanner;

public class F4 {

	public static void main(String[] args) {
		float nota1, nota2, nota3, nota4, notaex, med;


		Scanner leitura = new Scanner (System.in);
		
		System.out.println("Digite a primeira nota: ");
		nota1=leitura.nextFloat();
		System.out.println("Digite a segunda nota: ");
		nota2=leitura.nextFloat();
		System.out.println("Digite a terceira nota: ");
		nota3=leitura.nextFloat();
		System.out.println("Digite a quarta nota: ");
		nota4=leitura.nextFloat();
		
		med=(nota1+nota2+nota3+nota4)/4;
		med=(notaex+med)/2;
		
		
		if(med==7) {
			System.out.println("Você está aprovado!: " + med);
		}else if((med > 7)&&(med < 11)) {
			System.out.println("Você está aprovado!: " + med);
		}else if(med < 7) {
			System.out.println("Nota de Exame: " + med);
		}else if(notaex > 5) {
			System.out.println("Você está aprovado!: " + med);
		}else {
			System.out.println("Nota inválida!: " + med);
		}
	
		
	}

}
