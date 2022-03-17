package br.com.dio;

public class ContaCorrente extends Conta {

	public void imprimirExtrato(Cliente cliente) {
		
		cliente.imprimirInfosComuns();
		//super.imprimirInfosComuns();
	}
	
}
