package F1;

import java.util.Scanner;

public class F3 {

	public static void main(String[] args) {
		float nota1, nota2, nota3, nota4, med;
		
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
		
		if(med==5) {
			System.out.println("Voc� est� aprovado!: " + med);
		}else if((med > 5)&&(med < 11)) {
			System.out.println("Voc� est� aprovado!: " + med);
		}else if(med < 5) {
			System.out.println("Voc� est� reprovado!: " + med);
		}else {
			System.out.println("Nota inv�lida!: " + med);
		
		
		}

	}

}
