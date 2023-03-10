
public class Presidente extends Funcionario {

    private double valorCotaAcoes;

    public Presidente(int codigo, String nome, double valorCotaAcoes) {
        super(codigo, nome, 5000.0);
        this.valorCotaAcoes = valorCotaAcoes;
    }

    public double calcularSalario() {
        return super.salarioBase + valorCotaAcoes;
    }

    public double getValorCotaAcoes() {
        return valorCotaAcoes;
    }
}
