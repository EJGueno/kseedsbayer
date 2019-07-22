package br.agr.kuhlmann.page;

import br.agr.kuhlmann.core.BasePage;

public class LoginPage extends BasePage{

	public void setLogin(String login) {
		dsl.escrever("#loginInput", login);
		
	}
	public void setSenha(String senha) {
		dsl.escrever("senhaInput", senha);
		
	}
	public void acessar() {
		dsl.clicaButton("loginBtn");
		
	}
}