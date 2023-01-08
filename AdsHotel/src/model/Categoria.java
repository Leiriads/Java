package model;

public enum Categoria {
	SIMPLES("simples"), DUPLO("duplo"), TRIPLO("triplo");
	
	private String descricao;
	
	Categoria(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() { return descricao; }

}