package frame.web.metodos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MetodosTeste {

	WebDriver driver;

	/**
	 * Metodo para abrir site
	 * 
	 * @author o seu nome
	 * @param site
	 */

	public void abrirNavegador(String site) {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\driver\\90\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(site);
		} catch (Exception e) {
			System.out.println("---------- error ao tentar abrir o site ---------- " + e);
		}

	}

	/**
	 * Metodo para clicar
	 * 
	 * @author o seu nome
	 * @param elemento
	 */

	public void clicar(By elemento) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.out.println("---------- error ao tentar clicar no elemento ---------- " + e);
		}
	}

	/**
	 * Metodo preencher texto
	 * 
	 * @author o seu nome
	 * @param elemento
	 * @param texto
	 */
	public void preencher(By elemento, String texto) {
		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.out.println("---------- error ao tentar preencher no elemento ---------- " + e);
		}

	}

	
	/**
	 * Metodo submit
	 * 
	 * @author o seu nome
	 * @param elemento
	 */
	public void submit(By elemento) {
		try {
			driver.findElement(elemento).submit();
		} catch (Exception e) {
			System.out.println("---------- error ao tentar dar ENTER ---------- " + e);
		}
	}

	/**
	 * Aguardar o elemento ficar visível
	 * @author o seu nome
	 * @param elemento
	 */
	public void aguardarElemento(By elemento) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));
		} catch (Exception e) {
			System.out.println("---------- error elemento não visível ---------- " + e);
		}
	}
	// aguardar elemento ser clicavel
    // acessar outra aba
	// tirar screenshot
	// esperar
	// Scroll
	// validar texto
	// fechar navegador
	// pausa 
	// ler um pdf 

}
