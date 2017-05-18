package br.com.dansilva.sisorcamento.dominio.entidades;

public enum TipoItem {
	P("Produto"), S("Serviço");

	private String descricao;

	TipoItem(String descricao) {
		this.descricao = descricao;
	}

	// Getters and Setters
	public String getDescricao() {
		return descricao;
	}
	
	@Override
	public String toString(){
		return descricao;
	}
}
