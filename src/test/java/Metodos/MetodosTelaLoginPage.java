package Metodos;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;



@SuppressWarnings("unused")
public class MetodosTelaLoginPage {

	
	WebDriver web;
	
	//Metodo de abrir computador
	public void abrirNavegadorESite(String url) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		web = new ChromeDriver();
		web.manage().window().maximize();
		web.get(url);
		
	}
	//Metodo de clicar
	public void clicar(By elemento) {
		web.findElement(elemento).click();
		
	}
    //Metodo de preencher
	public void preeencherTexto(By elemento , String texto) {
		web.findElement(elemento).sendKeys(texto);
		
	}
	//Metodo de pausar
	public void pausar (int tempo) throws InterruptedException {
		Thread.sleep(tempo);
		
	}
	//Metodo de fechar
	public void fecharNavegador() {
		web.quit();
		
	}
	
	public void validarTexto (String texto, By elemento) {
		String mensagem = web.findElement(elemento).getText();
		assertEquals(mensagem, texto);
		
	}

	public void takeScreenshot(String filename) throws IOException {
        // Captura a tela
        TakesScreenshot screenshot = ((TakesScreenshot) web);
        File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
        
        // Define o destino do arquivo
        File destinationFile = new File(filename);
        
        // Copia o arquivo capturado para o destino
        FileUtils.copyFile(sourceFile, destinationFile);
    
}
   .KALNFIAHEFOIAEKNJDOIEHW
}
	


