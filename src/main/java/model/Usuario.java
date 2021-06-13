package model;


public class Usuario {

	 private String nome;
	 private String senha;
	 private CartaoDeViagem cartao;
	 private ContaBancaria contaBancaria;
	 
	 public Usuario() {
		
	 } 
	 
	 public Usuario(String nome,String senha) {
			this.nome = nome;
			this.senha = senha;
	 } 

	public Usuario(String nome, CartaoDeViagem cartao, ContaBancaria contaBancaria) {
		super();
		this.nome = nome;
		this.cartao = cartao;
		this.contaBancaria = contaBancaria;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public ContaBancaria getContaBancaria() {
		return contaBancaria;
	}

	public void setContaBancaria(ContaBancaria contaBancaria) {
		this.contaBancaria = contaBancaria;
	}



	public CartaoDeViagem getCartao() {
		return cartao;
	}



	public void setCartao(CartaoDeViagem cartao) {
		this.cartao = cartao;
	} 
	 
	 
}
