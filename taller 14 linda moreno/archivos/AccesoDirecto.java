package Patron Composite-carpetas;

public class AccesoDirecto implements Elemento {
    private String nombre;

    public AccesoDirecto(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getTamanoKB() {
        return 1;
    }

    @Override
    public void mostrar(String sangria) {
        System.out.println(sangria + "-> " + nombre + " (Acceso directo) " + getTamanoKB() + " KB");
    }

    @Override
    public int contarArchivos() {
        return 0;
    }
}