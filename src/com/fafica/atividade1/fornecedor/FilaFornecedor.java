package com.fafica.atividade1.fornecedor;

import java.util.ArrayList;

public class FilaFornecedor implements IFila{
	public FilaFornecedor() {
		
	}

	ArrayList<Fornecedor> arrayListFornecedor= new ArrayList<>();
	
	
	@Override
	public <E> void add(E elemento) {
		
		arrayListFornecedor.add((Fornecedor) elemento);
		
	}

	@Override
	public <E> Object peek() {
		return arrayListFornecedor.get(0);
	}

	@Override
	public <E> Object pool() {
		
		
		return arrayListFornecedor.remove(0);
	}

	@Override
	public <E> Integer size() {
	
		return arrayListFornecedor.size();
	}

	@Override
	public Boolean vazia() {
		if(arrayListFornecedor.size()==0){
			return true;
		}
			
		return false;
	}
	
	
}
