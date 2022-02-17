package questão_01;

import java.util.Scanner;

public class Solucao {
	
	static void escada(int n) {
		String str = "*";
			for(int i = 0; i < n; i++) {
				System.out.printf("%" + n + "s\n", str);
				str += "*";
			}
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um número:");
		int n = entrada.nextInt();
		escada(n);
		entrada.close();
	}
}
