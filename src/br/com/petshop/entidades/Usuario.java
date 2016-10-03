package br.com.petshop.entidades;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Usuario implements Serializable{
	private byte id;
	private String login;
	private String senha;
	private String grupo;
	private boolean status;
	
	public Usuario(String login, String senha){
		this.login = login;
		this.senha = senha;
		this.grupo = null;
		this.status = true;
	}
	public byte getId() {
		return id;
	}
	public void setId(byte id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String toString(){
		return "Login: " + getLogin() + " | Senha: " + getSenha();
	}
}