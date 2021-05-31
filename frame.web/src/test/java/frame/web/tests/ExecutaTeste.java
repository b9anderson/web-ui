package frame.web.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import frame.web.metodos.MetodosTeste;

public class ExecutaTeste {
	
	MetodosTeste teste = new MetodosTeste();

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
				
	}

	@Test
	public void test() {
		
		By pesquisar = By.name("q");
		teste.abrirNavegador("https://www.google.com.br");
		teste.preencher(pesquisar, "Anderson");
		teste.submit(pesquisar);
	}

}
