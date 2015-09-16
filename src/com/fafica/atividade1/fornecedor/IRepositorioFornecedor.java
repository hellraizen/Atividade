package com.fafica.atividade1.fornecedor;

import java.util.ArrayList;

import com.fafica.atividade.erros.FornecedorJaCadastradoException;
import com.fafica.atividade.erros.FornecedorNaoEncontradoException;

public interface IRepositorioFornecedor {

	public void cadastrar(Fornecedor fornecedor) throws FornecedorJaCadastradoException;
	
	public void atualizar(Fornecedor fornecedor)throws FornecedorNaoEncontradoException;

	public Boolean remover(String cpf);

	public Fornecedor procurar(String cpf)throws FornecedorNaoEncontradoException;

	public Boolean existe(String cpf);

	public ArrayList<Fornecedor> listar();



}
