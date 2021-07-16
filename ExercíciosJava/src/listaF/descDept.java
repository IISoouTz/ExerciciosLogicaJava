package F1;

import java.util.Scanner;

public class descDept {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner (System.in);
		
		int cod, dept;
		
		System.out.println("Digite o código do departamento: ");
		cod=leitura.nextInt();

		if(cod==10) {
			System.out.println("Seu departamento é o de Contabilidade!: ");
		}else if (cod==12) {
			System.out.println("Seu departamento é o de Almoxarifado!: ");
		}else if (cod==14) {
			System.out.println("Seu departamento é o de Informática!: ");
		}else {
			System.out.println("Código Inválido!");
		}
		
	}

}
