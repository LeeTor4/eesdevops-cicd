package login;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	
	private static final String URL_LOGIN = "http://localhost:8080/agile-testing-cicd/login.html";
	private WebDriver browser;
	
	public LoginPage() {
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"/webdriver/chromedriver");
		 this.browser = new ChromeDriver();
		 this.browser.navigate().to(URL_LOGIN);
	}
	
	public void fechar() {
		   this.browser.quit();	
	}
	
	public void preencheFormularioDeLogin(String login, String senha) {
		browser.findElement(By.id("login")).sendKeys(login);
	    browser.findElement(By.id("senha")).sendKeys(senha);
		
	}
	
	public void efetuaLogin() {
		 browser.findElement(By.id("login-form")).submit();
	}

	public boolean isPaginaDeLogin() {
		
		return browser.getCurrentUrl().equals(URL_LOGIN);
	}
	
	public String getNomeUsuarioLogado() {
	     
		try {
			return  browser.findElement(By.id("usuario-logado")).getText();
		} catch (NoSuchElementException e) {
			return null;
	   }
		
	}
}
