package com.fafica.atividade1.fornecedor;

import java.util.ArrayList;

import com.fafica.atividade.erros.FornecedorCpfInvalidoException;
import com.fafica.atividade.erros.FornecedorJaCadastradoException;
import com.fafica.atividade.erros.FornecedorNaoEncontradoException;
import com.fafica.atividade.erros.FornecedorNomeInvalidoException;
import com.fafica.atividade.util.ValidarCPF;
import com.fafica.atividade.util.ValidarNome;

public class ControladorFornecedor {
	private IRepositorioFornecedor repositorioFornecedor;
	
	
	
	public ControladorFornecedor (){
		
		this.repositorioFornecedor = new RepositorioFornecedorList();
		
		
	}
	
	public void cadastrar(Fornecedor fornecedor)throws FornecedorJaCadastradoException, FornecedorNomeInvalidoException, FornecedorCpfInvalidoException {
		if(!ValidarCPF.validaCPF(fornecedor.getCpf())){
			throw new FornecedorCpfInvalidoException();
		}else if(!ValidarNome.validarNome(fornecedor.getNome())){
			throw new FornecedorNomeInvalidoException();
		}else{
		repositorioFornecedor.cadastrar(fornecedor);
		}
		
	}
	public void atualizar(Fornecedor fornecedor) throws FornecedorNaoEncontradoException{
		repositorioFornecedor.atualizar(fornecedor);
	}
	public Boolean remover(String cpf){
		
		return repositorioFornecedor.remover(cpf);
	}

	public Boolean existe(String cpf){
		return repositorioFornecedor.existe(cpf);
	}
	
	
	public void procurar (String cpf)throws FornecedorNaoEncontradoException{
		
		
		repositorioFornecedor.procurar(cpf);	
	}
	public ArrayList<Fornecedor> listar() {
		
	  return repositorioFornecedor.listar();
	}

}
