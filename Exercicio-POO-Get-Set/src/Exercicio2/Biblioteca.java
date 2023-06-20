package Exercicio2;

public class Biblioteca {
    private String genero;
    private String nomeLivro;
    private int registro;
    private String autor;

  /*  public Biblioteca(String genero, String nomeLivro, int registro, String autor) {
        this.genero = genero;
        this.nomeLivro = nomeLivro;
        this.registro = registro;
        this.autor = autor;
    }*/

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void registrarLivro(int registro){
        System.out.println("O livro foi registrado com o isbn: "+registro);
    }

    public void registrarLivro(int registro, String nome ){
        System.out.println("O livro foi registrado com o isbn: "+registro+" e o nome: "+nome);
    }

    public void registrarLivro(int registro, String nome, String genero){
        System.out.println("O livro foi registrado com o isbn: "+registro+" e o nome: "+nome+" e o gênero: "+genero);
    }

    public void registrarLivro(int registro, String nome, String genero,String autor){
        System.out.println("O livro foi registrado com todos os atributos");
    }
}
