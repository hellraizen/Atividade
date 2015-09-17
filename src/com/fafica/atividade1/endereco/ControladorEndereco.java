package com.fafica.atividade1.endereco;

import java.util.ArrayList;

import com.fafica.atividade.erros.EnderecoJaCadastradoException;

public class ControladorEndereco {
	private IRepositorioEndereco repositorioEndereco;
	
	public ControladorEndereco (){
		this.repositorioEndereco = new RepositorioEnderecoList();
		
	}
	
	public void cadastrar(Endereco endereco) throws EnderecoJaCadastradoException{
		repositorioEndereco.cadastrar(endereco);
		
		
	}
	public void atualizar(Endereco endereco){
		repositorioEndereco.atualizar(endereco);
	}
	public Boolean remover(Integer id){
		
		return repositorioEndereco.remover(id);
	}
	public Boolean existe(Integer id) {
		return repositorioEndereco.existe(id);
	}

	public Endereco procurar (Integer id){
		return repositorioEndereco.procurar(id);
	}
	public ArrayList<Endereco> listar(){
		 return repositorioEndereco.listar();
	}

}
