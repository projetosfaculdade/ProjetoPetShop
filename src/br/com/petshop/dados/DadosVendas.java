package br.com.petshop.dados;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import br.com.petshop.entidades.Vendas;
import br.com.petshop.utils.Utils;

public class DadosVendas {

	public static boolean salvaCadastro(Vendas venda) throws ClassNotFoundException {
		Utils.criarDiretorio();
		boolean flag=true;
		ArrayList <Vendas> vendasAux = retornaCadastros();
		vendasAux.add(venda);

		try{
			FileOutputStream fos = new FileOutputStream(Utils.nomeDiretorioDados() + "/vendas.txt");
			ObjectOutputStream oos = new ObjectOutputStream (fos);
			oos.writeObject(vendasAux);
			oos.close();
		}catch (IOException e){
			flag=false;
		}
		return flag;
	}
	@SuppressWarnings("unchecked")
	public static ArrayList<Vendas> retornaCadastros() throws ClassNotFoundException{
		Utils.criarDiretorio();
		ArrayList <Vendas> vendas = new ArrayList<>();
		try{
			FileInputStream fis = new FileInputStream(Utils.nomeDiretorioDados() + "/vendas.txt");
			ObjectInputStream ois = new ObjectInputStream (fis);
			vendas = (ArrayList<Vendas>) ois.readObject();
			ois.close();
		}catch (IOException e){

		}
		return vendas;
	}

	@SuppressWarnings("unchecked")
	public static int qtdVendasCadastradas() throws ClassNotFoundException{
		Utils.criarDiretorio();
		ArrayList <Vendas> vendas = new ArrayList<>();
		try{
			FileInputStream fis = new FileInputStream(Utils.nomeDiretorioDados() + "/vendas.txt");
			ObjectInputStream ois = new ObjectInputStream (fis);
			vendas = (ArrayList<Vendas>) ois.readObject();
			ois.close();
		}catch (IOException e){

		}
		return vendas.size();
	}

}