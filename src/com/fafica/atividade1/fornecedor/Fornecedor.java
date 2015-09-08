package com.fafica.atividade1.fornecedor;

import com.fafica.atividade1.endereco.Endereco;

public class Fornecedor {
	
	private Integer codigo;
	private String nome;
	private String cpf;
	private String banco;
	private Endereco endereco;
	
	
	public Fornecedor(Integer codigo,String nome, String cpf,String banco, Endereco endereco){
		setCodigo(codigo);
		setNome(nome);
		setCpf(cpf);
		setBanco(banco);
		setEndereco(endereco);
		
	}
	public Fornecedor(Integer codigo,String nome, String cpf,String banco){
		setCodigo(codigo);
		setNome(nome);
		setCpf(cpf);
		setBanco(banco);
		
		
	}
	public Fornecedor(String nome, String cpf,String banco){
		this(null, nome, cpf, banco, null);
		
		
	}


	@Override
	public String toString() {
		return "Fornecedor  [\ncodigo=" + codigo +"\n"+ " nome=" + nome + "\n"+" cpf=" + cpf +"\n"+ " banco=" + banco +"\n"+ " endereco="
				+ endereco + "\n"+"------------------------------------------------------------------------------"+"\n";
	}
	public Integer getCodigo() {
		return codigo;
	}


	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getBanco() {
		return banco;
	}


	public void setBanco(String banco) {
		this.banco = banco;
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}



}	
