package com.fafica.atividade1.fachada;

import java.util.ArrayList;

import com.fafica.atividade.erros.EnderecoJaCadastradoException;
import com.fafica.atividade.erros.FornecedorCpfInvalidoException;
import com.fafica.atividade.erros.FornecedorJaCadastradoException;
import com.fafica.atividade.erros.FornecedorNaoEncontradoException;
import com.fafica.atividade.erros.FornecedorNomeInvalidoException;
import com.fafica.atividade1.endereco.ControladorEndereco;
import com.fafica.atividade1.endereco.Endereco;
import com.fafica.atividade1.fornecedor.ControladorFornecedor;
import com.fafica.atividade1.fornecedor.Fornecedor;

public class Fachada {
	private static Fachada instance;
	private ControladorFornecedor controladorFornecedor;
	private ControladorEndereco controladorEndereco;

	private Fachada() {
		this.controladorFornecedor = new ControladorFornecedor();
		this.controladorEndereco = new ControladorEndereco();

	}

	public static Fachada getInstance() {
		if (Fachada.instance == null) {
			Fachada.instance = new Fachada();
		}
		return Fachada.instance;
	}

	

	public void cadastrarFornecedor(Fornecedor fornecedor) throws FornecedorJaCadastradoException,
			FornecedorNomeInvalidoException, FornecedorCpfInvalidoException, EnderecoJaCadastradoException {
		controladorFornecedor.cadastrar(fornecedor);
		controladorEndereco.cadastrar(fornecedor.getEndereco());

	}

	public void atualizarFornecedor(Fornecedor fornecedor)
			throws FornecedorNaoEncontradoException, FornecedorJaCadastradoException {
		controladorFornecedor.atualizar(fornecedor);
		controladorEndereco.atualizar(fornecedor.getEndereco());
	}

	public Boolean removerFornecedor(String cpf) {

		return controladorFornecedor.remover(cpf);
	}

	public Boolean removerEndereco(Integer id) {
		return controladorEndereco.remover(id);
	}

	public Boolean existeFornecedor(String cpf) {
		return controladorFornecedor.existe(cpf);
	}

	public Boolean existeEndereco(Integer id) {
		return controladorEndereco.existe(id);
	}

	public Fornecedor procurarFornecedor(String cpf) throws FornecedorNaoEncontradoException {
		return controladorFornecedor.procurar(cpf);

	}

	public Endereco procurarEndereco(Integer id) {
		return controladorEndereco.procurar(id);
	}

	public ArrayList<Fornecedor> listarFornecedor() {
		return controladorFornecedor.listar();
	}
	public ArrayList<Endereco> listarEndereco(){
		return controladorEndereco.listar();
	}

}
