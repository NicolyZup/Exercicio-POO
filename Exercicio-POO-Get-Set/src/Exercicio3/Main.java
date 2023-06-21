package Exercicio3;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();

        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome("Nicoly");
        funcionario1.setDataAdmissao(LocalDate.of(2023,06,12));
        funcionario1.setSalario(2000);
        funcionarios.add(funcionario1);

        Funcionario funcionario2 = new Funcionario();
        funcionario2.setNome("Marcos");
        funcionario2.setDataAdmissao(LocalDate.of(2023,03,24));
        funcionario2.setSalario(3500);
        funcionarios.add(funcionario2);

        Funcionario funcionario3 = new Funcionario();
        funcionario3.setNome("Paula");
        funcionario3.setDataAdmissao(LocalDate.of(2023,05,10));
        funcionario3.setSalario(8400);
        funcionarios.add(funcionario3);

        for(Funcionario func : funcionarios){
            func.mostrarInformacoes();
            System.out.println("==================================");
        }
    }
}
