package desafios;

import java.util.Scanner;

public class Desafio03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String nomeMaisNovo = "";
		int idadeMaisNova = Integer.MAX_VALUE;

		for (int i = 1; i <= 10; i++) {
			System.out.println("Informe o nome da pessoa " + i + ": ");
			String nome = scanner.nextLine();

			System.out.println("Informe a idade da pessoa " + i + ": ");
			int idade = scanner.nextInt();
			scanner.nextLine();

			if (idade < idadeMaisNova) {
				idadeMaisNova = idade;
				nomeMaisNovo = nome;
			}
		}

		System.out.println("A pessoa mais nova é: " + nomeMaisNovo);

		scanner.close();
	}

}
