package br.com.petshop.entidades;

@SuppressWarnings("serial")
public class Funcionario extends Pessoa{

	private String cargo;
	private double salario;

	public Funcionario (int id, String nome, String cpf, String cargo, double salario, String telefone, char sexo, String email){
		setId(id);
		setNome(nome);
		setCpf(cpf);
		setCargo(cargo);
		setSalario(salario);
		setTelefone(telefone);
		setSexo(sexo);
		setEmail(email);

	}
	public String toString(){
		return "CPF: "+ getCpf() +" Nome: " + getNome() + ", Sexo: " + getSexo() + ", Cargo: "+ getCargo() + ", Salário: "+ getSalario() + ", Telefone: "+ getTelefone() + ", E-mail: "+ getEmail();

	}
	public boolean cadastraFuncionario(Funcionario funcionario){
		boolean flag=false;
		flag=true;		
		return flag;
	}
	@Override
	public int getId(){
		return this.id;
	} 
	@Override
	public void setId (int id){
		this.id = id;
	}
	@Override
	public String getCpf() {
		return cpf;
	}
	@Override
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	@Override
	public String getNome() {
		return nome;
	}
	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public char getSexo() {
		return sexo;
	}
	@Override
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String getTelefone() {
		return telefone;
	}
	@Override
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	@Override
	public String getEmail() {
		return email;
	}
	@Override
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	protected String getEndereco() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	protected void setEndereco(String endereco) {
		// TODO Auto-generated method stub
	}
}