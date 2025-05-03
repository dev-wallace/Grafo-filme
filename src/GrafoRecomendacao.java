import java.util.*;

public class GrafoRecomendacao {
    private List<Usuario> usuarios;
    private List<Filme> filmes;

    public GrafoRecomendacao() {
        usuarios = new ArrayList<>();
        filmes = new ArrayList<>();
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void adicionarFilme(Filme filme) {
        filmes.add(filme);
    }

    // Recomendação simples: pega filmes assistidos por usuários com gosto parecido
    public List<Filme> recomendar(Usuario alvo) {
        Map<Filme, Integer> recomendacoes = new HashMap<>();

        for (Usuario outro : usuarios) {
            if (outro == alvo) continue;

            // Verifica se há filmes em comum
            for (Filme filme : outro.getAvaliacoes().keySet()) {
                if (alvo.assistiuFilme(filme)) {
                    // usuários têm gosto em comum
                    for (Map.Entry<Filme, Integer> entrada : outro.getAvaliacoes().entrySet()) {
                        Filme f = entrada.getKey();
                        int nota = entrada.getValue();

                        // Recomendar somente se o alvo ainda não viu
                        if (!alvo.assistiuFilme(f)) {
                            recomendacoes.put(f, recomendacoes.getOrDefault(f, 0) + nota);
                        }
                    }
                    break; // já achamos afinidade
                }
            }
        }

        // Ordenar por nota (soma de pesos)
        List<Filme> ordenados = new ArrayList<>(recomendacoes.keySet());
        ordenados.sort((f1, f2) -> recomendacoes.get(f2) - recomendacoes.get(f1));
        return ordenados;
    }
}
