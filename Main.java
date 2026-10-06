import com.sun.security.jgss.GSSUtil;

void main() {

    Gerente g1 = new Gerente(
            "Giovana",
            "000.000.000-00",
            3000.00,
            "RH2",
            50.00
    );

    System.out.println("Nome: " + g1.getNome());
    System.out.println("CPF: " + g1.getCpf());
    System.out.println("Salário: " + g1.getSalario());
    System.out.println("Departamento: " + g1.getDepartamento());
    System.out.println("Bônus: " + g1.getBonus());
}
