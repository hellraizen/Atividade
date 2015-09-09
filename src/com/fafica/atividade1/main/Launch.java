package com.fafica.atividade1.main;

import com.fafica.atividade.erros.FornecedorJaCadastradoException;
import com.fafica.atividade.erros.FornecedorNaoEncontradoException;
import com.fafica.atividade1.endereco.Endereco;
import com.fafica.atividade1.fachada.Fachada;
import com.fafica.atividade1.fornecedor.FilaFornecedor;
import com.fafica.atividade1.fornecedor.Fornecedor;

public class Launch {

	public static void main(String[] args) {

		// Fachada fachada = Fachada.getInstance();

		Fornecedor fornecedor1 = new Fornecedor("Alternativo", "12345678900", "itau");
		Fornecedor fornecedor2 = new Fornecedor("Supermercado", "22345678901", "itau");
		Fornecedor fornecedor3 = new Fornecedor("Supermercado2", "22345678901", "itau");
		Endereco endereco1 = new Endereco("amisternad", "a4", "terrio", "univercitario", "caruaru", "55200000",
				fornecedor1);
		Endereco endereco2 = new Endereco("paris", "a1", "primeiro", "unive", "caruaru", "55200001", fornecedor2);
		Endereco endereco3 = new Endereco("paris", "a1", "primeiro", "unive", "caruaru", "55200001", fornecedor3);
		fornecedor1.setEndereco(endereco1);
		fornecedor2.setEndereco(endereco2);
		fornecedor3.setEndereco(endereco3);

		/*
		 * try { Fachada.getInstance().cadastrarFornecedor(fornecedor1);
		 * Fachada.getInstance().cadastrarFornecedor(fornecedor2);
		 * 
		 * // **********************Mesmo CPF************************
		 * Fachada.getInstance().cadastrarFornecedor(fornecedor3);
		 * 
		 * 
		 * 
		 * //("**********************Buscar************************");
		 * Fachada.getInstance().procurarFornecedor("22345678901");
		 * 
		 * //("************************Excluir***********************");
		 * 
		 * Fachada.getInstance().removerFornecedor("12345678900");
		 * 
		 * 
		 * 
		 * Fachada.getInstance().procurarFornecedor("12345678900");
		 * 
		 * } catch (FornecedorJaCadastradoException ex) {
		 * System.err.println(ex.getMessage()); }catch
		 * (FornecedorNaoEncontradoException e){
		 * System.err.println(e.getMessage()); }
		 * 
		 * 
		 * Fachada.getInstance().listarFornecedor();
		 * 
		 * //********************** atualizar**********************
		 * 
		 * Fornecedor fornecedor4 = new Fornecedor(1,"essecara", "22345678301",
		 * "itau"); Endereco endereco4 = new Endereco("paris", "a1", "primeiro",
		 * "unive", "caruaru", "55200001", fornecedor4);
		 * fornecedor4.setEndereco(endereco4);
		 * 
		 * Fachada.getInstance().atualizarFornecedor(fornecedor1,fornecedor4);
		 * 
		 * Fachada.getInstance().listarFornecedor();
		 * 
		 */

		FilaFornecedor fila = new FilaFornecedor();

		fila.add(fornecedor1);
		fila.add(fornecedor2);
		fila.add(fornecedor3);

		System.out.println(fila.size());

		System.out.println(fila.peek());

		fila.pool();

		System.out.println(fila.size());

		System.out.println(fila.peek());
		
		fila.pool();

		System.out.println(fila.size());

		System.out.println(fila.peek());

	}

}
