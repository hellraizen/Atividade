package com.fafica.atividade1.fornecedor;

public interface IFila {
	
	//add
	//peek (retorna um cliente sem remover)
	//pool (retorna um cliente e remover da fila)
	//size (retorna quantos clientes tem na fila)
	
	
	public <E> void add(E elemento);
	public <E> Object peek();
	public <E> Object pool();
	public Boolean vazia();
	public <E> Integer size(); 

}
