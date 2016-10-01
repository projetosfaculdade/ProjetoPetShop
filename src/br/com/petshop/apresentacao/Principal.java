package br.com.petshop.apresentacao;
import java.util.Scanner;

import br.com.petshop.dados.DadosFornecedor;
import br.com.petshop.logica.LogicaCliente;
import br.com.petshop.logica.LogicaFornecedor;
import br.com.petshop.logica.LogicaFuncionario;
import br.com.petshop.logica.LogicaVenda;
public class Principal {

	public static int contCadastrarCliente = 0, contCadastrarAnimal = 0;
	public static Scanner s = new Scanner(System.in);
	public static void main(String[] args) throws ClassNotFoundException {

		byte opcaoMenuPrincipal, opcaoMenuVendaServico, opcaoMenuCliente, opcaoMenuFornecedor, opcaoMenuFuncionario, opcaoMostrarAnimais;
		final byte 	NUMERO1 = 1, NUMERO2 = 2, NUMERO3 = 3, NUMERO4 = 4, NUMERO5 = 5;

		do{
			System.out.print(MensagensNaTela.menuPrincipal);
			opcaoMenuPrincipal = Byte.parseByte(s.nextLine());
			switch(opcaoMenuPrincipal){
			case NUMERO1:
				System.out.print(MensagensNaTela.menuVendas);
				opcaoMenuVendaServico = Byte.parseByte(s.nextLine());
				switch(opcaoMenuVendaServico){
				case NUMERO1:
					LogicaVenda.cadastrarVenda();
					break;
				case NUMERO2:
					LogicaVenda.listarVendas();
					break;

				case NUMERO3:
					System.out.println();
					break;

				default:
					System.out.println(MensagensNaTela.valorIncorreto);
					break;
				}

				break;

			case NUMERO2:
				System.out.print(MensagensNaTela.menuClientes);
				opcaoMenuCliente = Byte.parseByte(s.nextLine());

				switch(opcaoMenuCliente){
				case NUMERO1:
					System.out.println(MensagensNaTela.tituloCadastrarProprietario);
					LogicaCliente.CadastrarUsuario();
					break;
				case NUMERO2:
					LogicaCliente.atualizarCliente();

					break;

				case NUMERO3:
					System.out.println(MensagensNaTela.tituloExcluir);
					System.out.println(MensagensNaTela.naoImplementado);

					break;
				case NUMERO4:
					System.out.print(MensagensNaTela.mostrarAnimais);
					boolean flag = false;
					opcaoMostrarAnimais = Byte.parseByte(s.nextLine());
					if(opcaoMostrarAnimais == 1)
						flag = true;
					LogicaCliente.ListarUsuario(flag);

					break;
				case NUMERO5:
					System.out.println(MensagensNaTela.pularLinha);

					break;
				default:
					System.out.println(MensagensNaTela.valorIncorreto);
					break;
				}
				break;
			case NUMERO3:
				System.out.print(MensagensNaTela.menuFornecedor);
				opcaoMenuFornecedor = Byte.parseByte(s.nextLine());
				switch(opcaoMenuFornecedor){
				case NUMERO1:
					LogicaFornecedor.cadastro();
					break;
				case NUMERO2:
					System.out.println(MensagensNaTela.tituloAtualizar);
					System.out.println(MensagensNaTela.naoImplementado);

					break;

				case NUMERO3:
					System.out.println(MensagensNaTela.tituloExcluir);
					System.out.println(MensagensNaTela.naoImplementado);
					break;

				case NUMERO4:
					System.out.println(MensagensNaTela.tituloListar);
					System.out.println(DadosFornecedor.exibeCadastro());
					System.out.println(MensagensNaTela.naoImplementado);
					break;

				case NUMERO5:
					System.out.println();
					break;

				default:
					System.out.println(MensagensNaTela.valorIncorreto);
					break;

				}
				break;
			case NUMERO4:
				System.out.print(MensagensNaTela.menuFuncionario);
				opcaoMenuFuncionario = Byte.parseByte(s.nextLine());
				switch(opcaoMenuFuncionario){
				case NUMERO1:
					LogicaFuncionario.formCadastroFuncionario();
					break;
				case NUMERO2:
					System.out.println(MensagensNaTela.tituloAtualizar);
					System.out.println(MensagensNaTela.naoImplementado);

					break;

				case NUMERO3:
					System.out.println(MensagensNaTela.tituloExcluir);
					System.out.println(MensagensNaTela.naoImplementado);

					break;
				case NUMERO4:
					System.out.println(MensagensNaTela.tituloListar);
					System.out.println(MensagensNaTela.naoImplementado);

					break;
				case NUMERO5:
					System.out.println();
					break;
				default:
					System.out.println(MensagensNaTela.valorIncorreto);
					break;
				}
				break;
			case NUMERO5:
				System.out.println(MensagensNaTela.programaEncerrado);
				break;
			default:
				System.out.println(MensagensNaTela.valorIncorreto);
				break;
			}
		}while(opcaoMenuPrincipal != 5);
		s.close();
	}
}