package br.com.petshop.logica;

import java.util.ArrayList;
import br.com.petshop.entidades.Fornecedor;
import br.com.petshop.apresentacao.Principal;
import br.com.petshop.dados.DadosFornecedor;

public class LogicaFornecedor {
	static int id = 0;

	public static void cadastro(){
		ArrayList <Fornecedor> listaFornecedores = new ArrayList<>();
		
		int op=0;
		do{
			listaFornecedores.add(formulario());
			System.out.println("Deseja realizar um novo cadastro? \n1-[Sim] \n2-[Não]");
			op = Integer.parseInt(Principal.s.nextLine());

		}while(op==1);
		
		if(DadosFornecedor.salvaCadastro(listaFornecedores)){
			id++;
			System.out.println("--------------- CADASTRADO EFETUADO COM SUCESSO ----------------");
			System.out.println(listaFornecedores.toString());
			System.out.println("----------------------------------------------------------------");
		}else{
			System.out.println("ERRO: CADASTRADO NÃO REALIZADO. TENTE NOVAMENTE!");
		}
	}

	public static Fornecedor formulario(){
		System.out.println("############ CADASTRO - FORNECEDOR #############");
		System.out.print("CNPJ: ");
		String cnpj = Principal.s.nextLine();
		System.out.print("Razão Social: ");
		String razaoSocial = Principal.s.nextLine();
		System.out.print("Nome Fantasia: ");
		String nomeFantasia = Principal.s.nextLine();
		System.out.print("Telefone: ");
		String telefone = Principal.s.nextLine();
		System.out.print("E-mail: ");
		String email = Principal.s.nextLine();

		Fornecedor fornecedor = new Fornecedor(id, cnpj, razaoSocial, nomeFantasia, telefone, email);
		return fornecedor;
	}
}
