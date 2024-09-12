package br.edu.unisep;
import java.time.LocalDate;
public class main {
    public static void main(String[] args) {
        Autor autor = new Autor("J.K. Rowling", "Britânica");
        Livro livro = new Livro("Harry Potter e a Pedra Filosofal", autor, "978-3-16-148410-0");
        Usuario usuario = new Usuario("Alice Silva", "12345");
        Emprestimo emprestimo = new Emprestimo(livro, usuario, LocalDate.now(), LocalDate.now().plusDays(14));

        System.out.println(livro);
        System.out.println(autor);
        System.out.println(usuario);
        System.out.println(emprestimo);
    }
}