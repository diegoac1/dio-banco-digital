package br.com.dio;

public abstract class Conta implements IConta {

	private static int AGENCIA_PADRAO = 0;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected String tipo;
	
	
	public Conta() {
		agencia = Conta.AGENCIA_PADRAO;
		numero = SEQUENCIAL++;
	}

	
	public void sacar(double valor) {
		this.saldo = this.saldo - valor;
	}
	
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
