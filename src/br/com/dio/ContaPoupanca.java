package br.com.dio;

public class ContaPoupanca extends Conta {

	@Override
	public void imprimirExtrato(Cliente cliente) {
		System.out.println("=== Extrato Conta Poupan�a ===");
		cliente.imprimirInfosComuns();
		
	}

}
