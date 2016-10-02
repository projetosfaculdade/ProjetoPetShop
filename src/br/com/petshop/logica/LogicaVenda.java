package br.com.petshop.logica;

import java.util.ArrayList;

import br.com.petshop.apresentacao.MensagensNaTela;
import br.com.petshop.apresentacao.Principal;
import br.com.petshop.dados.DadosVendas;
import br.com.petshop.entidades.Produto;
import br.com.petshop.entidades.Vendas;

public class LogicaVenda {

	//static Vendas listaDeVendas = new Vendas();
	public static void cadastrarVenda() throws ClassNotFoundException{
		System.out.println(MensagensNaTela.tituloVenda);
		Vendas venda = new Vendas();
		Produto listaProdutos;
		//int variavel = venda.listaProdutos.size();
		byte opcaoCadastrarVenda;

		venda.setId(DadosVendas.qtdVendasCadastradas());
		do{
			listaProdutos = new Produto();
			listaProdutos.setId(venda.listaProdutos.size());

			System.out.print(MensagensNaTela.nome);
			listaProdutos.setNome(Principal.s.nextLine()); 

			System.out.print(MensagensNaTela.valor);
			listaProdutos.setValor(Double.parseDouble(Principal.s.nextLine().replace(",", "."))); 

			System.out.print(MensagensNaTela.qtd);
			listaProdutos.setQtd(Integer.parseInt(Principal.s.nextLine())); 

			int categoria;
			do{
				System.out.print(MensagensNaTela.categoria);
				categoria = Integer.parseInt(Principal.s.nextLine());
				if(categoria == -1){
					System.out.print("[");
					for(int i = 0; i < Produto.listaCategorias.length; i++){
						if(i == Produto.listaCategorias.length - 1)
							System.out.print(i + " - " + Produto.listaCategorias[i]);
						else
							System.out.print(i + " - " + Produto.listaCategorias[i] + " / ");
					}
					System.out.println("]\n");
				}else;
			}while(categoria >= Produto.listaCategorias.length || categoria < 0);

			System.out.println(MensagensNaTela.adicionadoAoCarrinho);

			System.out.print("Deseja cadastrar mais um produto(1 - Sim, 2 - Não)?\n"
					+ "Opção: ");
			opcaoCadastrarVenda = Byte.parseByte(Principal.s.nextLine());

			listaProdutos.setCategoria(categoria);
			venda.listaProdutos.add(listaProdutos);

		}while(opcaoCadastrarVenda != 2);
		//listaDeVendas.add(venda);

		if(DadosVendas.salvaCadastro(venda))
			System.out.println(MensagensNaTela.vendaConcluida);
	}


	public static void listarVendas() throws ClassNotFoundException{
		byte opcaoListarCompleto;
		System.out.print("Deseja listar também os produtos(1 - Sim, 2 - Não)?\n"
				+ "Opção: ");
		opcaoListarCompleto = Byte.parseByte(Principal.s.nextLine());
		System.out.println(MensagensNaTela.tituloListar);

		for(Vendas ven : DadosVendas.retornaCadastros()){
			System.out.println("ID: " + ven.getId() + ", Total da compra: " + retornaValorCompra(ven.getId()));
			if(opcaoListarCompleto == 1){
				for(int i = 0; i < ven.listaProdutos.size(); i++)
					System.out.println("\t-> " + ven.listaProdutos.get(i).toString());
			}

		}
		System.out.println();
	}

	public static double retornaValorCompra(int i) throws ClassNotFoundException{
		ArrayList <Vendas> vendas = DadosVendas.retornaCadastros();
		double valor = 0;
		for(int j = 0; j < vendas.get(i).listaProdutos.size(); j++){
			valor +=  (vendas.get(i).listaProdutos.get(j).getValor() * vendas.get(i).listaProdutos.get(j).getQtd());
		}

		return valor;
	}
}