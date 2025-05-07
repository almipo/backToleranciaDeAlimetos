public class IndiceAlimento {
    private ListaAlimentos listaAlimentos;

    public IndiceAlimento(ListaAlimentos listaAlimentos) {
        this.listaAlimentos = listaAlimentos;
    }

    public void buscarAlimento(String nombreAlimento) {
        for (Alimento alimento : listaAlimentos.getAlimentos()) {
            if (alimento.getAlimento().equals(nombreAlimento)) {
                System.out.println(alimento);
                return;
            }
        }


    }
    }
