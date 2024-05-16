package br.edu.br.Model;

public class Professor extends Pessoa {
    private String matricula;
    private String idLattes;
    private String titulacao;
	private String cpf;
    private String departamento;
    private String areaPesquisa;

    
    public Professor(String nome, String rg, String cpf, String departamento, String areaPesquisa, String matricula, String idLattes, String titulacao) {
        super(nome, rg);
        this.cpf = cpf;
        this.departamento = departamento;
        this.areaPesquisa = areaPesquisa;
        this.matricula = matricula;
        this.idLattes = idLattes;
        this.titulacao = titulacao;
    }

    
    public String getMatricula() {
        return matricula;
    }

    public String getIdLattes() {
        return idLattes;
    }

    public String getTitulacao() {
        return titulacao;
    }
	
	public String getCpf() {
        return cpf;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getAreaPesquisa() {
        return areaPesquisa;
    }
}
