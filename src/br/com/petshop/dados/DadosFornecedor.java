package br.com.petshop.dados;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import br.com.petshop.entidades.Fornecedor;

public class DadosFornecedor {

	public static boolean salvaCadastro(ArrayList <Fornecedor> listaFornecedores) {
		boolean flag=true;

		try{
			FileOutputStream fos = new FileOutputStream("fornecedor.txt");
			ObjectOutputStream oos = new ObjectOutputStream (fos);
			oos.writeObject(listaFornecedores);
			oos.close();
		}catch (IOException e){
			flag=false;
		}
		return flag;
	}
	@SuppressWarnings("unchecked")
	public static ArrayList<Fornecedor> exibeCadastro() throws ClassNotFoundException{
		ArrayList <Fornecedor> listaFornecedores = new ArrayList<>();
		try{
			FileInputStream fis = new FileInputStream("fornecedor.txt");
			ObjectInputStream ois = new ObjectInputStream (fis);
			listaFornecedores = (ArrayList<Fornecedor>) ois.readObject();
			ois.close();
		}catch (IOException e){

		}
		return listaFornecedores;
	}
}
