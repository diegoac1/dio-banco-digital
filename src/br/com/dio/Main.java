package br.com.dio;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Conta> contas = new ArrayList();
		
		Conta cc = new ContaCorrente();
		cc.setTipo("CORRENTE");
		Conta cp = new ContaPoupanca();
		cp.setTipo("POUPANCA");
		
		contas.add(cc);
		contas.add(cp);
		
		Cliente cliente = new Cliente("Diego", "0000000", contas);
		
		cc.depositar(100);
		
		cc.transferir(100, cp);
		
		cliente.imprimirInfosComuns();
	}
}
