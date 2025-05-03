public class Main {
    public static void main(String[] args) {
        GrafoRecomendacao grafo = new GrafoRecomendacao();

        // Criar filmes
        Filme matrix = new Filme("Matrix");
        Filme avatar = new Filme("Avatar");
        Filme inception = new Filme("Inception");
        Filme titanic = new Filme("Titanic");

        grafo.adicionarFilme(matrix);
        grafo.adicionarFilme(avatar);
        grafo.adicionarFilme(inception);
        grafo.adicionarFilme(titanic);

        // Criar usuários
        Usuario ana = new Usuario("Ana");
        Usuario bruno = new Usuario("Bruno");
        Usuario carla = new Usuario("Carla");

        grafo.adicionarUsuario(ana);
        grafo.adicionarUsuario(bruno);
        grafo.adicionarUsuario(carla);

        // Avaliações
        ana.avaliarFilme(matrix, 5);
        ana.avaliarFilme(avatar, 4);

        bruno.avaliarFilme(matrix, 5);
        bruno.avaliarFilme(inception, 4);

        carla.avaliarFilme(avatar, 5);
        carla.avaliarFilme(titanic, 4);

        // Recomendar para Ana
        System.out.println("Recomendações para Ana:");
        for (Filme f : grafo.recomendar(ana)) {
            System.out.println("- " + f.getTitulo());
        }
    }
}
