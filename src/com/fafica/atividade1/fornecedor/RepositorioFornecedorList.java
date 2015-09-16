package com.fafica.atividade1.fornecedor;

import java.util.ArrayList;

import com.fafica.atividade.erros.FornecedorJaCadastradoException;
import com.fafica.atividade.erros.FornecedorNaoEncontradoException;

public class RepositorioFornecedorList implements IRepositorioFornecedor{
	private ArrayList<Fornecedor> arrayListFornecedor;
	private int index;
	
	
	public RepositorioFornecedorList() {
		arrayListFornecedor=new ArrayList<Fornecedor>();
		index=1;
	}
	

	@Override
	public void cadastrar(Fornecedor fornecedor) throws FornecedorJaCadastradoException {
		fornecedor.setCodigo(index);
		arrayListFornecedor.add(fornecedor);
		index++;
		
	}

	@Override
	public void atualizar(Fornecedor fornecedor) throws FornecedorNaoEncontradoException {
		int i = fornecedor.getCodigo();
		if(i==-1) throw new FornecedorNaoEncontradoException();
		arrayListFornecedor.add(i, fornecedor);	
		
		
	}

	@Override
	public Boolean remover(String cpf) {
		
		for (Fornecedor fornecedor : arrayListFornecedor) {
			if(cpf.equals(fornecedor.getCpf())){
				int i = fornecedor.getCodigo();
				arrayListFornecedor.remove(i);
				return true;
			}
		}
		
		return false ;
	}

	@Override
	public Fornecedor procurar(String cpf) throws FornecedorNaoEncontradoException {
		for(Fornecedor fornecedor: arrayListFornecedor){
			if(cpf.equals(fornecedor.getCpf())){
				return fornecedor;
			}else{
				throw new FornecedorNaoEncontradoException();
			}
		}
		return null;
		
	}

	@Override
	public Boolean existe(String cpf) {
	   for(Fornecedor fornecedor: arrayListFornecedor){
		   if(cpf.equals(fornecedor.getCpf())){
			   return true;
		   }
	   }
		return false;
	}

	@Override
	public ArrayList<Fornecedor> listar() {
		
		return arrayListFornecedor;
	}
	

}
