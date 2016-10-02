package br.com.petshop.apresentacao;

import br.com.petshop.logica.LogicaFuncionario;

public class TelaCadastroFuncionario {
	public static void cadastroFuncionario(){
		final byte INSERIR=1, ALTERAR=2, EXCLUIR=3, LISTAR=4, VOLTAR=0;
		byte op;

		do{
			System.out.print(MensagensNaTela.cadastroFuncionario);
			System.out.print(MensagensNaTela.operacoesCadastro);

			op = Byte.parseByte(Principal.s.nextLine());

			switch(op){
			case INSERIR:
				LogicaFuncionario.formCadastroFuncionario();
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
				System.out.println(MensagensNaTela.naoImplementado);
				break;
			case VOLTAR:
				System.out.println();
				break;
			default:
				System.out.println(MensagensNaTela.valorIncorreto);
				break;
			}
		}while(op != VOLTAR);
	}
}
