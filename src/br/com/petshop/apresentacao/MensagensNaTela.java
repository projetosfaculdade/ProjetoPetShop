package br.com.petshop.apresentacao;
public class MensagensNaTela {

	// Não implementado
	public static String naoImplementado = "Ainda não implementado";

	// Mensagens relacionadas a menu
	public static String menuPrincipal = "############ PetShop JKLR ############\n"
			+ "1 - Vendas\n"
			+ "2 - Clientes\n"
			+ "3 - Fornecedor\n"
			+ "4 - Funcionarios\n"
			+ "5 - Sair: ";	

	public static String menuClientes = "\n############ Menu Clientes ############\n"
			+ "1 - Cadastrar cliente\n"
			+ "2 - Atualizar cliente\n"
			+ "3 - Excluir cliente\n"
			+ "4 - Listar clientes\n"
			+ "5 - Voltar: ";
	
	public static String menuFornecedor = "\n############ Menu Fornecedor ############\n"
			+ "1 - Cadastrar fornecedor\n"
			+ "2 - Atualizar fornecedor\n"
			+ "3 - Excluir fornecedor\n"
			+ "4 - Listar fornecedores\n"
			+ "5 - Voltar: ";
	
	public static String menuFuncionario = "\n############ Menu Funcionario ############\n"
			+ "1 - Cadastrar funcionario\n"
			+ "2 - Atualizar funcionario\n"
			+ "3 - Excluir funcionario\n"
			+ "4 - Listar funcionarios\n"
			+ "5 - Voltar: ";

	public static String menuVendas = "\n############ Menu Vendas ############\n"
			+ "1 - Iniciar venda\n"
			+ "2 - Listar vendas\n"
			+ "3 - Voltar: ";
	public static String cadastrarMaisAnimal = "Deseja cadastrar mais um animal para o mesmo cliente?(1 - sim, 2 - não): ";
	public static String mostrarAnimais = "Deseja também mostrar os animais de cada cliente?(1 - Sim, 2 - Não): ";

	// Mensagens relacionadas a título
	public static String tituloCadastrarProprietario = "\n############ Cadastro de proprietário ############";
	public static String tituloCadastrarAnimal = "\n############ Cadastro de animal ############";
	public static String tituloCadastrarFornecedor = "\n############ Cadastro de fornecedor ############";
	public static String tituloCadastrarFuncionario = "\n############ Cadastro de funcionário ############";
	public static String tituloAtualizar = "\n############ Atualização ############";
	public static String tituloExcluir = "\n############ Exclusão ############";
	public static String tituloListar = "\n############ Listagem ############";
	public static String tituloVenda = "\n############ Cadastrar Venda ############";

	//Campos do usuário
	public static String nome = "Nome: ";
	public static String cpf = "CPF (apenas números): ";
	public static String email = "Email: ";
	public static String endereco = "Endereço: ";
	public static String telefone = "Telefone: ";
	public static String raca = "Raça: ";
	public static String especie = "Espécie: ";
	public static String sexo = "Sexo (m, f): ";
	public static String idade = "Idade: ";
	public static String valor = "Valor: ";
	public static String qtd = "Quantidade: ";
	public static String validade = "Validade: ";
	public static String categoria = "Categoria (número inteiro / -1 se não souber quais são): ";

	// Mensagens relacionadas a erros
	public static String clienteJaCadastrado = "Cliente já cadastrado";
	public static String valorIncorreto = "Valor incorreto";
	public static String valorIncorretoEntendereiNao = "Valor digitado incorreto, entenderei como não.";
	public static String programaEncerrado =  "Programa encerrado.";

	//
	public static String pularLinha = "\n";

}