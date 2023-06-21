package Exercicio2;

import java.util.ArrayList;
import java.util.List;

public class RegistrarLivro {
    public static void main(String[] args) {
        List<Biblioteca> livros = new ArrayList<>();

        Biblioteca livro1 = new Biblioteca("drama","O sol é para todos",12344,"Harper Lee");
        livros.add(livro1);

        Biblioteca livro2 = new Biblioteca("romance","A culpa é das estrelas",565475,"John Green");
        livros.add(livro2);

        Biblioteca livro3 = new Biblioteca("suspense","O homem de giz",86734,"C.J. Tudor");
        livros.add(livro3);

        for(Biblioteca livroMostrar: livros){
            livroMostrar.mostrarInformacoes();
            System.out.println("===================================");
        }

        Biblioteca livro = new Biblioteca();

        livro.registrarLivro(2222);

        livro.registrarLivro(3333, "Harry Potter");

        livro.registrarLivro(4444,"Pequeno Principe","Drama");

        livro.registrarLivro(5555,"Crepúsculo","Ficção","Não lembro");
    }
}
