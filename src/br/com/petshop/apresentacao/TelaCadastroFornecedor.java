package br.com.petshop.apresentacao;

import br.com.petshop.dados.DadosFornecedor;
import br.com.petshop.logica.LogicaFornecedor;

public class TelaCadastroFornecedor {

	public static void cadastroFornecedor() throws ClassNotFoundException{
		final byte INSERIR=1, ALTERAR=2, EXCLUIR=3, LISTAR=4, VOLTAR=0;
		byte op;

		do{
			System.out.print(MensagensNaTela.cadastroFornecedor);
			System.out.print(MensagensNaTela.operacoesCadastro);
			op = Byte.parseByte(Principal.s.nextLine());

			switch(op){
			case INSERIR:
				LogicaFornecedor.cadastro();
				break;
			case ALTERAR:
				System.out.println(MensagensNaTela.tituloAtualizar);
				System.out.println(MensagensNaTela.naoImplementado);
				break;
			case EXCLUIR:
				System.out.println(MensagensNaTela.tituloExcluir);
				System.out.println(MensagensNaTela.naoImplementado);
				break;
			case LISTAR:
				System.out.println(MensagensNaTela.tituloListar);
				System.out.println(DadosFornecedor.exibeCadastro());
				System.out.println(MensagensNaTela.naoImplementado);
				break;
			case VOLTAR:
				System.out.println(MensagensNaTela.pularLinha);
				break;
			default:
				System.out.println(MensagensNaTela.valorIncorreto);
				break;
			}
		}while(op != VOLTAR);
	}
}