package br.com.petshop.entidades;

public class Endereco {
	private String logradouro;
	private String bairro;
	private String municipio;
	private String estado;
	private String pais;
	private String cep;

	Endereco(String logradouro,String bairro, String municipio, String estado, String pais, String cep){
		setLogradouro(logradouro);
		setBairro(bairro);
		setMunicipio(municipio);
		setEstado(estado);
		setPais(pais);
		setCep(cep);
	}

	public String getLogradouro(){
		return this.logradouro;
	}
	public void setLogradouro(String logradouro){
		this.logradouro = logradouro;
	}
	public String getBairro(){
		return this.bairro;
	}
	public void setBairro(String bairro){
		this.bairro = bairro;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

}
