package ar.charlycimino.quickupb;

public class Cliente {
    //brenda
    private String nombre, documento;
    private int n;
    private int puntos;

    public Cliente(String nombre, String documento, int n) {
        this.nombre = nombre;
        setDocumento(documento); // Utilizamos el setter para realizar la validación.
        this.n = n;
    }
 
    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        // Verificamos si la cadena contiene solo dígitos utilizando el método isNumeric.
        if (isNumeric(documento)) {
            this.documento = documento;
        } else {
            System.out.println("Error: El documento debe contener solo números enteros.");
        }
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    // Método auxiliar para verificar si una cadena es numérica.
    private boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
