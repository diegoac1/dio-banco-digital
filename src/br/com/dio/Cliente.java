package br.com.dio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cliente {

	private String nome;
	private String cpf;
	private List<Conta> conta;
	
	public Cliente(String nome, String cpf, List<Conta> contas) {
		this.nome = nome;
		this.cpf = cpf;
		this.conta = contas;


	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public List<Conta> getConta() {
		return conta;
	}
	
	
	public void setConta(List<Conta> conta) {
		this.conta = conta;
	}

	protected void imprimirInfosComuns() {
		
		System.out.println(String.format("Titular: %s", this.getNome()));
		for (Conta c : conta) {
			System.out.println(String.format("=== EXTRATO CONTA %s ===", c.getTipo()));
			System.out.println(String.format("Titular: %s", this.getNome()));
			System.out.println(String.format("Agência: %s", c.getAgencia()));
			System.out.println(String.format("Número: %d", c.getNumero()));
			System.out.println(String.format("Saldo: %f", c.getSaldo()));
		}
		
	}
	
}
