package listaL;

import java.util.Scanner;

public class listaL4 {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner (System.in);
		
		int ntab;
		int contador;
		int resultado;
		
		System.out.println("Digite a tabuada: ");
		ntab=leitura.nextInt();
		
		for(contador=1;contador<=10; contador++) {
			resultado=ntab*contador;
			System.out.println(ntab + "X" + contador + " = " + resultado);
		}
		

		
		
		
	}

}
