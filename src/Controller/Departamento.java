package Controller;

public class Departamento {
    private String nomeDepartamento;
    private Funcionario[] funcionarios = new Funcionario[5];
    private int contador = 0;

    public String getNomeDepartamento() {
        return nomeDepartamento;
    }
    public int getQuantidadeFuncionarios() {
        return contador;
    }
    public Funcionario getFuncionario(int i) {
        return (i >= 0 && i < contador) ? funcionarios[i] : null;
    }

    public Departamento(String nomeDepartamento) {
        this.nomeDepartamento = nomeDepartamento;
    }

    public void adicionarFuncionario(Funcionario f) {
        if (contador < 5) {
            funcionarios[contador++] = f;
            System.out.println("->" + f.getNome() + " adicionado");
        } else {
            System.out.println("Departamento lotado");
        }
    }

    public void listarFuncionarios() {
        System.out.print(nomeDepartamento + ":");
        if (contador == 0) {
            System.out.println("nenhum funcionario");
            return;
        }
        for (int i = 0; i < contador; i++) {
            System.out.println((i+1) + ". " + funcionarios[i]);
        }
    }

    public double calcularFolhaSalarial() {
        double total = 0;
        for (int i = 0; i < contador; i++) {
            if (funcionarios[i].isAtivo()) {
                total += funcionarios[i].getSalario();
            }
        }
        return total;
    }


}