package br.com.petshop.entidades;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Produto implements Serializable{

	private int id;
	private String nome;
	private double valor;
	private int qtd;
	private int categoria;
	private static String[] listaCategorias = {
			"Ração", "Perfumaria", "Veterinária", "Banho&Tosa", "Petisco",
			"Brinquedo", "Higiene", "Coleira", "Vestimenta", "Farmácia"
	};

	public static String[] getListaCategorias() {
		return listaCategorias;
	}

	public static void setListaCategorias(String[] listaCategorias) {
		Produto.listaCategorias = listaCategorias;
	}

	static String retornarCategoria(int categoria){
		String valor = "Categoria não cadastrada";
		for(int i = 0; i < listaCategorias.length; i++){
			if(categoria == i){
				valor = listaCategorias[i];
			}
		}
		return valor;
	}

	@Override
	public String toString(){
		return "# Id: " + id + ", Nome: " + nome + ", Valor: " + valor + ", Quantidade: " + qtd + ", Total: " + (valor*qtd) + ", Categoria: " + retornarCategoria(categoria);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

}