package br.com.petshop.apresentacao;

import br.com.petshop.logica.LogicaCliente;

public class TelaCadastroCliente {

	public static void cadastroCliente() throws ClassNotFoundException{
		final byte INSERIR=1, ALTERAR=2, EXCLUIR=3, LISTAR=4, VOLTAR=0;
		byte op;

		do{
			System.out.print(MensagensNaTela.cadastroCliente);
			System.out.print(MensagensNaTela.operacoesCadastro);
			op = Byte.parseByte(Principal.s.nextLine());

			switch(op){
			case INSERIR:
				System.out.println(MensagensNaTela.tituloCadastrarProprietario);
				LogicaCliente.CadastrarUsuario();
				break;
			case ALTERAR:
				LogicaCliente.atualizarCliente();
				break;
			case EXCLUIR:
				System.out.println(MensagensNaTela.tituloExcluir);
				System.out.println(MensagensNaTela.naoImplementado);
				break;
			case LISTAR:
				System.out.print(MensagensNaTela.mostrarAnimais);
				boolean flag = false;
				byte opcaoMostrarAnimais = Byte.parseByte(Principal.s.nextLine());
				if(opcaoMostrarAnimais == 1)
					flag = true;
				LogicaCliente.ListarUsuario(flag);
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

