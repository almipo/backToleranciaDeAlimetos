public class Alimento {
    private String nombre;
    private String Categoria;
    private NivelDeSeveridad severidad;


    public Alimento(String alimento, String categoria, NivelDeSeveridad severidad) {
        this.nombre = alimento;
        this.Categoria = categoria;
        this.severidad = severidad;
    }

    public String getAlimento() {
        return nombre;
    }

    public void setAlimento(String alimento) {
        this.nombre = alimento;
    }

    public NivelDeSeveridad getSeveridad() {
        return severidad;
    }

    public void setSeveridad(NivelDeSeveridad severidad) {
        this.severidad = severidad;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }

    @Override
    public String toString() {
        return "\n"+
                "Alimento = " + nombre + '\n' +
                "Categoria = " + Categoria + '\n' +
                "Severidad = " + severidad
                ;
    }


}
