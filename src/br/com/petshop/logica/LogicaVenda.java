package br.com.petshop.logica;

import java.util.ArrayList;

import br.com.petshop.apresentacao.MensagensNaTela;
import br.com.petshop.apresentacao.Principal;
import br.com.petshop.dados.DadosVendas;
import br.com.petshop.entidades.Vendas;

public class LogicaVenda {

	static ArrayList<Vendas> listaDeVendas = new ArrayList<>();
	public static ArrayList<Vendas> cadastrarVenda() throws ClassNotFoundException{
		System.out.println(MensagensNaTela.tituloVenda);
		Vendas venda = new Vendas();

		venda.setId(DadosVendas.qtdVendasCadastradas());

		System.out.print(MensagensNaTela.nome);
		venda.setNome(Principal.s.nextLine()); 

		System.out.print(MensagensNaTela.valor);
		venda.setValor(Double.parseDouble(Principal.s.nextLine().replace(",", "."))); 

		System.out.print(MensagensNaTela.qtd);
		venda.setQtd(Integer.parseInt(Principal.s.nextLine())); 

		int categoria;
		do{
			System.out.print(MensagensNaTela.categoria);
			categoria = Integer.parseInt(Principal.s.nextLine());
			if(categoria == -1){
				System.out.print("[");
				for(int i = 0; i < Vendas.listaCategorias.length; i++){
					if(i == Vendas.listaCategorias.length - 1)
						System.out.print(i + " - " + Vendas.listaCategorias[i]);
					else
						System.out.print(i + " - " + Vendas.listaCategorias[i] + " / ");
				}
				System.out.println("]\n");
			}else;
		}while(categoria >= Vendas.listaCategorias.length || categoria < 0);

		venda.setCategoria(categoria);

		listaDeVendas.add(venda);
		DadosVendas.salvaCadastro(listaDeVendas);
		return listaDeVendas;
	}

	public static void listarVendas() throws ClassNotFoundException{
		System.out.println(MensagensNaTela.tituloListar);
		for(Vendas ven : DadosVendas.retornaCadastros()){
			System.out.println(ven.toString());
		}
		System.out.println();
	}
}