package com.fafica.atividade.erros;

public class EnderecoJaCadastradoException extends Exception{
	public EnderecoJaCadastradoException() {
		super("Endereço ja cadastrado");
	}

}
