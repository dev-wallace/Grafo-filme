import java.util.ArrayList;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Grafo {
    private List<Vertice> vertices = new ArrayList<>();
    private List<Aresta> arestas = new ArrayList<>();

    public void adicionarVertice(Vertice v) {
        vertices.add(v); // Adiciona o vértice à lista 'vertices'
    }

    public void adicionarAresta(Vertice inicio, Vertice fim, int peso) {
        Aresta a = new Aresta(inicio, fim, peso); // Cria uma nova aresta tendo que colocar implicitamente inico, fim e peso
        arestas.add(a);
    }

    public List<Vertice> getVertices() {
        return vertices;
    }

    public List<Aresta> getArestas() {
        return arestas;
    }

    public void bfs(Vertice inicio) {
        List<Vertice> visitados = new ArrayList<>();
        Queue<Vertice> fila = new LinkedList<>();
    
        fila.add(inicio);
        visitados.add(inicio);
    
        System.out.println("BFS a partir de: " + inicio.getNome());
    
        while (!fila.isEmpty()) { // Enquanto tiver pontos para visitar...
            Vertice atual = fila.poll(); // Pega o primeiro da fila (Ana)
            System.out.println("Visitando: " + atual.getNome());

     // Procura todas as setas que saem do ponto atual
            for (int i = 0; i < arestas.size(); i++) {
                Aresta a = arestas.get(i);
               
                    // Se a seta começa no ponto atual...
                if (a.getInicio() == atual) {
                    Vertice vizinho = a.getFim(); // Pega o destino da seta

                        // Verifica se já visitou esse vizinho
                    boolean jaVisitado = false;
                    for (int j = 0; j < visitados.size(); j++) {
                        if (visitados.get(j) == vizinho) { 
                            jaVisitado = true;
                            break;
                        }
                    }
    
                    if (!jaVisitado) {
                        fila.add(vizinho); // Coloca na fila
                        visitados.add(vizinho); // Marca como visitado
                    }
                }
            }
        }
    }
}
    
