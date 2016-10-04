package br.com.petshop.logica;

import java.util.ArrayList;

import br.com.petshop.apresentacao.MensagensNaTela;
import br.com.petshop.apresentacao.Principal;
import br.com.petshop.dados.DadosVendas;
import br.com.petshop.entidades.Produto;
import br.com.petshop.entidades.Vendas;
import br.com.petshop.utils.Utils;

public class LogicaVenda {

	public static void cadastrarVenda() throws ClassNotFoundException{
		System.out.println(MensagensNaTela.tituloVenda);
		Vendas venda = new Vendas();
		Produto listaProdutos;
		byte opcaoCadastrarVenda;

		venda.setId(DadosVendas.qtdVendasCadastradas());
		do{
			listaProdutos = new Produto();
			listaProdutos.setId(venda.getListaProdutos().size());

			System.out.print(MensagensNaTela.nome);
			listaProdutos.setNome(Principal.s.nextLine()); 

			double valor;
			do{
				System.out.print(MensagensNaTela.valor);
				valor = Double.parseDouble(Principal.s.nextLine().replace(",", "."));
				listaProdutos.setValor(valor);

			}while(!Utils.maiorAZero(valor));

			do{
				System.out.print(MensagensNaTela.qtd);
				listaProdutos.setQtd(Integer.parseInt(Principal.s.nextLine())); 

			}while(!Utils.maiorAZero(valor));

			int categoria;
			do{
				System.out.print(MensagensNaTela.categoria);
				categoria = Integer.parseInt(Principal.s.nextLine());
				if(categoria == -1){
					System.out.print("[");
					for(int i = 0; i < Produto.getListaCategorias().length; i++){
						if(i == Produto.getListaCategorias().length - 1)
							System.out.print(i + " - " + Produto.getListaCategorias()[i]);
						else
							System.out.print(i + " - " + Produto.getListaCategorias()[i] + " / ");
					}
					System.out.println("]\n");
				}else;
			}while(categoria >= Produto.getListaCategorias().length || categoria < 0);

			System.out.println(MensagensNaTela.adicionadoAoCarrinho);

			System.out.print(MensagensNaTela.cadastrarMaisProdutos);
			opcaoCadastrarVenda = Byte.parseByte(Principal.s.nextLine());

			listaProdutos.setCategoria(categoria);
			venda.setListaProdutos(listaProdutos);;

		}while(opcaoCadastrarVenda != 2);

		if(DadosVendas.salvaCadastro(venda))
			System.out.println(MensagensNaTela.vendaConcluida);
	}


	public static void listarVendas() throws ClassNotFoundException{
		byte opcaoListarCompleto;
		System.out.print(MensagensNaTela.listarProdutos);
		opcaoListarCompleto = Byte.parseByte(Principal.s.nextLine());
		System.out.println(MensagensNaTela.tituloListar);

		for(Vendas ven : DadosVendas.retornaCadastros()){
			System.out.printf("ID: " +  ven.getId() + ", Total da compra: R$%.02f\n", retornaValorCompra(ven.getId()));
			if(opcaoListarCompleto == 1){
				for(int i = 0; i < ven.getListaProdutos().size(); i++)
					System.out.println("\t-> " + ven.getListaProdutos().get(i).toString());
			}
		}
		System.out.println();
	}

	public static double retornaValorCompra(int i) throws ClassNotFoundException{
		ArrayList <Vendas> vendas = DadosVendas.retornaCadastros();
		double valor = 0;
		for(int j = 0; j < vendas.get(i).getListaProdutos().size(); j++){
			valor +=  (vendas.get(i).getListaProdutos().get(j).getValor() * vendas.get(i).getListaProdutos().get(j).getQtd());
		}

		return valor;
	}
}