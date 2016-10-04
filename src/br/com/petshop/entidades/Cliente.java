package br.com.petshop.entidades;

import java.io.Serializable;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class Cliente extends Pessoa implements Serializable{

	private ArrayList<Integer> animais =  new ArrayList<>();


	public static boolean consultarClienteJaCadastrado(ArrayList<Cliente> cli, String auxCPF){
		for(Cliente clientes : cli)
			if(clientes.getCpf().equals(auxCPF))
				return true;
		return false;
	}

	public String toString(Cliente cli){
		return "ID: " + cli.getId() + ", Nome: " + cli.getNome() + ", CPF: " + cli.getCpf() +", Endereço: " + cli.getEndereco() +", Telefone: " + cli.getTelefone();
	}

	public ArrayList<Integer> getAnimais() {
		return animais;
	}

	public void setAnimais(int animais) {
		this.animais.add(animais);
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	@Override
	public void setId(int id) {
		// TODO Auto-generated method stub
		this.id = id;
	}

	@Override
	public String getCpf() {
		// TODO Auto-generated method stub
		return this.cpf;
	}

	@Override
	public void setCpf(String cpf) {
		// TODO Auto-generated method stub
		this.cpf = cpf;
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return this.nome;
	}

	@Override
	public void setNome(String nome) {
		// TODO Auto-generated method stub
		this.nome = nome;
	}

	@Override
	public char getSexo() {
		// TODO Auto-generated method stub
		return this.sexo;
	}

	@Override
	public void setSexo(char sexo) {
		// TODO Auto-generated method stub
		this.sexo = sexo;
	}

	@Override
	public String getTelefone() {
		// TODO Auto-generated method stub
		return this.telefone;
	}

	@Override
	public void setTelefone(String telefone) {
		// TODO Auto-generated method stub
		this.telefone = telefone;
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return this.email;
	}

	@Override
	public void setEmail(String email) {
		// TODO Auto-generated method stub
		this.email = email;
	}

	@Override
	public String getEndereco() {
		// TODO Auto-generated method stub
		return this.endereco;
	}

	@Override
	public void setEndereco(String endereco) {
		// TODO Auto-generated method stub
		this.endereco = endereco;
	}

}