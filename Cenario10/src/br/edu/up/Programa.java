package br.edu.up;

import java.util.Scanner;

import br.edu.up.Controller.*;
import br.edu.up.View.*;

public class Programa {
    public static void main(String[] args) {
        ApoliceSeguros controller = new ApoliceSeguros();
        Scanner scanner = new Scanner(System.in);
        Menu.processarEscolha(controller);
        scanner.close(); 
    }
}