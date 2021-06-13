package testes;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import login.LoginPage;


public class LoginTest {
	
	private LoginPage paginaDeLogin;
	
	@BeforeEach
	public void beforeEach() {
		
		this.paginaDeLogin = new LoginPage();
	}
	
	@AfterEach
	public void afterEach() {
		this.paginaDeLogin.fechar();
	}

	@Test
	public void deveriaEfetuarLoginComDadosValidos() {
		
	       paginaDeLogin.preencheFormularioDeLogin("Lee","123");
	       paginaDeLogin.efetuaLogin();
	       
	       Assert.assertFalse(paginaDeLogin.isPaginaDeLogin());
	       Assert.assertEquals("Usuário Lee logado com Sucesso!!", paginaDeLogin.getNomeUsuarioLogado());

	}
	
	@Test
	public void naoDeveriaEfetuarLoginComDadosInvalidos() {
		   //Metodo naoDeveriaEfetuarLoginComDadosInvalidos
	       paginaDeLogin.preencheFormularioDeLogin("Lee","12345");
	       paginaDeLogin.efetuaLogin();
	       
	       Assert.assertFalse(paginaDeLogin.isPaginaDeLogin());
	       Assert.assertEquals("Login inválido!!", paginaDeLogin.getNomeUsuarioLogado());

	}
	


}