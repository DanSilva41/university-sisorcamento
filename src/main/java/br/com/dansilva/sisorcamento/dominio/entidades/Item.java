package br.com.dansilva.sisorcamento.dominio.entidades;

public class Item {
	private int idItem;
	private String descricao;
	private double valor;
	private TipoItem tipo;
	private int numero;

	public int getIdItem() {
		return idItem;
	}

	public void setIdItem(int idItem) {
		this.idItem = idItem;
	}

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

	public TipoItem getTipo() {
		return tipo;
	}

	public void setTipo(TipoItem tipo) {
		this.tipo = tipo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int i) {
		this.numero = i;
	}
	
	@Override
	public String toString() {
		return "Item [" + (idItem != 0 ? "idItem = " + idItem + ", " : "")
				+ (tipo != null ? "Tipo = " + tipo.toString() + ", " : "")
				+ (descricao != null ? "Descricao = " + descricao + ", " : "")
				+ (valor != 0 ? "Valor = " + valor + ", " : "")
				+ (numero != 0 ? "Nome = " + numero + ", " : "") + "]";
	}

}
