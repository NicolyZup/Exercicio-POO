package Exercicio1;

public class Fiat extends ICarros{
    public Fiat(int ano, float valor, String cor, int portas) {
        super("Fiat", ano, valor, cor, portas,3);
    }

    @Override
    public void partida() {
        System.out.println("Iniciando o motor...minha velocidade está em "+this.getVelocidade()+"Km/h");
    }

    @Override
    public void acelerar() {
        int velocidadeAcelerando = this.getVelocidade() + 12 ;
        this.setVelocidade(velocidadeAcelerando);
        System.out.println("Acelerando...minha velocidade está em "+velocidadeAcelerando+"Km/h");
    }

    @Override
    public void frear() {
        int velocidadeFreando = this.getVelocidade() - 6;
        this.setVelocidade(velocidadeFreando);
        System.out.println("Freando...minha velocidade está em "+velocidadeFreando+"Km/h");
    }
}
