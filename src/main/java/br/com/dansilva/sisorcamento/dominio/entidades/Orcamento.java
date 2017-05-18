package br.com.dansilva.sisorcamento.dominio.entidades;

public class Orcamento {
	private int numero;
	private String nome_cliente;
	private String cpf_cliente;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome_cliente() {
		return nome_cliente;
	}

	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}

	public String getCpf_cliente() {
		return cpf_cliente;
	}

	public void setCpf_cliente(String cpf_cliente) {
		this.cpf_cliente = cpf_cliente;
	}

	@Override
	public String toString() {
		return "Orçamento [" + (numero != 0 ? "numero_Orc = " + numero + ", " : "")
				+ (nome_cliente != null ? "Nome Cliente = " + nome_cliente + ", " : "")
				+ (cpf_cliente != null ? "Cpf = " + cpf_cliente + ", " : "") + "]";
	}
}
