


public class Main {
    public static void main(String[] args) throws Exception {

ListaAlimentos lista = new ListaAlimentos();
lista.cargarDesdeArchivo();

IndiceAlimento indiceAlimento = new IndiceAlimento(lista);

indiceAlimento.buscarAlimento("almendra");
indiceAlimento.buscarPorCategoria("CEREAL");
indiceAlimento.buscarPorSeveridad("leve");










    }
}