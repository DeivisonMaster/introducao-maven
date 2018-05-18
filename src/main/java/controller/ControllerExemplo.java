package controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ControllerExemplo {
	private String nome;

	
	public String formata(){
		return this.nome = this.nome.toUpperCase();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
