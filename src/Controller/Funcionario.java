package Controller;

import java.util.Scanner;


public class Funcionario {

    private String nome;
    private String cpf;
    private String cargo;
    private double salario;
    private boolean ativo;

    public String toString(){
        return "Funcionario: " + nome +", CPF: "+cpf+ ", Cargo: "+cargo+", Salario: "+salario;
    }

    public Funcionario(String nome, String cpf, String cargo, double salario, boolean ativo) {
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.salario = salario;
        this.ativo = true;
    }
    public Funcionario() {
        this.nome = ("Indefinido");
        this.cpf = ("000.000.000-00");
        this.cargo = ("Indefinido");
        this.salario = (0.0);
        this.ativo = (false);
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isAtivo() {
        return ativo;
    }
    public void setAtivo(boolean ativo) {
        this.ativo = true;
    }

    public void setAll(String nome, String cpf, String cargo, double salario, boolean ativo) {
        this.nome = nome;this.cpf = cpf; this.cargo = cargo; this.salario = salario;
    }

    public void reajusteSalario(double percentual) {
        if (percentual > 0 && this.ativo) {
            double salarioAntigo = this.salario;
            this.salario += this.salario * (percentual / 100.0);
            System.out.println(nome + " " + salario + "-> R$ " + salario + "(reajuste de "+percentual+")");
        }else {
            System.out.println("o reajuste nao foi feito");
        }


    }
}


