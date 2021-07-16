package F1;

import java.util.Scanner;

public class F2 {

	public static void main(String[] args) {
		
		int idade;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite a idade da criança: ");
		idade=leia.nextInt();

		if((idade>=6)&&(idade<=8)) {
			System.out.println("Categoria Dente de Leite: ");
		}else if((idade>=9)&&(idade<=11)) {
			System.out.println("Categoria Pré-Mirim: ");
		}else if((idade==12)||(idade==13)) {
			System.out.println("Categoria Mirim: ");
		}else if((idade==14)||(idade==15)) {
			System.out.println("Categoria Infantil: ");
		}else if((idade==16)||(idade==17)) {
			System.out.println("Categoria Juvenil: ");
		}else if((idade>=18)&&(idade<=20)) {
			System.out.println("Categoria Juniores: ");
		}else {
			System.out.println("Idade fora de categoria!: ");
		}
		
	}

}
