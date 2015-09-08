package com.fafica.atividade1.fornecedor;

import java.util.ArrayList;

import com.fafica.atividade.erros.FornecedorJaCadastradoException;
import com.fafica.atividade.erros.FornecedorNaoEncontradoException;

public interface IRepositorioFornecedor {

	public void cadastrar(Fornecedor fornecedor) throws FornecedorJaCadastradoException;

	public Boolean remover(String cpf);

	public void procurar(String cpf)throws FornecedorNaoEncontradoException;

	public Boolean existe(String cpf);

	public ArrayList<Fornecedor> listar();

	void atualizar(Fornecedor fornecedor, Fornecedor fornecedor1);

}
