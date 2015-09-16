package com.fafica.atividade1.fornecedor;

import java.util.ArrayList;

import com.fafica.atividade.erros.FornecedorJaCadastradoException;
import com.fafica.atividade.erros.FornecedorNaoEncontradoException;

public class RepositorioFornecedorMap implements IRepositorioFornecedor{

	@Override
	public void cadastrar(Fornecedor fornecedor) throws FornecedorJaCadastradoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(Fornecedor fornecedor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boolean remover(String cpf) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Fornecedor procurar(String cpf) throws FornecedorNaoEncontradoException {
		return null;
		
	}

	@Override
	public Boolean existe(String cpf) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Fornecedor> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
