package br.com.petshop.entidades;

import java.io.Serializable;

@SuppressWarnings("serial")
public abstract class Pessoa implements Serializable{
	protected int id;
	protected String nome; 
	protected char sexo; 
	protected String cpf;
	protected String telefone;
	protected String email;
	protected String endereco;

	protected abstract int getId();
	protected abstract void setId (int id);
	protected abstract String getCpf();
	protected abstract void setCpf(String cpf);
	protected abstract String getNome();
	protected abstract void setNome(String nome);
	protected abstract char getSexo();
	protected abstract void setSexo(char sexo);
	protected abstract String getTelefone();
	protected abstract void setTelefone(String telefone);
	protected abstract String getEmail();
	protected abstract void setEmail(String email);
	protected abstract String getEndereco();
	protected abstract void setEndereco(String endereco);
}
