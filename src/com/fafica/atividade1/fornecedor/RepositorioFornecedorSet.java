package com.fafica.atividade1.fornecedor;

import java.util.ArrayList;
import java.util.TreeSet;
import com.fafica.atividade.erros.FornecedorJaCadastradoException;
import com.fafica.atividade.erros.FornecedorNaoEncontradoException;

public class RepositorioFornecedorSet implements IRepositorioFornecedor {

	TreeSet<Fornecedor> arraySetFornecedor;
	int index;

	public RepositorioFornecedorSet() {
		arraySetFornecedor = new TreeSet<Fornecedor>();
		index = 1;
		index++;
	}

	@Override
	public void cadastrar(Fornecedor fornecedor) throws FornecedorJaCadastradoException {
		fornecedor.setCodigo(index);
		arraySetFornecedor.add(fornecedor);
	}

	@Override
	public void atualizar(Fornecedor fornecedor) {
		int i = fornecedor.getCodigo();
		for (Fornecedor fornecedor2 : arraySetFornecedor) {
			if (i == fornecedor2.getCodigo()) {
				arraySetFornecedor.remove(fornecedor2);
			}
		}
		arraySetFornecedor.add(fornecedor);
	}

	@Override
	public Boolean remover(String cpf) {
		for (Fornecedor fornecedor : arraySetFornecedor) {
			if (cpf.equals(fornecedor.getCpf())) {
				arraySetFornecedor.remove(fornecedor);
				return true;
			}
		}
		return false;
	}

	@Override
	public Fornecedor procurar(String cpf) throws FornecedorNaoEncontradoException {
		for (Fornecedor fornecedor : arraySetFornecedor) {
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
		for (Fornecedor fornecedor : arraySetFornecedor) {
			if(cpf.equals(fornecedor.getCpf())){
				return true;
			}
		}
		return false;
	}

	@Override
	public ArrayList<Fornecedor> listar() {
		ArrayList<Fornecedor> arrayListfornecedorLocal = new ArrayList<Fornecedor>();
		for (Fornecedor fornecedor : arraySetFornecedor) {
			arrayListfornecedorLocal.add(fornecedor);
		}
		
		return arrayListfornecedorLocal;
	}

}
