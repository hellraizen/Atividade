package com.fafica.atividade1.endereco;

import java.util.ArrayList;



public interface IRepositorioEndereco {

	public void cadastrar(Endereco endereco);
	public void atualizar(Endereco endereco);
	public Endereco procurar(Endereco endereco);
	public Boolean existe(Endereco endereco);
	public Boolean remover(Endereco endereco);
	public ArrayList<Endereco> listar();

}
