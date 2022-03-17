package br.com.dio;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private ArrayList<Cliente> clientes;
	
	
	
	public Banco(String nome, ArrayList<Cliente> clientes) {
		this.nome = nome;
		this.clientes = clientes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}
	
	public void setCliente(Cliente cliente) {
		if(cliente != null) {
			this.clientes.add(cliente);
		}
		else {
			throw new RuntimeException("Cliente não pode ser nulo");
		}
	}

	@Override
	public String toString() {
		return "[clientes=" + clientes + "]";
	}
	
	
}
