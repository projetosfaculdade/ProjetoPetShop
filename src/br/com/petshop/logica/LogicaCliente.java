package br.com.petshop.logica;
import java.util.ArrayList;

import br.com.petshop.apresentacao.MensagensNaTela;
import br.com.petshop.apresentacao.Principal;
import br.com.petshop.dados.DadosCliente;
import br.com.petshop.entidades.Cliente;

public class LogicaCliente {

	static int contCadastroCliente = 0;

	public static void CadastrarUsuario() throws ClassNotFoundException{
		int opcaoCadastrarMaisAnimais;
		boolean flag = false;
		Cliente cliente = new Cliente();
		cliente.setId(DadosCliente.qtdClientesCadastrados());

		System.out.print(MensagensNaTela.cpf);
		String auxCPF = Principal.s.nextLine();

		if(Cliente.consultarClienteJaCadastrado(DadosCliente.retornaCadastros(), auxCPF) == true){
			System.out.println(MensagensNaTela.clienteJaCadastrado);
			return;
		}

		cliente.setCpf(auxCPF);

		System.out.print(MensagensNaTela.nome);
		cliente.setNome(Principal.s.nextLine());

		System.out.print(MensagensNaTela.email);
		cliente.setEmail(Principal.s.nextLine());

		System.out.print(MensagensNaTela.endereco);
		cliente.setEndereco(Principal.s.nextLine());

		System.out.print(MensagensNaTela.telefone);
		cliente.setTelefone(Principal.s.nextLine());


		do{
			cliente.setAnimais((LogicaAnimal.cadastrarAnimal(DadosCliente.qtdClientesCadastrados())));

			System.out.print(MensagensNaTela.cadastrarMaisAnimal);
			opcaoCadastrarMaisAnimais = Integer.parseInt(Principal.s.nextLine());

			if(opcaoCadastrarMaisAnimais == 1){
				opcaoCadastrarMaisAnimais = 0;
				flag = true;
			}else {
				if(opcaoCadastrarMaisAnimais != 2)
					System.out.println(MensagensNaTela.valorIncorretoEntendereiNao);
				flag = false;
			}

		}while(flag == true);
		if(DadosCliente.salvaCadastro(cliente))
			System.out.println(MensagensNaTela.cadastradoRealizado);
	}

	public static void ListarUsuario(boolean flag) throws ClassNotFoundException{
		System.out.println(MensagensNaTela.tituloListar);
		for(Cliente cli: DadosCliente.retornaCadastros()){

			System.out.println(cli.toString(cli));
			if(flag == true)
				LogicaAnimal.ListarAnimal(cli.getAnimais(), cli.getAnimais().size());
		}
		System.out.println();
	}

	public static void atualizarCliente() throws ClassNotFoundException{
		System.out.println(MensagensNaTela.tituloAtualizar);
		int idUsuarioAtualizar;
		ArrayList <Cliente> clientes = DadosCliente.retornaCadastros();
		do{
			System.out.print("Informe o id do cliente que deseja atualizar dados(-1 se não souber): ");
			idUsuarioAtualizar = Integer.parseInt(Principal.s.nextLine());

			if(idUsuarioAtualizar == -1)
				ListarUsuario(false);
		}while(idUsuarioAtualizar < 0 || idUsuarioAtualizar > DadosCliente.qtdClientesCadastrados());
		System.out.print(MensagensNaTela.nome);
		clientes.get(idUsuarioAtualizar).setNome(Principal.s.nextLine());

		System.out.print(MensagensNaTela.email);
		clientes.get(idUsuarioAtualizar).setEmail(Principal.s.nextLine());

		System.out.print(MensagensNaTela.endereco);
		clientes.get(idUsuarioAtualizar).setEndereco(Principal.s.nextLine());

		System.out.print(MensagensNaTela.telefone);
		clientes.get(idUsuarioAtualizar).setTelefone(Principal.s.nextLine());

		DadosCliente.salvaCadastro(clientes);

	}
}