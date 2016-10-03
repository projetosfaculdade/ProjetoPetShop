package br.com.petshop.apresentacao;
public class MensagensNaTela {

	// Não implementado
	public static String naoImplementado = "Ainda não implementado";

	// Mensagens relacionadas a menu
	public static String menuAutenticacao = "############ PetShop JKLR - Autenticação de usuário ##############";
	public static String menuPrincipal = "############ PetShop JKLR ############\n"
			+ "1 - Vendas\n"
			+ "2 - CRUD\n"
			+ "0 - Sair\n"
			+ "Digite sua opção: ";	
	public static String menuCadastro = "\n############ CRUD ############\n"
			+ "1 - Clientes\n"
			+ "2 - Funcionários\n"
			+ "3 - Fornecedor\n"
			+ "0 - Voltar\n"
			+ "Digite sua opção: ";
	
	public static String cadastroCliente = "\n############ CRUD - Cliente ############\n";
	public static String cadastroFornecedor = "\n############ CRUD - Fornecedor ############\n";
	public static String cadastroFuncionario = "\n############ CRUD - Funcionário ############\n";
	public static String operacoesCadastro = 
			  "1 - Cadastrar\n"
			+ "2 - Atualizar\n"
			+ "3 - Excluir\n"
			+ "4 - Listar\n"
			+ "0 - Voltar\n"
			+ "Digite sua opção: ";
	public static String menuVendas = "\n############ Menu Vendas ############\n"
			+ "1 - Iniciar venda\n"
			+ "2 - Listar vendas\n"
			+ "0 - Voltar\n"
			+ "Digite sua opção: ";
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
	public static String login = "Login: ";
	public static String senha = "Senha: ";

	// Mensagens relacionadas a erros e avisos
	public static String cadastradoRealizado = "-> Cadastro realizado.\n";
	public static String adicionadoAoCarrinho = "-> Adicionado ao carrinho.\n";
	public static String vendaConcluida = "-> Venda concluída.\n";
	public static String clienteJaCadastrado = "-> Cliente já cadastrado";
	public static String valorIncorreto = "-> Valor incorreto";
	public static String valorIncorretoEntendereiNao = "-> Valor digitado incorreto, entenderei como não.";
	public static String programaEncerrado =  "-> Programa encerrado.";
	public static String falhaAutenticacao = ("---------------------------------------------------------\n"
			+ "Usuário e/ou senha incorreto. Tente novamente! \n"
			+ "---------------------------------------------------------");

	//
	public static String pularLinha = "\n";

}