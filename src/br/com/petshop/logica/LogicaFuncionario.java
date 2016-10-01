package br.com.petshop.logica;
import br.com.petshop.apresentacao.MensagensNaTela;
import br.com.petshop.apresentacao.Principal;
import br.com.petshop.entidades.Funcionario;

public class LogicaFuncionario {

	static int id = 0;

	public static void formCadastroFuncionario(){

		System.out.print(MensagensNaTela.cpf);
		String cpf = Principal.s.nextLine();
		System.out.print("Nome: ");
		String nome = Principal.s.next().toUpperCase();
		System.out.print("Sexo: ");
		char sexo = Principal.s.next().toUpperCase().charAt(0);
		System.out.print("Cargo: ");
		String cargo = Principal.s.next().toUpperCase();
		System.out.print("Salário: ");
		double salario = Principal.s.nextDouble();
		System.out.print("Telefone: ");
		String telefone = Principal.s.next();
		System.out.print("E-mail: ");
		String email = Principal.s.next().toUpperCase();

		Funcionario funcionario = new Funcionario(id, nome, cpf, cargo, salario, telefone, sexo, email);

		if(funcionario.cadastraFuncionario(funcionario)){
			id++;
			System.out.println("--------------- CADASTRADO EFETUADO COM SUCESSO ----------------");
			System.out.println(funcionario.toString());
			System.out.println("----------------------------------------------------------------");
		}else{
			System.out.println("ERRO: CADASTRADO NÃO REALIZADO. TENTE NOVAMENTE!");
		}
	}
}