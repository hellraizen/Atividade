package com.fafica.atividade.erros;

public class FornecedorNomeInvalidoException extends Exception{
	
	public FornecedorNomeInvalidoException(){
		super("Nome deve conter mais de 4 caracteres");
	}

}
