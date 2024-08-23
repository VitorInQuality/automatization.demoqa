package project.demoqa.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import project.demoqa.pages.HomePage;
import project.demoqa.runner.Executa;

public class HomeTest {

	HomePage home = new HomePage();

	@BeforeEach
	public void antesDoTeste() {
		Executa.abrirNavegador();
	}

	@AfterEach
	public void depoisDoTeste() {
		Executa.fecharNavegador();
	}

	@Test
	public void clicarNaOpcaoElements() {
		home.acessarElements();
	}

	@Test
	public void clicarNaOpcaoForms() {
		home.acessarForms();
	}

	@Test
	public void clicarNaOpcaoAlertsFramaWindows() {
		home.acessarAlertsFrameWindows();
	}

	@Test
	public void clicarNaOpcaoWidgets() {
		home.acessarWidgets();
	}

	@Test
	public void clicarNaOpcaoInteractions() {
		home.acessarInteractions();
	}

	@Test
	public void clicarNaOpcaoBookStore() {
		home.acessarBookStoreApllication();
	}
}
