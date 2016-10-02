package br.com.petshop.entidades;

import java.io.Serializable;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class Vendas implements Serializable{
	public int id;
	public ArrayList<Produto> listaProdutos = new ArrayList<>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}