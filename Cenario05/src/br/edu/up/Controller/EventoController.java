package br.edu.up.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.up.Model.Evento;
import br.edu.up.Model.Reserva;
import br.edu.up.View.EventoView;

public class EventoController {
    private static EventoController instance; 
    private List<Evento> eventos;
    private List<Reserva> reservas;
    private EventoView view;
    private Evento model; 

    public EventoController() {
        eventos = new ArrayList<>();
        reservas = new ArrayList<>();
        view = new EventoView(this);
    }
    
    //retornar a instância controlador
    public static EventoController getInstance() {
        if (instance == null) {
            instance = new EventoController();
        }
        return instance;
    }

    //realizar uma reserva
    public void realizarReserva(Scanner scanner) {
        System.out.print("Informe o nome do evento para o qual deseja fazer a reserva: ");
        String nomeEvento = scanner.nextLine();
        Evento evento = buscarEventoPorNome(nomeEvento);

        if (evento != null) {
            System.out.print("Nome do responsável pela reserva: ");
            String nomeResponsavel = scanner.nextLine();
            System.out.print("Quantidade de pessoas: ");
            int quantidadePessoas = scanner.nextInt();
            scanner.nextLine(); 

            //valor total da reserva
            double valorTotal = quantidadePessoas * evento.getPrecoIngresso();

            // Verifica ingressos disponíveis
            if (evento.venderIngressos(quantidadePessoas)) {
                Reserva reserva = new Reserva(nomeResponsavel, quantidadePessoas, evento.getData(), valorTotal);
                reservas.add(reserva); 

                //detalhes da reserva
                System.out.println("Reserva realizada com sucesso!");
                view.printDetalhesReserva(reserva);
            } else {
                System.out.println("Não foi possível realizar a reserva. Ingressos insuficientes ou dados inválidos.");
            }
        } else {
            System.out.println("Evento não encontrado.");
        }
    }

    // atualizar visualizar
    public void setModel(Evento model) {
        this.model = model; 
    }

    public void setEventoNome(String nome) {
        model.setNome(nome);
        updateView();
    }

    public void setEventoData(String data) {
        model.setData(data);
        updateView();
    }

    public void setEventoLocal(String local) {
        model.setLocal(local);
        updateView();
    }

    public void setEventoLotacaoMaxima(int lotacaoMaxima) {
        model.setLotacaoMaxima(lotacaoMaxima);
        updateView();
    }

    public void setEventoPrecoIngresso(double precoIngresso) {
        model.setPrecoIngresso(precoIngresso);
        updateView();
    }

    public void updateView() {
        view.printDetalhesEvento(model);
    }
    
    public void incluirEvento(Scanner scanner) {
        System.out.print("Nome do Evento: ");
        String nome = scanner.nextLine();
        System.out.print("Data do Evento: ");
        String data = scanner.nextLine();
        System.out.print("Local do Evento: ");
        String local = scanner.nextLine();
        System.out.print("Lotação Máxima: ");
        int lotacaoMaxima = scanner.nextInt();
        System.out.print("Preço do Ingresso: ");
        double precoIngresso = scanner.nextDouble();
        scanner.nextLine(); 

        Evento evento = new Evento(nome, data, local, lotacaoMaxima, precoIngresso);
        eventos.add(evento);
        System.out.println("Evento incluído com sucesso!");
    }

    public void listarEventos() {
        if (eventos.isEmpty()) {
            System.out.println("Não há eventos cadastrados.");
            return;
        }
        for (Evento evento : eventos) {
            view.printDetalhesEvento(evento); 
        }
    }
    
    //buscar evento
    public Evento buscarEventoPorNome(String nome) {
        for (Evento evento : eventos) {
            if (evento.getNome().equalsIgnoreCase(nome)) {
                return evento;
            }
        }
        return null;
    }

    public void excluirEvento(Scanner scanner) {
        System.out.print("Informe o nome do evento que deseja excluir: ");
        String nome = scanner.nextLine();
        for (int i = 0; i < eventos.size(); i++) {
            if (eventos.get(i).getNome().equalsIgnoreCase(nome)) {
                eventos.remove(i);
                System.out.println("Evento excluído com sucesso!");
                return;
            }
        }
        System.out.println("Evento não encontrado.");
    }

    // alterar dados 
    public void alterarDadosEvento(Scanner scanner) {
        System.out.print("Informe o nome do evento que deseja alterar: ");
        String nomeEvento = scanner.nextLine();
        Evento evento = buscarEventoPorNome(nomeEvento);

        if (evento != null) {
            System.out.print("Novo nome do Evento (deixe em branco para não alterar): ");
            String novoNome = scanner.nextLine();

            if (!novoNome.isEmpty()) {
                evento.setNome(novoNome);
            }

            System.out.print("Nova data do Evento (deixe em branco para não alterar): ");
            String novaData = scanner.nextLine();

            if (!novaData.isEmpty()) {
                evento.setData(novaData);
            }

            System.out.print("Novo local do Evento (deixe em branco para não alterar): ");
            String novoLocal = scanner.nextLine();

            if (!novoLocal.isEmpty()) {
                evento.setLocal(novoLocal);
            }

            System.out.print("Nova lotação máxima do Evento (deixe em branco para não alterar): ");
            String novaLotacao = scanner.nextLine();

            if (!novaLotacao.isEmpty()) {
                int novaLotacaoMaxima = Integer.parseInt(novaLotacao);
                evento.setLotacaoMaxima(novaLotacaoMaxima);
            }

            System.out.print("Novo preço do ingresso (deixe em branco para não alterar): ");
            String novoPreco = scanner.nextLine();

            if (!novoPreco.isEmpty()) {
                double novoPrecoIngresso = Double.parseDouble(novoPreco);
                evento.setPrecoIngresso(novoPrecoIngresso);
            }

            updateView();
        } else {
            System.out.println("Evento não encontrado.");
        }
    }
}
