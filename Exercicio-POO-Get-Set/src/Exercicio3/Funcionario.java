package Exercicio3;

import java.time.LocalDate;
import java.util.Date;

public class Funcionario {
    private String nome;
    private LocalDate dataAdmissao;
    private double salario;
    private int identificador;
    private static int contador =0;

    public Funcionario() {
        setContador(getContador()+1);
        setIdentificador(getContador());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        if(dataAdmissao.isAfter(LocalDate.now())){
            System.out.println("Não é permitido admissão com data futura.");
        } else {
            this.dataAdmissao =dataAdmissao;
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if(salario < 700){
            System.out.println("Não é permitido salário inferior a R$700,00");
        } else {
            this.salario = salario;
        }
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Funcionario.contador = contador;
    }

    public void mostrarInformacoes(){
        System.out.println("Identificador: "+getIdentificador());
        System.out.println("Nome: "+getNome());
        System.out.println("Data de admissão: "+getDataAdmissao());
        System.out.println("Salário: "+getSalario());
    };
}
