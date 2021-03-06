package br.com.petshop.logica;

import java.util.ArrayList;

import br.com.petshop.apresentacao.MensagensNaTela;
import br.com.petshop.apresentacao.Principal;
import br.com.petshop.dados.DadosAnimal;
import br.com.petshop.entidades.Animal;

public class LogicaAnimal {
	public static Integer cadastrarAnimal(int contCadastroCliente) throws ClassNotFoundException{
		System.out.println(MensagensNaTela.tituloCadastrarAnimal);
		Animal animal = new Animal();

		animal.setId(DadosAnimal.qtdAnimaisCadastrados());

		System.out.print(MensagensNaTela.nome);
		animal.setNomeAnimal(Principal.s.nextLine()); 

		System.out.print(MensagensNaTela.especie);
		animal.setEspecieAnimal(Principal.s.nextLine()); 

		System.out.print(MensagensNaTela.raca);
		animal.setRacaAnimal(Principal.s.nextLine()); 

		System.out.print(MensagensNaTela.sexo);
		animal.setSexoAnimal(Principal.s.nextLine().charAt(0)); 

		boolean flag = false;
		do{	
			System.out.print(MensagensNaTela.idade);
			int idadeAux = Integer.parseInt(Principal.s.nextLine());
			if(idadeAux >= 0){
				animal.setIdadeAnimal(idadeAux); 
				flag = true;
			}
		}while(flag != true);

		DadosAnimal.salvaCadastro(animal);

		System.out.println(MensagensNaTela.cadastradoRealizado);
		return animal.getID();
	}

	public static void ListarAnimal(ArrayList<Integer> animais, int qtdAnimais) throws ClassNotFoundException{
		for(int i = 0; i < qtdAnimais; i++){
			for(Animal ani: DadosAnimal.retornaCadastros()){
				if(animais.get(i).equals(ani.getID())){
					System.out.println(ani.toString(ani));
				}
			}
		}
		System.out.println();
	}
}
