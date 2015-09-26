package br.com.gestoecon.bean;

public class ContaVO {

	private String nome;
	private double saldo;
	public ContaVO(String nome, double saldoInicial) {
		this.nome = nome;
		this.saldo = saldoInicial;
		
	}
	
	public ContaVO() {
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
	
	

}
