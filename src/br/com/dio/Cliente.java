package br.com.dio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cliente {

	private String nome;
	private String cpf;
	private List<Conta> contas;
	
	public Cliente(String nome, String cpf, List<Conta> contas) {
		this.nome = nome;
		this.cpf = cpf;
		this.contas = contas;
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

	public List<Conta> getContas() {
		return contas;
	}

	public void setConta(Conta conta) {
		if(conta != null) {
			this.contas.add(conta);
		}
		else {
			throw new RuntimeException("Conta não pode ser nula");
		}
		
	}

	protected void imprimirInfosComuns() {
		
		System.out.println(String.format("Titular: %s", this.getNome()));
		for (Conta c : contas) {
			System.out.println(String.format("=== EXTRATO CONTA %s ===", c.getTipo()));
			System.out.println(String.format("Titular: %s", this.getNome()));
			System.out.println(String.format("Agência: %s", c.getAgencia()));
			System.out.println(String.format("Número: %d", c.getNumero()));
			System.out.println(String.format("Saldo: %f", c.getSaldo()));
		}
		
	}
	
}
