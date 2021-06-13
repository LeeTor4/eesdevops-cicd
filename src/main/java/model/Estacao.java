package model;

public class Estacao {
    
	private String senhaDeAcesso;
	
	public Estacao(String senhaDeAcesso) {
		this.senhaDeAcesso = senhaDeAcesso;
	}
	
	public boolean entrar(Usuario usu) {
         if(usu.getCartao().getNumero().equals(this.senhaDeAcesso)) {
        	 System.out.println("Acesso Liberado!!!"); 
             return true; 
         }
         System.out.println("Acesso Negado!!!"); 
		return false;
	}
	
	public boolean sair(Usuario usu) {
		if(usu.getCartao().getNumero().equals(this.senhaDeAcesso)) {
       	    System.out.println("Acesso Negado!!!"); 
            return true;
		}
		return false;
	}

	public String getSenhaDeAcesso() {
		return senhaDeAcesso;
	}

	public void setSenhaDeAcesso(String senhaDeAcesso) {
		this.senhaDeAcesso = senhaDeAcesso;
	}
	
    public double calcularTarifaDaViagemZona(InterfaceZona zona,String tarifa ,Usuario usu) {
		double res = usu.getContaBancaria().getSaldo();
		
		if(zona.equals(SISTEMA_DE_TREM.ZONA_A)) {
			res -= SISTEMA_DE_TREM.valueOf(ZONA_A.class, tarifa).getValor();
		}
		if(zona.equals(SISTEMA_DE_TREM.ZONA_B)) {
			
			res -= SISTEMA_DE_TREM.valueOf(ZONA_B.class, tarifa).getValor();
		}
		return res;
	}
	
}
