package questao_03;

import java.util.ArrayList;

public class Solucao {

	public static void main(String[] args) {

		String palavra = "ovo";
		ArrayList<String> anagrama = new ArrayList<String>();

		for (int i = 0; i < palavra.length(); i++) {
			for (int j = 1; j < palavra.length(); j++) {
				if (palavra.charAt(i) == palavra.charAt(j) && i != j && i < j) {
					if (palavra.charAt(i) == palavra.charAt(i + 1)) {
						String x = palavra.substring(i, i + 1);
						anagrama.add(x);
					} else {
						String y = palavra.substring(i, j);
						String z = palavra.substring(i + 1, j + 1);
						String h = palavra.substring(i, i + 1);
						anagrama.add(h);
						anagrama.add(y);
						anagrama.add(z);
					}
				}
			}
		}

		System.out.println(anagrama.size());
	}
}
