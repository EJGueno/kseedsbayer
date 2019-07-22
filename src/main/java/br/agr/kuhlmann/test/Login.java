package br.agr.kuhlmann.test;

import static br.agr.kuhlmann.core.DriverFactory.getDriver;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import br.agr.kuhlmann.core.BaseTest;
import br.agr.kuhlmann.core.DSL;

public class Login extends BaseTest {
		
//	private LoginPage page;
	private DSL dsl;
	
	@Before
	public void inicializa() {
		getDriver().get("https://kseedsbayertesting.kuhlmann.agr.br");
		dsl = new DSL();
		
	}
	
	@Test
	public void cadastroUsers() {
		int random = (int)(Math.random() * 0+10000);
		Set<Integer> numeros = new TreeSet<Integer>();
		Random rand = new Random();
		while (numeros.size() < 1) {
		numeros.add(rand.nextInt(100000));
		}
		dsl.escrever("#loginInput", "admin");
		dsl.escrever("senhaInput", "admin123");
		dsl.clicaButton("loginBtn");
		dsl.clicaButton("dropdownMenuButton2");
		dsl.clicaVisibleText("JH SEMENTES LTDA 01-74");
		dsl.clicaVisibleText("OPERAÇÃO");
		dsl.clicaVisibleText("MOVIMENTAÇÃO");
		dsl.clicaVisibleText("Adicionar");
		WebElement element = getDriver().findElement(By.id("dados-venda-tipo"));
		Select combo = new Select(element);
		combo.selectByValue("2");
		getDriver().findElement(By.id("dados-venda-num-nf")).sendKeys(""+random);
		getDriver().findElement(By.id("dados-venda-data-nf")).sendKeys("01/04/2019");
		getDriver().findElement(By.id("select2-dados-destinatario-container")).click();
		getDriver().findElement(By.cssSelector("body > span > span > span.select2-search.select2-search--dropdown > input"))
		.sendKeys("LAVORO AGROCOMERCIAL S.A 01-37");
				
//		Select combo2 = new Select(element2);
//		combo2.selectByVisibleText("THEDY E THEDY LTDA");
				
	}
}
