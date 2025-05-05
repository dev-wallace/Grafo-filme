public class Main {
    public static void main(String[] args) {
        Grafo grafo = new Grafo();

        // Criando vértices (usuários e filmes)
        Vertice ana = new Vertice("Ana");
        Vertice bruno = new Vertice("Bruno");
        Vertice matrix = new Vertice("Matrix");
        Vertice avatar = new Vertice("Avatar");

        // Adicionando vértices no grafo
        grafo.adicionarVertice(ana);
        grafo.adicionarVertice(bruno);
        grafo.adicionarVertice(matrix);
        grafo.adicionarVertice(avatar);

        // Adicionando arestas (avaliações)
        grafo.adicionarAresta(ana, matrix, 5);   // Ana → Matrix (nota 5)
        grafo.adicionarAresta(ana, avatar, 4);   // Ana → Avatar (nota 4)
        grafo.adicionarAresta(bruno, matrix, 5); // Bruno → Matrix (nota 5)

        // Exibindo conexões
        for (Aresta a : grafo.getArestas()) {
            System.out.println(
                a.getInicio().getNome() + "  " +
                a.getFim().getNome() + " (Nota: " + a.getPeso() + ")"
            );
        }
        grafo.bfs(ana); // Iniciando BFS a partir de Ana
        System.out.println("BFS a partir de: " + ana.getNome());
    }
}
