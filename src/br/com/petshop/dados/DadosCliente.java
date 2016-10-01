package br.com.petshop.dados;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import br.com.petshop.entidades.Cliente;

public class DadosCliente {

	public static boolean salvaCadastro(ArrayList<Cliente> clientes) {
		boolean flag=true;

		try{
			FileOutputStream fos = new FileOutputStream("clientes.txt");
			ObjectOutputStream oos = new ObjectOutputStream (fos);
			oos.writeObject(clientes);
			oos.close();
		}catch (IOException e){
			flag=false;
		}
		return flag;
	}
	@SuppressWarnings("unchecked")
	public static ArrayList<Cliente> retornaCadastros() throws ClassNotFoundException{
		ArrayList <Cliente> clientes = new ArrayList<>();
		try{
			FileInputStream fis = new FileInputStream("clientes.txt");
			ObjectInputStream ois = new ObjectInputStream (fis);
			clientes = (ArrayList<Cliente>) ois.readObject();
			ois.close();
		}catch (IOException e){

		}
		return clientes;
	}
	
	@SuppressWarnings("unchecked")
	public static int qtdClientesCadastrados() throws ClassNotFoundException{
		ArrayList <Cliente> clientes = new ArrayList<>();
		try{
			FileInputStream fis = new FileInputStream("clientes.txt");
			ObjectInputStream ois = new ObjectInputStream (fis);
			clientes = (ArrayList<Cliente>) ois.readObject();
			ois.close();
		}catch (IOException e){

		}
		return clientes.size();
	}
	
}