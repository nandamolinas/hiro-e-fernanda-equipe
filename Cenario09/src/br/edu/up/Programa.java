package br.edu.up;

import br.edu.up.Controller.*;
import br.edu.up.View.Menu;

public class Programa {
    public static void main(String[] args) {
        cadastroClientes cadastro = new cadastroClientes();
        Menu menu = new Menu(cadastro);
        menu.exibirMenuPrincipal();

        //Programa chama a classe menu
    }
}
