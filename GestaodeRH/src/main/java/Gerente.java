
public class Gerente extends Funcionario {

    private String area;
    private double bonus;

    public Gerente(int codigo, String nome, String area, double bonus) {
        super(codigo, nome, 2000.0);
        this.area = area;
        this.bonus = bonus;
    }
    @Override
    public double calcularSalario() {
        return super.salarioBase + bonus;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
