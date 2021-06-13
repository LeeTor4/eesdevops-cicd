package model;

public enum ZONA_B {

	TF_UNICA(7.00), TF_DIARIA(12.00), TF_SEMANAL(45.00), TF_MENSAL(170.00);
	
	private Double valor;
	
	private ZONA_B(Double valor) {
		this.valor = valor;
	}

	public Double getValor() {
		return valor;
	}
	
	
}
