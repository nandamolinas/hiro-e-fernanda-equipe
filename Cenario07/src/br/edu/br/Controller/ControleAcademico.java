package br.edu.br.Controller;

import java.util.ArrayList;
import java.util.Scanner;
import br.edu.br.Model.*;

public class ControleAcademico {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Professor> professores = new ArrayList<>();
    private static ArrayList<Aluno> alunos = new ArrayList<>();
    private static ArrayList<Disciplina> disciplinas = new ArrayList<>();

    //inserir dados
    public Professor inserirProfessor() {
		System.out.print("Nome do professor: ");
		String nome = scanner.nextLine();
		System.out.print("RG do professor: ");
		String rg = scanner.nextLine();
		System.out.print("CPF do professor: ");
		String cpf = scanner.nextLine();
		System.out.print("Departamento do professor: ");
		String departamento = scanner.nextLine();
		System.out.print("Área de Pesquisa do professor: ");
		String areaPesquisa = scanner.nextLine();
		System.out.print("Matrícula do professor: ");
		String matricula = scanner.nextLine();
		System.out.print("ID Lattes do professor: ");
		String idLattes = scanner.nextLine();
		System.out.print("Titulação do professor: ");
		String titulacao = scanner.nextLine();
		Professor professor = new Professor(nome, rg, cpf, departamento, areaPesquisa, matricula, idLattes, titulacao);
		professores.add(professor);
		return professor;
	}

    public static Aluno inserirAluno() {
        System.out.print("Nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.print("RG do aluno: ");
        String rg = scanner.nextLine();
        System.out.print("Matrícula do aluno: ");
        String matricula = scanner.nextLine();
        System.out.print("Ano de ingresso do aluno: ");
        int anoIngresso = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Curso do aluno: ");
        String curso = scanner.nextLine();
        System.out.print("Turno do aluno: ");
        String turno = scanner.nextLine();
        System.out.print("Quantidade de competências necessárias: ");
        int qtdCompetenciasNecessarias = scanner.nextInt();
        System.out.print("Quantidade de competências complementares: ");
        int qtdCompetenciasComplementares = scanner.nextInt();
        scanner.nextLine();
        Aluno aluno = new Aluno(nome, rg, matricula, anoIngresso, curso, turno, qtdCompetenciasNecessarias, qtdCompetenciasComplementares);
        alunos.add(aluno);
        return aluno;
    }

    public static Disciplina inserirDisciplina() {
        System.out.print("Nome da disciplina: ");
        String nome = scanner.nextLine();
        System.out.print("Identificador da disciplina: ");
        String identificador = scanner.nextLine();
        System.out.print("Currículo da disciplina: ");
        String curriculo = scanner.nextLine();
        System.out.print("Professor responsável (matrícula): ");
        String matriculaProfessor = scanner.nextLine();
        Professor professor = professores.stream()
                                         .filter(p -> p.getMatricula().equals(matriculaProfessor))
                                         .findFirst()
                                         .orElse(null);
        if (professor == null) {
            System.out.println("Professor não encontrado.");
            return null;
        }
        Disciplina disciplina = new Disciplina(nome, identificador, curriculo, professor, 0, 0);
        disciplinas.add(disciplina);
        return disciplina;
    }

    //visualizar dados
    public static void visualizarProfessores(String nomeBusca) {
        for (Professor professor : professores) {
            if (professor.getNome().equalsIgnoreCase(nomeBusca)) {
                System.out.println("Nome: " + professor.getNome() + ", CPF: " + professor.getCpf() + ", Departamento: " + professor.getDepartamento() + ", Área de Pesquisa: " + professor.getAreaPesquisa());
                return;
            }
        }
        System.out.println("Professor não encontrado.");
    }

    public static void visualizarAlunos(String nomeBusca) {
		for (Aluno aluno : alunos) {
			if (aluno.getNome().equalsIgnoreCase(nomeBusca)) {
				System.out.println("Nome: " + aluno.getNome() + ", RG: " + aluno.getRg() + ", Matrícula: " + aluno.getMatricula() + ", Ano de Ingresso: " + aluno.getAnoIngresso() + ", Curso: " + aluno.getCurso() + ", Turno: " + aluno.getTurno() + ", Competências Necessárias: " + aluno.getQtdCompetenciasNecessarias() + ", Competências Complementares: " + aluno.getQtdCompetenciasComplementares());
				return;
			}
		}
		System.out.println("Aluno não encontrado.");
	}

    public static void visualizarDisciplinas(String nomeBusca) {
		for (Disciplina disciplina : disciplinas) {
			if (disciplina.getNome().equalsIgnoreCase(nomeBusca)) {
				System.out.println("Nome: " + disciplina.getNome() + ", Identificador: " + disciplina.getIdentificador() + ", Currículo: " + disciplina.getCurriculo() + ", Professor: " + disciplina.getProfessor().getNome() + ", Carga Horária Teórica: " + disciplina.getCargaHorariaTeorica() + ", Carga Horária Prática: " + disciplina.getCargaHorariaPratica());
				return;
			}
		}
		System.out.println("Disciplina não encontrada.");
	}
}
