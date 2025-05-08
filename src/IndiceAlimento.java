public class IndiceAlimento {
    private ListaAlimentos listaAlimentos;

    public IndiceAlimento(ListaAlimentos listaAlimentos) {
        this.listaAlimentos = listaAlimentos;
    }

public void buscarAlimento(String nombre) throws Exception {
 try {
     boolean encontrado = false;
     for (Alimento alimento : listaAlimentos.getListaDeAlimentos()) {
         if (alimento.getAlimento().equalsIgnoreCase(nombre)) {
             System.out.println("Alimento encontrado: " + alimento.getAlimento());
             System.out.println("Categoría: " + alimento.getCategoria());
             System.out.println("Severidad: " + alimento.getSeveridad());
             encontrado = true;
         }
     }
     if (!encontrado) {
         throw new Exception("No se encontró el alimento especificado");
     }
 }
    catch(Exception e){
        System.out.println("Error: " + e.getMessage());
     }

}

public void buscarPorSeveridad(String severidad) throws Exception {
try{
    boolean encontrado = false;
    for (Alimento alimento : listaAlimentos.getListaDeAlimentos()) {
        if (alimento.getSeveridad().getDescripcion().equalsIgnoreCase(severidad)) {
            System.out.println("Alimento encontrado: " + alimento.getAlimento());
            System.out.println("Categoría: " + alimento.getCategoria());
            System.out.println("Severidad: " + alimento.getSeveridad());
            encontrado = true;
        }
    }
    if (!encontrado) {
        throw new Exception("No se encontraron alimentos con la severidad "+severidad);
    }
} catch (Exception e) {
    System.out.println(e.getMessage());
}
}

public void buscarPorCategoria(String categoria) throws Exception {
    try {
        boolean encontrado = false;
        for (Alimento alimento : listaAlimentos.getListaDeAlimentos()) {
            if (alimento.getCategoria().equalsIgnoreCase(categoria)) {
                System.out.println("Alimento encontrado: " + alimento.getAlimento());
                System.out.println("Categoría: " + alimento.getCategoria());
                System.out.println("Severidad: " + alimento.getSeveridad());
                encontrado = true;
            }
        }
        if (!encontrado) {
            throw new Exception("No se encontraron alimentos con la categoría especificada");
        }
    } catch (Exception e) {
        System.out.println(e.getMessage());

    }
}
}