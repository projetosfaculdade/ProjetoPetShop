package br.com.petshop.entidades;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Vendas implements Serializable{
	public int id;
	public String nome;
	public double valor;
	public int qtd;
	public int categoria;
	public static String[] listaCategorias = {
			"Ração", "Perfumaria", "Veterinária", "Banho&Tosa", "Petisco",
			"Brinquedo", "Higiene", "Coleira", "Vestimenta"
	};
	
	static String retornarCategoria(int categoria){
		String valor = "Categoria não cadastrada";
		for(int i = 0; i < Vendas.listaCategorias.length; i++){
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
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
