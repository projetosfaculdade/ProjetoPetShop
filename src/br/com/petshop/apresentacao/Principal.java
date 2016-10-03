package br.com.petshop.apresentacao;

import java.util.Scanner;

import br.com.petshop.logica.LogicaUsuario;
import br.com.petshop.logica.LogicaVenda;

public class Principal {

	public static Scanner s = new Scanner(System.in);

	public static void main(String[] args) throws ClassNotFoundException {
		boolean repet=true;

		LogicaUsuario.validaExistenciaAlgumUsuario();

		do{
			System.out.println(MensagensNaTela.menuAutenticacao);
			if (TelaAutenticacaoUsuario()){
				repet=false;
				menuPrincipal();
			}else{
				System.out.println(MensagensNaTela.falhaAutenticacao);
			}

		}while(repet==true);

		s.close();
	}
	public static boolean TelaAutenticacaoUsuario() throws ClassNotFoundException{
		System.out.print(MensagensNaTela.login);
		String login = s.nextLine();
		System.out.print(MensagensNaTela.senha);
		String senha = s.nextLine();

		if(LogicaUsuario.autenticaUsuario(login, senha))
			return true;
		else
			return false;

	}
	public static void menuPrincipal() throws ClassNotFoundException{
		byte opcaoMenuPrincipal;
		final byte 	VENDAS = 1, CADASTRO = 2, SAIR = 0;

		do{
			System.out.print(MensagensNaTela.menuPrincipal);
			opcaoMenuPrincipal = Byte.parseByte(s.nextLine());
			switch(opcaoMenuPrincipal){
			case VENDAS:
				menuVendas();
				break;
			case CADASTRO:
				menuCadastro();
				break;
			case SAIR:
				System.out.println(MensagensNaTela.programaEncerrado);
				break;
			default:
				System.out.println(MensagensNaTela.valorIncorreto);
				break;
			}
		}while(opcaoMenuPrincipal != SAIR);
	}

	public static void menuVendas() throws ClassNotFoundException{
		final byte REALIZA_VENDA=1, LISTA_VENDAS=2, VOLTAR=0;
		byte opcaoMenuVendaServico;

		do{
			System.out.print(MensagensNaTela.menuVendas);
			opcaoMenuVendaServico = Byte.parseByte(s.nextLine());

			switch(opcaoMenuVendaServico){
			case REALIZA_VENDA:
				LogicaVenda.cadastrarVenda();
				break;
			case LISTA_VENDAS:
				LogicaVenda.listarVendas();
				break;
			case VOLTAR:
				System.out.println();
				break;
			default:
				System.out.println(MensagensNaTela.valorIncorreto);
				break;
			}
		}while(opcaoMenuVendaServico != VOLTAR);
	}

	public static void menuCadastro() throws ClassNotFoundException{
		final byte CLIENTE=1, FUNCIONARIO=2, FORNECEDOR=3, VOLTAR=0;
		int opCadastro;

		do{
			System.out.print(MensagensNaTela.menuCadastro);
			opCadastro = Integer.parseInt(s.nextLine());

			switch (opCadastro){
			case CLIENTE:
				TelaCadastroCliente.cadastroCliente();
				break;
			case FUNCIONARIO:
				TelaCadastroFuncionario.cadastroFuncionario();
				break;
			case FORNECEDOR:
				TelaCadastroFornecedor.cadastroFornecedor();
				break;
			case VOLTAR:
				System.out.println();
				break;
			default:
				System.out.println(MensagensNaTela.valorIncorreto);
				break;
			}
		}while(opCadastro!= VOLTAR);
	}
}

