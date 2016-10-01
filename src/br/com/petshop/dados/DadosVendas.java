package br.com.petshop.dados;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import br.com.petshop.entidades.Vendas;

public class DadosVendas {

	public static boolean salvaCadastro(ArrayList<Vendas> vendas) {
		boolean flag=true;

		try{
			FileOutputStream fos = new FileOutputStream("vendas.txt");
			ObjectOutputStream oos = new ObjectOutputStream (fos);
			oos.writeObject(vendas);
			oos.close();
		}catch (IOException e){
			flag=false;
		}
		return flag;
	}
	@SuppressWarnings("unchecked")
	public static ArrayList<Vendas> retornaCadastros() throws ClassNotFoundException{
		ArrayList <Vendas> vendas = new ArrayList<>();
		try{
			FileInputStream fis = new FileInputStream("vendas.txt");
			ObjectInputStream ois = new ObjectInputStream (fis);
			vendas = (ArrayList<Vendas>) ois.readObject();
			ois.close();
		}catch (IOException e){

		}
		return vendas;
	}

	@SuppressWarnings("unchecked")
	public static int qtdVendasCadastradas() throws ClassNotFoundException{
		ArrayList <Vendas> vendas = new ArrayList<>();
		try{
			FileInputStream fis = new FileInputStream("vendas.txt");
			ObjectInputStream ois = new ObjectInputStream (fis);
			vendas = (ArrayList<Vendas>) ois.readObject();
			ois.close();
		}catch (IOException e){

		}
		return vendas.size();
	}

}