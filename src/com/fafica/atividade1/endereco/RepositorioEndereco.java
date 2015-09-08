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
	public Boolean remover(Endereco endereco) {
		for (int i = 0; i < enderecoArray.length; i++) {
			Endereco obj = enderecoArray[i];
			if (obj.getFornecedor()==endereco.getFornecedor()){
				enderecoArray[i]=null;
				
				return true;
		        }
			
			}

		return false;
	}

	@Override
	public Endereco procurar(Endereco endereco) {
		for (Endereco endereco1 : enderecoArray) {
			if(endereco1.getFornecedor()==endereco.getFornecedor()){
				return endereco1;
			}
		}
		return null;
		
	}

	@Override
	public Boolean existe(Endereco endereco) {
		for (Endereco endereco1 : enderecoArray) {
			if(endereco1.getFornecedor()==endereco.getFornecedor()){
				return true;
			}
		}
		return false;
	}

	public ArrayList<Endereco> listar(){
		ArrayList <Endereco> enderecoArrayList = new ArrayList<>();
		for (int i = 0; i < index; i++) {
			enderecoArrayList.add(enderecoArray[index]);
		}
	
	return enderecoArrayList;
	}

}
