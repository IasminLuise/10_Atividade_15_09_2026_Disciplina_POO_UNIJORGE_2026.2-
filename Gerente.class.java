public class Gerente extends Funcionario {
    private String departamento;
    private double bonus;

    public Gerente(String nome, String cpf, double salario, String departamento, double bonus){
        super(nome,cpf,salario);

        this.departamento = departamento;
        this.bonus = bonus;
    }

    public String getDepartamento(){

        return this.departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getBonus(){
        return this.bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
