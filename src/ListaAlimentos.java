import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;




public class ListaAlimentos {
    private List<Alimento> listaDeAlimentos;

    public ListaAlimentos(){
        this.listaDeAlimentos = new ArrayList<Alimento>();
    };

    public ListaAlimentos(Alimento alimento) {
        this.listaDeAlimentos = new ArrayList<Alimento>(Collections.singleton(alimento));
    }

    public void agregarAlimento(Alimento alimento) {
        listaDeAlimentos.add(alimento);
    }

    public List<Alimento> getAlimentos() {
        return listaDeAlimentos;
    }

    public void eliminarAlimento(Alimento alimento) {
        listaDeAlimentos.remove(alimento);
    }

    public List<Alimento> getListaDeAlimentos() {
        return listaDeAlimentos;
    }

    public void setListaDeAlimentos(List<Alimento> listaDeAlimentos) {
        this.listaDeAlimentos = listaDeAlimentos;
    }


    public void guardarEnArchivo() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("alimentos.csv"))) {
            for (Alimento alimento : listaDeAlimentos) {
                // Guardamos el nombre, categoría y severidad en formato CSV
                writer.write(alimento.getAlimento() + "," + alimento.getCategoria() + "," + alimento.getSeveridad().toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para cargar la lista de alimentos desde el archivo CSV
    public void cargarDesdeArchivo() {
        listaDeAlimentos = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("alimentos.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");

                NivelDeSeveridad severidad = new NivelDeSeveridad(parts[2]);
                Alimento alimento = new Alimento(parts[0], parts[1], severidad);
                listaDeAlimentos.add(alimento);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
