package model;

public class Quarto {
	
	private int numero;
	private Categoria categoria;
	private boolean situacao;
	private int diaria; // valor em float ou double

	public void setQuarto(int numero ,Categoria categoria,boolean situacao,int diaria) {
		this.numero = numero;
		this.categoria = categoria;
		this.situacao = situacao;
		this.diaria = diaria;
	}
	public int getNumero() {
		return numero;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public boolean getSituacao() {
		return situacao;
	}
	public int getDiaria() {
		return diaria;
	}

}

