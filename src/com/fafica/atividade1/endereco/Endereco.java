package com.fafica.atividade1.endereco;

import com.fafica.atividade1.fornecedor.Fornecedor;

public class Endereco {
	
	private String rua;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String cep;
	private Fornecedor fornecedor;
	
	public Endereco( String rua,String nomero,String complemento, String bairro, String cidade, String cep,Fornecedor fornecedor ){
	
		setRua(rua);
		setNumero(nomero);
		setComplemento(complemento);
		setBairro(bairro);
		setCidade(cidade);
		setCep(cep);
		setFornecedor(fornecedor);
		
	}
	public Endereco( String rua,String nomero,String complemento, String bairro, String cidade, String cep ){
		this(rua, nomero, complemento, bairro, cidade, cep, null);
		
		
	}

	@Override
	public String toString() {
		return "[rua=" + rua + ", numero=" + numero + ", complemento=" + complemento + ", bairro=" + bairro
				+ ", cidade=" + cidade + ", cep=" + cep +  "]";
	}
	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	

}
