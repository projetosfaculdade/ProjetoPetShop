package br.com.petshop.entidades;

import java.io.Serializable;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class Vendas implements Serializable{
	private int id;
	private ArrayList<Produto> listaProdutos = new ArrayList<>();

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ArrayList<Produto> getListaProdutos() {
		return listaProdutos;
	}
	public void setListaProdutos(Produto listaProdutos) {
		this.listaProdutos.add(listaProdutos);
	}
}