public class Main {
    public static void main(String[] args) {
        Grafo grafo = new Grafo();

        // 1. Criação dos vértices
        Vertice ana = new Vertice("Ana");
        Vertice bruno = new Vertice("Bruno");
        Vertice carlos = new Vertice("Carlos");
        Vertice matrix = new Vertice("Matrix");
        Vertice avatar = new Vertice("Avatar");
        Vertice titanic = new Vertice("Titanic");

        // 2. Adição ao grafo
        grafo.adicionarVertice(ana);
        grafo.adicionarVertice(bruno);
        grafo.adicionarVertice(carlos);
        grafo.adicionarVertice(matrix);
        grafo.adicionarVertice(avatar);
        grafo.adicionarVertice(titanic);

        // 3. Criação das arestas (relações)
        grafo.adicionarAresta(ana, matrix, 5);    // Ana avalia Matrix
        grafo.adicionarAresta(ana, avatar, 4);   // Ana avalia Avatar
        grafo.adicionarAresta(bruno, matrix, 5); // Bruno avalia Matrix
        grafo.adicionarAresta(bruno, titanic, 3);// Bruno avalia Titanic
        grafo.adicionarAresta(carlos, avatar, 2);// Carlos avalia Avatar

        // 4. Execução do BFS a partir de Ana
        System.out.println("=== TESTE BFS ===");
        grafo.bfs(ana);

        // 5. Execução do BFS a partir de Bruno
        System.out.println("\n=== TESTE BFS ===");
        grafo.bfs(bruno);

        // 6. Execução do BFS a partir de Carlos
        System.out.println("\n=== TESTE BFS ===");
        grafo.bfs(carlos);
    }
}