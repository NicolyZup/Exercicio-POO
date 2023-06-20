package Exercicio1;

public abstract class ICarros {
    private String marca;
    private int ano;
    private float valor;
    private String cor;
    private int portas;
    private int velocidade;

    public ICarros(String marca, int ano, float valor, String cor, int portas, int velocidade) {
        this.marca = marca;
        this.ano = ano;
        this.valor = valor;
        this.cor = cor;
        this.portas = portas;
        this.velocidade = velocidade;
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    public float getValor() {
        return valor;
    }

    public String getCor() {
        return cor;
    }

    public int getPortas() {
        return portas;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public abstract void partida();
    public abstract void frear();
    public abstract void acelerar();
    public void mostrarInformacoes(){
        System.out.println("Marca: "+getMarca());
        System.out.println("Ano: "+getAno());
        System.out.println("Valor: "+getValor());
        System.out.println("Cor: "+getCor());
        System.out.println("Portas: "+getPortas());
    };
}
