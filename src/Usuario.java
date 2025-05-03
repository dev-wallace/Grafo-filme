import java.util.*;

public class Usuario {
    private String nome;
    private Map<Filme, Integer> avaliacoes; // Filme -> nota (peso)

    public Usuario(String nome) {
        this.nome = nome;
        this.avaliacoes = new HashMap<>();
    }

    public void avaliarFilme(Filme filme, int nota) {
        avaliacoes.put(filme, nota);
    }

    public String getNome() {
        return nome;
    }

    public Map<Filme, Integer> getAvaliacoes() {
        return avaliacoes;
    }

    public boolean assistiuFilme(Filme filme) {
        return avaliacoes.containsKey(filme);
    }

    @Override
    public String toString() {
        return nome;
    }
}
