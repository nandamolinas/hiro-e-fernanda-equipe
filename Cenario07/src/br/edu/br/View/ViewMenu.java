package br.edu.br.View;

import java.util.Scanner;
import br.edu.br.Controller.*;

public class ViewMenu {
    private Scanner scanner;
    private ControleAcademico controle;
        
    
    public ViewMenu() {
        this.scanner = new Scanner(System.in);
        this.controle = new ControleAcademico();
        int opcao;
        do {
            opcao = mostrarMenuPrincipal();
            switch (opcao) {
                case 1: 
                    int opcaoInserir;
                    do {
                        opcaoInserir = mostrarSubMenu();
                        switch (opcaoInserir) {
                            case 1: // Inserir Professor
                                controle.inserirProfessor(); 
                                break;
                            case 2: // Inserir Aluno
                                controle.inserirAluno(); 
                                break;
                            case 3: // Inserir Disciplina
                                controle.inserirDisciplina(); 
                                break;
                        }
                    } while (opcaoInserir > 0 && opcaoInserir <4);
                    break;
                case 2: 
                    int opcaoVisualizar;
                    do {
                        opcaoVisualizar = mostrarSubMenu();
                        switch (opcaoVisualizar) {
                            case 1: // Visualizar Professores
                                System.out.print("Digite o nome do professor para busca: ");
                                String nomeProfessor = scanner.nextLine();
                                controle.visualizarProfessores(nomeProfessor); 
                                break;
                            case 2: // Visualizar Alunos
                                System.out.print("Digite o nome do aluno para busca: ");
                                String nomeAluno = scanner.nextLine();
                                controle.visualizarAlunos(nomeAluno); 
                                break;
                            case 3: // Visualizar Disciplinas
                                System.out.print("Digite o nome da disciplina para busca: ");
                                String nomeDisciplina = scanner.nextLine();
                                controle.visualizarDisciplinas(nomeDisciplina); 
                                break;
                        }
                    } while (opcaoVisualizar > 0 && opcaoVisualizar < 4);
                    break;
            }
        } while (opcao > 0 && opcao < 3);
        fecharScanner();
    }

    
    public int mostrarMenuPrincipal() {
        System.out.println("1 - Inserir dados");
        System.out.println("2 - Visualizar dados");
        System.out.println("3 - Sair");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();
        return opcao;
    }

    
    public int mostrarSubMenu() {
        System.out.println("1 - Professor.");
        System.out.println("2 - Aluno.");
        System.out.println("3 - Dsiciplina.");
        System.out.println("4 - Sair.");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();
        return opcao;
    }

    
    public void fecharScanner() {
        scanner.close();
    }
}
