package project.demoqa.metodos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import project.demoqa.drivers.Drivers;

public class Metodos extends Drivers {

	/**
	 * Metodo utilizado para inserir um texto “String” no elemento "input”
	 * 
	 * @author Squad 2020
	 * @category Testes de UI
	 * @param element
	 * @param text
	 */
	public void escrever(By element, String text) {
		driver.findElement(element).sendKeys(text);

	}

	/**
	 * Metodo utilizado para clicar em um elemento “button”
	 * 
	 * @author Squad 2020
	 * @category Testes de UI
	 * @param element
	 */
	public void clicar(By element) {
		driver.findElement(element).click();
	}

	/**
	 * Método utilizado para validar um texto usando um elemento "text", e uma
	 * "String" texto esperado.
	 * 
	 * @author Squad 2020
	 * @param element
	 * @param textExpected
	 */
	public void validarTexto(By element, String textExpected) {
		String textActual = driver.findElement(element).getText();
		assertEquals(textExpected, textActual);

	}

	/**
	 * Método utilizado para validar uma url usando uma "String" url esperada
	 * 
	 * @author Squad 2020
	 * @param urlExpected
	 */
	public void validarUrl(String urlExpected) {
		String urlActual = driver.getCurrentUrl();
		assertEquals(urlExpected, urlActual);
	}

	/**
	 * Método utilizado para esperar um "elemento" ficar visível, para realizar uma
	 * determinada função
	 * 
	 * @author Squad 2020
	 * @param element
	 */
	public void esperarPorELemento(By element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));

	}

	/**
	 * Método utilizado para arrastar o cursor para um "elemento"
	 * 
	 * @author Squad 2020
	 * @param element
	 */
	public void arrastarCursor(By element) {
		WebElement arrastarPara = driver.findElement(element);
		new Actions(driver).moveToElement(arrastarPara).perform();

	}

	/**
	 * Método utilizado para passar o primeiro "atributo" do elemento, e um "texto".
	 * 
	 * @author Squad 2020
	 * @param firstFeature
	 * @param text
	 */
	public void preencherElementoEClicar(String firstFeature, String text) {
		driver.findElement(By.xpath("//" + firstFeature + "[text()='" + text + "']")).click();

	}

	/**
	 * Método utilizado para rolar para o fim da página
	 * 
	 * @author Squad 2020
	 */
	public void rolarParaFimDaPagina() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	}

}
