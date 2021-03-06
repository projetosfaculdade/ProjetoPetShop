package br.com.petshop.apresentacao;
public class MensagensNaTela {

	// N�o implementado
	public static String naoImplementado = "Ainda n�o implementado";

	// Mensagens relacionadas a menu
	public static String menuAutenticacao = "############ PetShop JKLR - Autentica��o de usu�rio ##############";
	public static String menuPrincipal = "############ PetShop JKLR ############\n"
			+ "1 - Vendas\n"
			+ "2 - CRUD\n"
			+ "0 - Sair\n"
			+ "Digite sua op��o: ";	
	public static String menuCadastro = "\n############ CRUD ############\n"
			+ "1 - Clientes\n"
			+ "2 - Funcion�rios\n"
			+ "3 - Fornecedor\n"
			+ "0 - Voltar\n"
			+ "Digite sua op��o: ";

	public static String cadastroCliente = "\n############ CRUD - Cliente ############\n";
	public static String cadastroFornecedor = "\n############ CRUD - Fornecedor ############\n";
	public static String cadastroFuncionario = "\n############ CRUD - Funcion�rio ############\n";
	public static String operacoesCadastro = 
			"1 - Cadastrar\n"
					+ "2 - Atualizar\n"
					+ "3 - Excluir\n"
					+ "4 - Listar\n"
					+ "0 - Voltar\n"
					+ "Digite sua op��o: ";
	public static String menuVendas = "\n############ Menu Vendas ############\n"
			+ "1 - Iniciar venda\n"
			+ "2 - Listar vendas\n"
			+ "0 - Voltar\n"
			+ "Digite sua op��o: ";
	public static String cadastrarMaisAnimal = "Deseja cadastrar mais um animal para o mesmo cliente?(1 - sim, 2 - n�o): ";
	public static String cadastrarMaisProdutos = "Deseja cadastrar mais um produto(1 - Sim, 2 - N�o)?\nOp��o: ";
	public static String listarAnimais = "Deseja listar tamb�m os animais de cada cliente?(1 - Sim, 2 - N�o): ";
	public static String listarProdutos = "Deseja listar tamb�m os produtos(1 - Sim, 2 - N�o)?\nOp��o: ";

	// Mensagens relacionadas a t�tulo
	public static String tituloCadastrarProprietario = "\n############ Cadastro de propriet�rio ############";
	public static String tituloCadastrarAnimal = "\n############ Cadastro de animal ############";
	public static String tituloCadastrarFornecedor = "\n############ Cadastro de fornecedor ############";
	public static String tituloCadastrarFuncionario = "\n############ Cadastro de funcion�rio ############";
	public static String tituloAtualizar = "\n############ Atualiza��o ############";
	public static String tituloExcluir = "\n############ Exclus�o ############";
	public static String tituloListar = "\n############ Listagem ############";
	public static String tituloVenda = "\n############ Cadastrar Venda ############";

	//Campos do usu�rio
	public static String nome = "Nome: ";
	public static String cpf = "CPF (apenas n�meros): ";
	public static String email = "Email: ";
	public static String endereco = "Endere�o: ";
	public static String telefone = "Telefone: ";
	public static String raca = "Ra�a: ";
	public static String especie = "Esp�cie: ";
	public static String sexo = "Sexo (m, f): ";
	public static String idade = "Idade: ";
	public static String valor = "Valor: ";
	public static String qtd = "Quantidade: ";
	public static String validade = "Validade: ";
	public static String categoria = "Categoria (n�mero inteiro / -1 se n�o souber quais s�o): ";
	public static String login = "Login: ";
	public static String senha = "Senha: ";

	// Mensagens relacionadas a erros e avisos
	public static String cadastradoRealizado = "-> Cadastro realizado.\n";
	public static String adicionadoAoCarrinho = "-> Adicionado ao carrinho.\n";
	public static String vendaConcluida = "-> Venda conclu�da.\n";
	public static String clienteJaCadastrado = "-> Cliente j� cadastrado";
	public static String valorIncorreto = "-> Valor incorreto";
	public static String valorIncorretoEntendereiNao = "-> Valor digitado incorreto, entenderei como n�o.";
	public static String programaEncerrado =  "-> Programa encerrado.";
	public static String falhaAutenticacao = ("---------------------------------------------------------\n"
			+ "Usu�rio e/ou senha incorreto. Tente novamente! \n"
			+ "---------------------------------------------------------");

	//
	public static String pularLinha = "\n";

}