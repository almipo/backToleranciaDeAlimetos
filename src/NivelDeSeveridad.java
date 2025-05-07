public class NivelDeSeveridad {
    private int grado;
    private String descripcion;

public NivelDeSeveridad (String descripcion) {
    this.descripcion = descripcion;
}



    public NivelDeSeveridad(int grado){
    this.grado = grado;
    switch (grado) {
        case 1:
            this.descripcion = "grave";
            break;
        case 2:
            this.descripcion = "Moderado";
            break;
        case 3:
            this.descripcion = "leve";
            break;
        case 4:
            this.descripcion = "Tolerable";
            break;
        default:
            this.descripcion = "No clasificado";
    }
}

public String toString() {
    return  descripcion;
}

}
