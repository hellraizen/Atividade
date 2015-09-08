package com.fafica.atividade.util;

public class ValidarNome {
	public static boolean validarNome(String nome) {
		for (int i = 0; i < nome.length(); i++) {

			if (nome.length() < 4) {
				System.out.println("Nome muito Pequeno, precisa ser mais que 4 caracteres");
				return false;
			}

		}
		System.out.println("Nome Valido ");
		return true;
	}
}
