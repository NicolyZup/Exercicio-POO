package Exercicio1;

public class TestarCarro {
    public static void main(String[] args) {

        Renault renault = new Renault(2017,17000,"preto",2);

        Fiat fiat = new Fiat(2022,45000,"branco",4);

        Hyundai hyundai = new Hyundai(2020,34000,"cinza",2);

        System.out.println("====================================================");
        renault.mostrarInformacoes();
        renault.partida();
        renault.acelerar();
        renault.acelerar();
        renault.acelerar();
        renault.frear();
        renault.frear();
        renault.frear();

        System.out.println("====================================================");
        fiat.mostrarInformacoes();
        fiat.partida();
        fiat.acelerar();
        fiat.acelerar();
        fiat.frear();

        System.out.println("====================================================");
        hyundai.mostrarInformacoes();
        hyundai.partida();
        hyundai.acelerar();
        hyundai.frear();
        hyundai.frear();
        hyundai.frear();
    }
}
