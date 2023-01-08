package model;

public enum FormaPagamento {
	DNH("Dinheiro"), CD("Cartao Debito"), CC("Cartao Credito"), PIX("Pix");
	
	private String forma;
	
	FormaPagamento(String forma) {
		this.forma = forma;
	}
	
	public String getForma() { return forma; }

}
