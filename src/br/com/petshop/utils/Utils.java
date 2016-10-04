package br.com.petshop.utils;

import java.io.File;

public class Utils {
	public static boolean maiorAZero(double valor){
		if(valor > 0)
			return true;
		else
			return false;
	}
	public static boolean maiorAZero(int valor){
		if(valor > 0)
			return true;
		else
			return false;
	}

	public static boolean criarDiretorio(){
		try{
			File fi= new File("dados");
			fi.mkdir();
			return true;
		}catch(Exception e){
			return false;
		}
	}

	public static String nomeDiretorioDados(){
		return "dados";
	}
}