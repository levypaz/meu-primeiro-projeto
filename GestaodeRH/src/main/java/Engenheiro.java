
public class Engenheiro extends Funcionario {

    private String departamento;
    private String crea;

    public Engenheiro(int codigo, String nome, String departamento, String crea) {
        super(codigo, nome, 1500.0);
        this.departamento = departamento;
        this.crea = crea;
    }

    public double calcularSalario() {
        return super.salarioBase * 1.5;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }
}
