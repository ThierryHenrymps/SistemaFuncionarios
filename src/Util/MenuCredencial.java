package Util;

import java.util.Scanner;
import Controller.Funcionario;
public class MenuCredencial {
    public static Funcionario credenciaisMenu() {
        Scanner input = new Scanner(System.in);
        System.out.println("++++++++++++++++++++");
        System.out.println("-----Credenciais----");
        System.out.println("++++++++++++++++++++");
        System.out.print("Nome do funcionário: ");
        String nome = input.nextLine();
        System.out.print("CPF: ");
        String cpf = input.nextLine();
        System.out.print("Cargo: ");
        String cargo = input.nextLine();
        System.out.print("Salario: ");
        double salario = input.nextDouble();

        return new Funcionario(nome, cpf, cargo, salario, true);
    }
}