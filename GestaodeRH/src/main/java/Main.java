
public class Main {

    public static void main(String[] args) {
        Engenheiro engenheiro = new Engenheiro(1, "João", "Engenharia de Produção", "12345");
        Gerente gerente = new Gerente(2, "Maria", "Recursos Humanos", 1000.0);
        Presidente presidente = new Presidente(3, "José", 50000.0);

        double salarioEngenheiro = engenheiro.calcularSalario();
        double salarioGerente = gerente.calcularSalario();
        double salarioPresidente = presidente.calcularSalario();

        System.out.println("Salário do engenheiro " + engenheiro.getNome() + ": " + salarioEngenheiro);
        System.out.println("Salário do gerente " + gerente.getNome() + ": " + salarioGerente);
        System.out.println("Salário do presidente " + presidente.getNome() + ": " + salarioPresidente);
    }
}
