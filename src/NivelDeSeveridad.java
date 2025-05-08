public class NivelDeSeveridad {
    private int grado;
    private String descripcion;

public NivelDeSeveridad(int grado) throws Exception {

    this.grado = grado;

    if (grado < 1 || grado > 4) {
        throw new Exception("El grado de severidad debe estar entre 1 y 4");
    }

    switch (grado) {
        case 1:
            this.descripcion = "Grave";
            break;
        case 2:
            this.descripcion = "Moderado";
            break;
        case 3:
            this.descripcion = "Leve";
            break;
        case 4:
            this.descripcion = "Tolerable";
            break;

    }


}
public NivelDeSeveridad (String descripcion) {

    if(descripcion == null || descripcion.isEmpty()) {
        throw new IllegalArgumentException("La descripción no puede ser nula o vacía");
    }

    if (descripcion.equalsIgnoreCase("Grave")) {
        this.grado = 1;
    }
    else if (descripcion.equalsIgnoreCase("Moderado")) {
        this.grado = 2;
    }
    else if (descripcion.equalsIgnoreCase("Leve")) {
        this.grado = 3;
    }
    else if (descripcion.equalsIgnoreCase("Tolerable")) {
        this.grado = 4;
    }
    else {
        throw new IllegalArgumentException("Descripción no válida, solo se acepta Grave, Moderado, Leve o Tolerable");
    }

    this.descripcion = descripcion;
}


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public String toString() {
    return  descripcion;
}

}
