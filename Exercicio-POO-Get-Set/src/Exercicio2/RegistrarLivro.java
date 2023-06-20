package Exercicio2;

public class RegistrarLivro {
    public static void main(String[] args) {
        Biblioteca livro = new Biblioteca();

        livro.registrarLivro(2222);

        livro.registrarLivro(3333, "Harry Potter");

        livro.registrarLivro(4444,"Pequeno Principe","Drama");

        livro.registrarLivro(5555,"Crepúsculo","Ficção","Não lembro");
    }
}
