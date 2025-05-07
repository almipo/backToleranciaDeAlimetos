


public class Main {
    public static void main(String[] args) {

ListaAlimentos lista = new ListaAlimentos();
lista.cargarDesdeArchivo();

IndiceAlimento indiceAlimento = new IndiceAlimento(lista);

indiceAlimento.buscarAlimento("almendra");










    }
}