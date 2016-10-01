package br.com.petshop.entidades;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Servico implements Serializable{
	public String nomeProduto;
	public int qtdProduto;
	public String[] categoria; // Ex: Banho, Tosa, Veteriária...
}