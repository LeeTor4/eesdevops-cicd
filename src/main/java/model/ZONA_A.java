package model;

public enum ZONA_A {

	TF_UNICA(6.00), TF_DIARIA(10.00), TF_SEMANAL(30.00), TF_MENSAL(130.00);
	
	private Double valor;
	
	private ZONA_A(Double valor) {
		this.valor = valor;
	}

	public Double getValor() {
		return valor;
	}
	
	
}
