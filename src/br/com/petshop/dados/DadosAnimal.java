package br.com.petshop.dados;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import br.com.petshop.entidades.Animal;

public class DadosAnimal {

	public static boolean salvaCadastro(Animal animal) throws ClassNotFoundException {
		boolean flag=true;
		ArrayList <Animal> animalAux = retornaCadastros();
		animalAux.add(animal);

		try{
			FileOutputStream fos = new FileOutputStream("animais.txt");
			ObjectOutputStream oos = new ObjectOutputStream (fos);
			oos.writeObject(animalAux);
			oos.close();
		}catch (IOException e){
			flag=false;
		}
		return flag;
	}
	@SuppressWarnings("unchecked")
	public static ArrayList<Animal> retornaCadastros() throws ClassNotFoundException{
		ArrayList <Animal> animais = new ArrayList<>();
		try{
			FileInputStream fis = new FileInputStream("animais.txt");
			ObjectInputStream ois = new ObjectInputStream (fis);
			animais = (ArrayList<Animal>) ois.readObject();
			ois.close();
		}catch (IOException e){

		}
		return animais;
	}

	@SuppressWarnings("unchecked")
	public static int qtdAnimaisCadastrados() throws ClassNotFoundException{
		ArrayList <Animal> animais = new ArrayList<>();
		try{
			FileInputStream fis = new FileInputStream("animais.txt");
			ObjectInputStream ois = new ObjectInputStream (fis);
			animais = (ArrayList<Animal>) ois.readObject();
			ois.close();
		}catch (IOException e){

		}
		return animais.size();
	}

}
