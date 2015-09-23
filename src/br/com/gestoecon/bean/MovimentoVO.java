package br.com.gestoecon.bean;

import java.util.Date;

public class MovimentoVO {

	private String descricao;
	private double valor;
	private Date dataMovimento;
	private tipoMovimento tipo;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Date getDataMovimento() {
		return dataMovimento;
	}

	public void setDataMovimento(Date dataMovimento) {
		this.dataMovimento = dataMovimento;
	}

	public tipoMovimento getTipo() {
		return tipo;
	}

	public void setTipo(tipoMovimento tipo) {
		this.tipo = tipo;
	}

}
