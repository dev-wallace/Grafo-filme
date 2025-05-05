import java.util.ArrayList;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Grafo {
    private List<Vertice> vertices = new ArrayList<>();
    private List<Aresta> arestas = new ArrayList<>();

    public void adicionarVertice(Vertice v) {
        vertices.add(v);
    }

    public void adicionarAresta(Vertice inicio, Vertice fim, int peso) {
        Aresta a = new Aresta(inicio, fim, peso);
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
    
        while (!fila.isEmpty()) {
            Vertice atual = fila.poll();
            System.out.println("Visitando: " + atual.getNome());
    
            for (int i = 0; i < arestas.size(); i++) {
                Aresta a = arestas.get(i);
                if (a.getInicio() == atual) {
                    Vertice vizinho = a.getFim();
    
                    boolean jaVisitado = false;
                    for (int j = 0; j < visitados.size(); j++) {
                        if (visitados.get(j) == vizinho) {
                            jaVisitado = true;
                            break;
                        }
                    }
    
                    if (!jaVisitado) {
                        fila.add(vizinho);
                        visitados.add(vizinho);
                    }
                }
            }
        }
    }
}
    
