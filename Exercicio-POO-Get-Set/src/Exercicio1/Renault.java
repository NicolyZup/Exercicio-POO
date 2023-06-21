package Exercicio1;

public class Renault extends ICarros{

    public Renault(int ano, float valor, String cor, int portas) {
        super("Renault", ano, valor, cor, portas, 0);
    }

    @Override
    public void partida() {
        System.out.println("Iniciando o motor...minha velocidade está em "+this.getVelocidade()+"Km/h");
    }

    @Override
    public void acelerar() {
        int velocidadeAcelerando = this.getVelocidade() + 10 ;
        this.setVelocidade(velocidadeAcelerando);
        System.out.println("Acelerando...minha velocidade está em "+velocidadeAcelerando+"Km/h");
    }

    @Override
    public void frear() {
        if(this.getVelocidade()==0){
            System.out.println("Carro parado!");
        } else {
            int velocidadeFreando = this.getVelocidade() - 5;
            this.setVelocidade(velocidadeFreando);
            System.out.println("Freando...minha velocidade está em " + velocidadeFreando + "Km/h");
        }
    }
}
