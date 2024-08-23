package project.demoqa.pages;

import project.demoqa.metodos.Metodos;

public class HomePage {

	Metodos metodo = new Metodos();

	public void acessarElements() {
		metodo.preencherElementoEClicar("h5", "Elements");
		metodo.validarUrl("https://demoqa.com/elements");
	}

	public void acessarForms() {
		metodo.preencherElementoEClicar("h5", "Forms");
		metodo.validarUrl("https://demoqa.com/forms");
	}

	public void acessarAlertsFrameWindows() {
		metodo.preencherElementoEClicar("h5", "Alerts, Frame & Windows");
		metodo.validarUrl("https://demoqa.com/alertsWindows");
	}

	public void acessarWidgets() {
		metodo.preencherElementoEClicar("h5", "Widgets");
		metodo.validarUrl("https://demoqa.com/widgets");
	}

	public void acessarInteractions() {
		metodo.preencherElementoEClicar("h5", "Interactions");
		metodo.validarUrl("https://demoqa.com/interaction");
	}

	public void acessarBookStoreApllication() {
		metodo.rolarParaFimDaPagina();
		metodo.preencherElementoEClicar("h5", "Book Store Application");
		metodo.validarUrl("https://demoqa.com/books");

	}

}
