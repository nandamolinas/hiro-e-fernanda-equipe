package br.edu.up.Controller;

import java.util.ArrayList;

import br.edu.up.Model.*;


public class cadastroClientes {
    private ArrayList<Cliente> clientes;

    public cadastroClientes() {
        clientes = new ArrayList<>();
    }

    // Métodos clientes
    public void incluirClientePessoa(String nome, String telefone, String email, String cpf, double peso, double altura) {
        ClientePessoa clientePessoa = new ClientePessoa(nome, telefone, email, cpf, peso, altura);
        clientes.add(clientePessoa);
    }

    public void incluirClienteEmpresa(String nome, String telefone, String email, String cnpj, String inscEstadual, int anoFundacao) {
        ClienteEmpresa clienteEmpresa = new ClienteEmpresa(nome, telefone, email, cnpj, inscEstadual, anoFundacao);
        clientes.add(clienteEmpresa);
    }

    public Cliente buscarCliente(String nome) {
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equals(nome)) {
                return cliente;
            }
        }
        return null; // não encontrado
    }

    public void emprestarParaCliente(String nome, double valor) {
        Cliente cliente = buscarCliente(nome);
        if (cliente != null) {
            cliente.emprestar(valor);
        }
    }

    public void devolucaoDeCliente(String nome, double valor) {
        Cliente cliente = buscarCliente(nome);
        if (cliente != null) {
            cliente.devolver(valor);
        }
    }

    public void mostrarDadosCliente(String nome) {
        Cliente cliente = buscarCliente(nome);
        if (cliente != null) {
            System.out.println(cliente);
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    
}