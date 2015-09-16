package com.fafica.atividade1.fornecedor;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

import com.fafica.atividade.erros.FornecedorJaCadastradoException;
import com.fafica.atividade.erros.FornecedorNaoEncontradoException;

public class RepositorioFornecedorMap implements IRepositorioFornecedor {

	Map<Integer, Fornecedor> mapFornecedor;
	Integer index;

	public RepositorioFornecedorMap() {
		mapFornecedor = new TreeMap<Integer, Fornecedor>();
		index = 1;

	}

	@Override
	public void cadastrar(Fornecedor fornecedor) throws FornecedorJaCadastradoException {
		fornecedor.setCodigo(index);
		mapFornecedor.put(index, fornecedor);
		index++;

	}

	@Override
	public void atualizar(Fornecedor fornecedor) {
		Integer i = fornecedor.getCodigo();
		mapFornecedor.put(i, fornecedor);

	}

	@Override
	public Boolean remover(String cpf) {
		for (int i = 1; i < mapFornecedor.size(); i++) {
			Fornecedor fornecedor = mapFornecedor.get(i);
			if (cpf.equals(fornecedor.getCpf())) {
				mapFornecedor.remove(fornecedor);
				return true;
			}
		}
		return false;
	}

	@Override
	public Fornecedor procurar(String cpf) throws FornecedorNaoEncontradoException {
		for (int i = 1; i < mapFornecedor.size(); i++) {
			Fornecedor fornecedor = mapFornecedor.get(i);
			if (cpf.equals(fornecedor.getCpf())) {
				return fornecedor;
			}else{
				throw new FornecedorNaoEncontradoException();
			}
		}
		return null;

	}

	@Override
	public Boolean existe(String cpf) {
		for (int i = 1; i < mapFornecedor.size(); i++) {
			Fornecedor fornecedor = mapFornecedor.get(i);
			if (cpf.equals(fornecedor.getCpf())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public ArrayList<Fornecedor> listar() {
		ArrayList<Fornecedor> arrayListfornecedorLocal = new ArrayList<Fornecedor>();
		for (int i = 1; i < mapFornecedor.size(); i++) {
			Fornecedor fornecedor = mapFornecedor.get(i);
			arrayListfornecedorLocal.add(fornecedor);
			
		}
		return arrayListfornecedorLocal;
	}

}
