package com.fafica.atividade1.endereco;

import java.util.ArrayList;

import com.fafica.atividade.erros.EnderecoJaCadastradoException;

public class RepositorioEnderecoList implements IRepositorioEndereco {

	private ArrayList<Endereco> arrayListEndereco;

	public RepositorioEnderecoList() {
		arrayListEndereco = new ArrayList<Endereco>();

	}

	@Override
	public void cadastrar(Endereco endereco) throws EnderecoJaCadastradoException {
		if (!existe(endereco.getFornecedor().getCodigo())) {
			arrayListEndereco.add(endereco);
		} else {
			throw new EnderecoJaCadastradoException();
		}
	}

	@Override
	public void atualizar(Endereco endereco) {
		int i = endereco.getFornecedor().getCodigo();
		for (Endereco endereco1 : arrayListEndereco) {
			if (endereco1.getFornecedor().getCodigo().equals(i)) {
				arrayListEndereco.add(i, endereco);
			} else {
				System.out.println("endereco não encontrado");
			}
		}

	}

	@Override
	public Boolean remover(Integer id) {
		for (Endereco endereco : arrayListEndereco) {
			if (id == endereco.getFornecedor().getCodigo()) {
				arrayListEndereco.remove(id);
				return true;
			}
		}
		return false;
	}

	@Override
	public Endereco procurar(Integer id) {
		for (Endereco endereco : arrayListEndereco) {
			if (id == endereco.getFornecedor().getCodigo()) {
				return endereco;
			}
		}
		return null;
	}

	@Override
	public Boolean existe(Integer id) {
		for (Endereco endereco : arrayListEndereco) {
			if (id == endereco.getFornecedor().getCodigo()) {
				return true;
			}
		}
		return false;
	}

	@Override
	public ArrayList<Endereco> listar() {
		
		return arrayListEndereco;
	}

}
