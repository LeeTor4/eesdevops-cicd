package br.com.cicd.cartao;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;


public class CartaoTeste {
	
	@Dado("que o usuario comprou um cartao de uma tarifa$")
	public void que_o_usuario_comprou_um_cartao_de_uma_tarifa() throws Throwable {
		//Colocar o teste
	}
	
	@Quando("o mesmo utilizar o cartao na zona$")
	public void o_mesmo_utilizar_o_cartao_na_zona() throws Throwable {
		//Colocar o teste
	}
	
	@Entao("^realize a cobranca de (\\d+) reais$")
    public void entao_realize_a_cobranca(DataTable dataTable) throws Throwable {
	
		List<Double> valores = dataTable.asList(Double.class);
		for(Double s : valores){
			System.out.println("Pegando valor " + s);
		}
	}

}

