package br.com.petshop.dados;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import br.com.petshop.entidades.Cliente;
import br.com.petshop.utils.Utils;

public class DadosCliente {

	public static boolean salvaCadastro(Cliente cliente) throws ClassNotFoundException {
		Utils.criarDiretorio();
		boolean flag=true;
		ArrayList <Cliente> clienteAux = retornaCadastros();
		clienteAux.add(cliente);

		try{
			FileOutputStream fos = new FileOutputStream(Utils.nomeDiretorioDados() + "/clientes.txt");
			ObjectOutputStream oos = new ObjectOutputStream (fos);
			oos.writeObject(clienteAux);
			oos.close();
		}catch (IOException e){
			flag=false;
		}
		return flag;
	}
	//arraylist
	public static boolean salvaCadastro(ArrayList<Cliente> cliente) throws ClassNotFoundException {
		Utils.criarDiretorio();
		boolean flag=true;

		try{
			FileOutputStream fos = new FileOutputStream(Utils.nomeDiretorioDados() + "/clientes.txt");
			ObjectOutputStream oos = new ObjectOutputStream (fos);
			oos.writeObject(cliente);
			oos.close();
		}catch (IOException e){
			flag=false;
		}
		return flag;
	}
	@SuppressWarnings("unchecked")
	public static ArrayList<Cliente> retornaCadastros() throws ClassNotFoundException{
		Utils.criarDiretorio();
		ArrayList <Cliente> clientes = new ArrayList<>();
		try{
			FileInputStream fis = new FileInputStream(Utils.nomeDiretorioDados() + "/clientes.txt");
			ObjectInputStream ois = new ObjectInputStream (fis);
			clientes = (ArrayList<Cliente>) ois.readObject();
			ois.close();
		}catch (IOException e){

		}
		return clientes;
	}

	@SuppressWarnings("unchecked")
	public static int qtdClientesCadastrados() throws ClassNotFoundException{
		Utils.criarDiretorio();
		ArrayList <Cliente> clientes = new ArrayList<>();
		try{
			FileInputStream fis = new FileInputStream(Utils.nomeDiretorioDados() + "/clientes.txt");
			ObjectInputStream ois = new ObjectInputStream (fis);
			clientes = (ArrayList<Cliente>) ois.readObject();
			ois.close();
		}catch (IOException e){

		}
		return clientes.size();
	}

}