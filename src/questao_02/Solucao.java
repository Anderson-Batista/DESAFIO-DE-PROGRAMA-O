package questao_02;

import java.util.Scanner;

public class Solucao {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite sua senha:");
		String str = entrada.next();

		boolean temNumero = false, temCaractereEspecial = false;

		int quantidadeDeCaracteresSenha = str.length();

		// verifica se o char � um numero
		for (int i = 0; i < str.length(); i++) {

			if (Character.isDigit(str.charAt(i))) {
				temNumero = true;
				break;
			}
		}

		if (str.toLowerCase() == str) {
			System.out.println("Deve Conter no m�nimo 1 letra em mai�sculo.");
		}

		if (str.toUpperCase() == str) {
			System.out.println("Deve Conter no m�nimo 1 letra em min�sculo.");
		}

		if (!temNumero) {
			System.out.println("Deve Conter no m�nimo 1 digito.");
		}

		if (str.contains("!") || str.contains("@") || str.contains("#") || str.contains("$") || str.contains("%")
				|| str.contains("^") || str.contains("&") || str.contains("*") || str.contains("(") || str.contains(")")
				|| str.contains("-") || str.contains("+")) {

			temCaractereEspecial = true;
		}

		if (!temCaractereEspecial) {
			System.out.println("Deve Conter no m�nimo 1 caractere especial");
		}

		if (quantidadeDeCaracteresSenha < 6) {
			quantidadeDeCaracteresSenha = (quantidadeDeCaracteresSenha - 6) * -1;
			

			System.out.println("Deve Possuir no m�nimo 6 caracteres.");
			System.out.println();
			System.out.println(quantidadeDeCaracteresSenha);
		}

		System.out.println();
		entrada.close();
	}

}
