package com.fafica.atividade1.endereco;

import java.util.ArrayList;

public class RepositorioEndereco implements IRepositorioEndereco {
	
	private static int index;
	private static Endereco[] enderecoArray= new Endereco[200];
	
	IRepositorioEndereco repositorioEndereco;

	@Override
	public void cadastrar(Endereco endereco) {
		enderecoArray[index]=endereco;
		index++;
		
	}

	@Override
	public void atualizar(Endereco endereco) {
		for (int i = 0; i < index; i++) {
			Endereco obj = enderecoArray[i];
			if (obj.getFornecedor().getCodigo()==endereco.getFornecedor().getCodigo()){
				enderecoArray[i]=endereco;
				
				
			}
		}
		
		
		
	}

	@Override
	public Boolean remover(Integer id) {
		
		        
			
			

		return null;
	}

	@Override
	public Endereco procurar(Integer id) {

		return null;
		
	}

	@Override
	public Boolean existe(Integer id) {
	
		return null;
	}

	public ArrayList<Endereco> listar(){
		ArrayList <Endereco> enderecoArrayList = new ArrayList<>();
		for (int i = 0; i < index; i++) {
			enderecoArrayList.add(enderecoArray[index]);
		}
	
	return enderecoArrayList;
	}

}
