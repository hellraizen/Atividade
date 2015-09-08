package com.fafica.atividade1.fachada;

import java.util.ArrayList;

import com.fafica.atividade.erros.FornecedorJaCadastradoException;
import com.fafica.atividade.erros.FornecedorNaoEncontradoException;
import com.fafica.atividade1.endereco.ControladorEndereco;
import com.fafica.atividade1.endereco.Endereco;
import com.fafica.atividade1.fornecedor.ControladorFornecedor;
import com.fafica.atividade1.fornecedor.Fornecedor;


public class Fachada {
	private static Fachada instance;
	private ControladorFornecedor controladorFornecedor;
	private ControladorEndereco controladorEndereco;
	
	

	private Fachada(){
		this.controladorFornecedor = new ControladorFornecedor();
		this.controladorEndereco = new ControladorEndereco();
		
	}
	    public static Fachada getInstance() {
	    	if (Fachada.instance == null){
	    		Fachada.instance = new Fachada();
	    	}
	    	return Fachada.instance;
	    }
		
	    //area do fornecedor
	    
		public void cadastrarFornecedor(Fornecedor fornecedor) throws FornecedorJaCadastradoException {			
			controladorFornecedor.cadastrar(fornecedor);
			controladorEndereco.cadastrar(fornecedor.getEndereco());
		
		}
		
		public void atualizarFornecedor(Fornecedor fornecedor,Fornecedor fornecedor1){
			controladorFornecedor.atualizar(fornecedor,fornecedor1);
		}
		public Boolean removerFornecedor(String cpf){
			return controladorFornecedor.remover(cpf);
		}
		public Boolean existe(String cpf){
			return controladorFornecedor.existe(cpf);
		}
		
		public void procurarFornecedor(String cpf)throws FornecedorNaoEncontradoException{
		 controladorFornecedor.procurar(cpf);
		 
		}
		
		public ArrayList<Fornecedor> listarFornecedor(){
			return controladorFornecedor.listar();
		}
		


}
