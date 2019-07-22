package br.agr.kuhlmann.core;

import static br.agr.kuhlmann.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DSL {

	
	public void escrever(By by, String texto){
		getDriver().findElement(by).clear();
		getDriver().findElement(by).sendKeys(texto);
	}
		
	public void escrever(String id_campo, String texto){
		escrever(By.id(id_campo), texto);
	}
	
	public void clicaButton(String id) {
		getDriver().findElement(By.id(id)).click();
	}

	public void clicaVisibleText(String linkText) {
		WebElement link = getDriver().findElement(By.linkText(linkText));
		link.click();
	}
}
