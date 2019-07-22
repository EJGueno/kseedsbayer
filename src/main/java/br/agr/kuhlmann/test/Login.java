package br.agr.kuhlmann.test;

import static br.agr.kuhlmann.core.DriverFactory.getDriver;

import org.junit.Before;
import org.junit.Test;

import br.agr.kuhlmann.core.BaseTest;
import br.agr.kuhlmann.page.LoginPage;

public class Login extends BaseTest {
		
	private LoginPage page;
	
	@Before
	public void inicializa() {
		getDriver().get("https://kseedsbayertesting.kuhlmann.agr.br");
		page = new LoginPage();
		
	}
	
	@Test
	public void loginSucesso() {
		page.setLogin("admin");
		page.setSenha("admin123");
		page.acessar();
	}
	@Test
	public void loginFalha() {
		page.setLogin("admin");
		page.setSenha("123");
		page.acessar();
		
	}
}
