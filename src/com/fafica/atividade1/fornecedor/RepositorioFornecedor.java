package com.fafica.atividade1.fornecedor;

import java.util.ArrayList;

import com.fafica.atividade.erros.FornecedorJaCadastradoException;
import com.fafica.atividade.erros.FornecedorNaoEncontradoException;

public class RepositorioFornecedor implements IRepositorioFornecedor {

	private int index;
	private Fornecedor[] fornecedorArray = new Fornecedor[200];

	IRepositorioFornecedor repositorioFornecedor;

	@Override
	public void cadastrar(Fornecedor fornecedor) throws FornecedorJaCadastradoException {

		if (!existe(fornecedor.getCpf())) {

			fornecedorArray[index] = fornecedor;
			fornecedor.setCodigo(index+1);
			index++;
			System.out.println("Cadastrado com Sucesso o Fornecedor " + fornecedor.getNome());
		} else {
			throw new FornecedorJaCadastradoException();
		}

	}

	@Override
	public void atualizar(Fornecedor fornecedor) {

	
	}

	@Override
	public Boolean remover(String cpf) {
		for (int i = 0; i < fornecedorArray.length; i++) {
			Fornecedor obj = fornecedorArray[i];
			if (obj.getCpf() == cpf) {
				fornecedorArray[i] = null;

				return true;
			}
		}
		return false;
	}

	@Override
	public Fornecedor procurar(String cpf) throws FornecedorNaoEncontradoException {
		for (Fornecedor fornecedor : fornecedorArray) {
			if (fornecedor != null) {

				if (fornecedor.getCpf() == cpf) {
					System.out.println("Codigo: " + fornecedor.getCodigo());
					System.out.println("NOME: " + fornecedor.getNome());
					System.out.println("Banco: " + fornecedor.getBanco());
					System.out.println("CPf: " + fornecedor.getCpf());
					System.out.println("Bairro: " + fornecedor.getEndereco().getBairro());
					System.out.println("Cep: " + fornecedor.getEndereco().getCep());
					System.out.println("Cidade: " + fornecedor.getEndereco().getCidade());
					System.out.println("Complemento: " + fornecedor.getEndereco().getComplemento());
					System.out.println("numero: " + fornecedor.getEndereco().getNumero());
					System.out.println("rua: " + fornecedor.getEndereco().getRua());
					System.out.println("-----------------------------------------------------------------------");

				} else {
					throw new FornecedorNaoEncontradoException();
				}
			}

		}
		return null;

	}

	@Override
	public Boolean existe(String cpf) {
		for (Fornecedor fornecedor : fornecedorArray) {

			if (fornecedor != null) {
				if (fornecedor.getCpf().equals(cpf)) {
					return true;
				}
			}

		}
		return false;
	}

	@Override
	public ArrayList<Fornecedor> listar() {
		ArrayList<Fornecedor> fornecedorArrayList = new ArrayList<>();
		for (int i = 0; i < index; i++) {

			fornecedorArrayList.add(fornecedorArray[i]);

		}

		System.out.println(fornecedorArrayList.toString());

		return fornecedorArrayList;

	}
}
