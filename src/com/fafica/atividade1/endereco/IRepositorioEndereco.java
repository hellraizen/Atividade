package com.fafica.atividade1.endereco;

import java.util.ArrayList;



public interface IRepositorioEndereco {

	public void cadastrar(Endereco endereco);
	public void atualizar(Endereco endereco);
	public Boolean remover(Integer id);
	public Endereco procurar(Integer id);
	public Boolean existe(Integer id);
	public ArrayList<Endereco> listar();

}
