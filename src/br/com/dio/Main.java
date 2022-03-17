package br.com.dio;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		
		
		ArrayList<Conta> contas = new ArrayList();
		ArrayList<Conta> contas2 = new ArrayList();
		
		Conta cc = new ContaCorrente();
		cc.setTipo("CORRENTE");
		Conta cp = new ContaPoupanca();
		cp.setTipo("POUPANCA");
		
		contas.add(cc);
		contas.add(cp);
		
		Conta cc2 = new ContaCorrente();
		cc.setTipo("CORRENTE");
		Conta cp2 = new ContaPoupanca();
		cp.setTipo("POUPANCA");
		
		contas2.add(cc);
		contas2.add(cp);
		
		ArrayList clientes = new ArrayList();
		
		Banco banco = new Banco("Banco do Brasil", clientes);
		
		Cliente cliente = new Cliente("Diego", "0000000", contas);
		Cliente cliente2 = new Cliente("Athos", "1111111", contas2);
		
		banco.setCliente(cliente);
		banco.setCliente(cliente2);
		
		cc.depositar(100);
		cc.transferir(100, cp);
		
		cc2.depositar(200);
		
		cliente.imprimirInfosComuns();
		
		System.out.println("Lista de Clientes:");
		banco.getClientes().forEach(c -> System.out.println(c.getNome()));
	
	}
}
