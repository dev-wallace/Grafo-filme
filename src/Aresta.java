public class Aresta {
    private Vertice inicio;
    private Vertice fim;
    private int peso;

    public Aresta(Vertice inicio, Vertice fim, int peso) {
        this.inicio = inicio;
        this.fim = fim;
        this.peso = peso;
    }

    public Vertice getInicio() {
        return inicio;
    }

    public Vertice getFim() {
        return fim;
    }

    public int getPeso() {
        return peso;
    }
}
