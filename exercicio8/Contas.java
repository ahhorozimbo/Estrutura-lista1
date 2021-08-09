package exercicio8;

public class Contas {
    String nomeTitular;
    int numeroConta;
    int numeroAgencia;
    double saldoConta;

    public Contas(String nomeTitular, int numeroConta, int numeroAgencia, double saldoConta) {
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.saldoConta = saldoConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public double getSaldoConta() {
        return saldoConta;
    }
}
