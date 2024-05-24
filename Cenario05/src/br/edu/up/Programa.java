package br.edu.up;

import java.util.Scanner;

import br.edu.up.Controller.*;
import br.edu.up.Model.Evento;
import br.edu.up.View.*;

public class Programa {
    public static void main(String[] args) {
        EventoController controller = EventoController.getInstance();
        Scanner scanner = new Scanner(System.in);

        
        Evento evento = new Evento("Nome do Evento", "Data do Evento", "Local do Evento", 100, 50.0);
        controller.setModel(evento);

        EventoView view = new EventoView(controller);
        view.displayMenu(scanner); 
    }
}