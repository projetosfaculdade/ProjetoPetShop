package br.com.petshop.entidades;

import java.io.Serializable;
import java.util.Date;
@SuppressWarnings("serial")
public class Produto implements Serializable{
	public String nomeProduto;
	public int qtdProduto;
	public Date validade;
	public String[] categoria; // Ex: Perfumaria, Ração, Brinquedos, Farmácia...
	
}