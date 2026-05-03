import Controller.Departamento;
import Controller.Funcionario;
import static Util.MenuCredencial.credenciaisMenu;
import static Util.MenuOpcao.menuOpcao;
import static Util.MenuDepartamento.MenuDepart;
import java.util.Scanner;

public class TesteSistema {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        System.out.println(f1);

        Departamento deptTI = new Departamento("Departamento de TI");

        Scanner input = new Scanner(System.in);
        int opcao1;
        do {
            MenuDepart();
            System.out.print("Escolha: ");
            opcao1 = input.nextInt();
            input.nextLine();

            switch (opcao1) {
                case 1:
                    Funcionario novoFuncionario = credenciaisMenu();
                    deptTI.adicionarFuncionario(novoFuncionario);
                    break;
                case 2:
                    deptTI.listarFuncionarios();
                    break;
                case 3:
                    System.out.println("💰 folha: R$ " + deptTI.calcularFolhaSalarial());
                    break;
                case 4:
                    System.out.println(" Prosseguindo ...");
                    break;
                default:
                    System.out.println(" opcao invalida");
            }
        } while (opcao1 != 4);

        deptTI.listarFuncionarios();
        System.out.print("Escolha (1,2,3...): ");
        int numero = input.nextInt() - 1;
        input.nextLine();

        Funcionario f = deptTI.getFuncionario(numero);
        if (f != null) {
            System.out.println("funcionario selecionado: " + f.getNome());
            int opcao2;
            do {
                menuOpcao();
                opcao2 = input.nextInt();
                input.nextLine();

                switch (opcao2) {
                    case 1:
                        System.out.print("Digite o percentual de reajuste: ");
                        double percentual = input.nextDouble();
                        input.nextLine();
                        f.reajusteSalario(percentual);

                        break;
                    case 2:

                        System.out.println("funcionario demitido");
                        break;

                    case 3:
                        System.out.println("dados do funcionario:");
                        System.out.println(f1);
                        break;

                    case 4:
                        System.out.println("👋 encerrando ...");
                        break;

                    default:
                        System.out.println("opcao invalida");
                }
            } while (opcao2 != 4);
        }

    }
}
