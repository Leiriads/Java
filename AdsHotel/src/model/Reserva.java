package model;

public class Reserva {
	private int codigo;
	private int dias;
	private double total;
	private Cliente cliente;
	private Funcionario funcionario;
	private Quarto quarto;
	private FormaPagamento formaPagamento;

	public void setReserva(int codigo, int dias, double total, Cliente cliente, Funcionario funcionario,Quarto quarto) {
		this.codigo = codigo;
		this.dias = dias;
		this.total = total;
		this.cliente = cliente;
		this.funcionario = funcionario;
		this.quarto = quarto;

	}

	public int getCodigo() {
		return codigo;
	}

	// DIAS
	public int getDias() {
		return dias;
	}

	// TOTAL
	public double getTotal() {
		return total;
	}

	// QUARTO
	public Quarto getQuarto() {
		return quarto;
	}

	// CLIENTE
	public Cliente getCliente() {
		return cliente;
	}

	// FUNCIONARIO
	public Funcionario getFuncionario() {
		return funcionario;
	}

	// FORMAPAGAMENTO
	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	// ---------------------------CALCULO
	public void setTotal(int diaria, int dias) {
		this.total = diaria * dias;
	}
	// ---------------------------CALCULO

}