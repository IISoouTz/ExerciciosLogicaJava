package F1;

import java.util.Scanner;

public class F7 {

	public static void main(String[] args) {
		
		int x, y, z;
		
		Scanner leitura = new Scanner (System.in);
		
		if (x < y + z )||(y < x + z )||( z < x+y) {
			System.out.println("Trata-se de um triangulo");
		}
	}

}
