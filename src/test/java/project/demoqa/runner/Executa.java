package project.demoqa.runner;

import org.openqa.selenium.chrome.ChromeDriver;

import project.demoqa.drivers.Drivers;

public class Executa extends Drivers {

	public static void abrirNavegador() {
		driver = new ChromeDriver();
		String url = "https://demoqa.com/";
		driver.get(url);
		driver.manage().window().fullscreen();

	}

	public static void fecharNavegador() {
		driver.quit();
	}

}
