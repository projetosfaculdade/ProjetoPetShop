package br.com.petshop.dados;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import br.com.petshop.entidades.Usuario;

@SuppressWarnings("serial")
public class DadosUsuario implements Serializable{

	public static boolean salvaCadastro(Usuario usuario) throws ClassNotFoundException{
		boolean flag=true;
		ArrayList <Usuario> usuarioAux = retornaCadastros();
		usuarioAux.add(usuario);
		try{
			FileOutputStream fos = new FileOutputStream ("usuario.txt");
			ObjectOutputStream oos = new ObjectOutputStream (fos);
			oos.writeObject(usuarioAux);
			oos.close();
		} catch (IOException e){
			flag=false;
		}
		return flag;
	}
	@SuppressWarnings("unchecked")
	public static ArrayList<Usuario> retornaCadastros() throws ClassNotFoundException{
		ArrayList <Usuario> listaUsuarios = new ArrayList<>();

		try{
			FileInputStream fis = new FileInputStream ("usuario.txt");
			ObjectInputStream ois = new ObjectInputStream (fis);
			listaUsuarios =  (ArrayList <Usuario>) ois.readObject();
			ois.close();
		} catch (IOException e){

		}

		return listaUsuarios;
	}
}