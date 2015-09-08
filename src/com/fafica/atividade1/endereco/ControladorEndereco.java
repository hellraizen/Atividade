package com.fafica.atividade1.endereco;

import java.util.ArrayList;

public class ControladorEndereco {
	private IRepositorioEndereco repositorioEndereco;
	
	public ControladorEndereco (){
		this.repositorioEndereco = new RepositorioEndereco();
		
	}
	
	public void cadastrar(Endereco endereco){
		repositorioEndereco.cadastrar(endereco);
		
		
	}
	public void atualizar(Endereco endereco){
		
	}
	public Boolean remover(Endereco endereco){
		
		return repositorioEndereco.remover(endereco);
	}

	public Endereco procurar (Endereco endereco){
		return repositorioEndereco.procurar(endereco);	
	}
	public ArrayList<Endereco> listar(){
		 return repositorioEndereco.listar();
	}

}
