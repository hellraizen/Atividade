package com.fafica.atividade1.fornecedor;

import java.util.ArrayList;

import com.fafica.atividade.erros.FornecedorJaCadastradoException;
import com.fafica.atividade.erros.FornecedorNaoEncontradoException;
import com.fafica.atividade.util.ValidarCPF;
import com.fafica.atividade.util.ValidarNome;

public class ControladorFornecedor {
	private IRepositorioFornecedor repositorioFornecedor;
	
	
	
	public ControladorFornecedor (){
		
		this.repositorioFornecedor = new RepositorioFornecedor();
		
		
	}
	
	public void cadastrar(Fornecedor fornecedor)throws FornecedorJaCadastradoException {
		if(!ValidarCPF.validaCPF(fornecedor.getCpf())){
			System.out.println("Cpf invalido");
		}else if(!ValidarNome.validarNome(fornecedor.getNome())){
			System.out.println("Nome deve conter mais de 4 caracteres");
		}else{
		repositorioFornecedor.cadastrar(fornecedor);
		}
		
	}
	public void atualizar(Fornecedor fornecedor, Fornecedor fornecedor1){
		repositorioFornecedor.atualizar(fornecedor,fornecedor1);
	
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
