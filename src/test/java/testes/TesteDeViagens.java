package testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.CartaoDeViagem;
import model.ContaBancaria;
import model.Estacao;
import model.InterfaceZona;
import model.SISTEMA_DE_TREM;
import model.Usuario;


public class TesteDeViagens {
	
	@Test
	public void testaAcessoEstacao() {
		
		CartaoDeViagem cartaoDeViagem = new CartaoDeViagem("123");
		ContaBancaria contaBancaria = new ContaBancaria(50.0);
		Usuario usu = new Usuario("Jose", cartaoDeViagem , contaBancaria);
		
		Estacao estacao =  new Estacao("123");
		
		
		InterfaceZona zona = SISTEMA_DE_TREM.ZONA_A;
		
		if(estacao.entrar(usu)) {
		   assertEquals(20.0, estacao.calcularTarifaDaViagemZona(zona, "TF_SEMANAL", usu), 0.0001);
		}
		
	}

}
