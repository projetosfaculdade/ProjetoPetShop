package br.com.petshop.logica;

import java.util.ArrayList;

import br.com.petshop.dados.DadosUsuario;
import br.com.petshop.entidades.Usuario;

public class LogicaUsuario {

	public static boolean autenticaUsuario(String login, String senha) throws ClassNotFoundException{
		boolean flag= false;
		ArrayList <Usuario> listaUsuarios = DadosUsuario.retornaCadastros();

		for (Usuario usuario : listaUsuarios){
			if(usuario.getLogin().equals(login) && usuario.getSenha().equals(senha)){	
				System.out.println("-> Logado");
				flag=true;
				break;
			}
		}
		return flag;
	}
	public static void validaExistenciaAlgumUsuario() throws ClassNotFoundException{
		ArrayList <Usuario> listaUsuarios = DadosUsuario.retornaCadastros();

		if (listaUsuarios.size() == 0){
			Usuario usuario = new Usuario("admin", "1234");
			DadosUsuario.salvaCadastro(usuario);

			System.out.println("#### Usuario administrador ####");
			System.out.println("Login: " + usuario.getLogin() + ", Senha: " + usuario.getSenha() + "\n###############################\n");
		}

	}
}