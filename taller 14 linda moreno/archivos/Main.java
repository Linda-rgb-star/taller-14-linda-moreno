public class Main {
    public static void main(String[] args) {
        Carpeta documentos = new Carpeta("Documentos");
        documentos.agregar(new Archivo("hoja-de-vida.pdf", 250));

        Carpeta fotos = new Carpeta("Fotos");
        fotos.agregar(new Archivo("grado.jpg", 2400));
        fotos.agregar(new Archivo("paseo.jpg", 1800));
        documentos.agregar(fotos);

        Carpeta universidad = new Carpeta("Universidad");
        universidad.agregar(new Archivo("taller-poo.pdf", 320));
        
        Carpeta proyecto = new Carpeta("Proyecto");
        proyecto.agregar(new Archivo("Main.java", 6));
        proyecto.agregar(new Archivo("Carrito.java", 9));
        
        universidad.agregar(proyecto);
        documentos.agregar(universidad);

        System.out.println("--- ANTES DEL ACCESO DIRECTO ---");
        documentos.mostrar("");
        System.out.println("Total archivos: " + documentos.contarArchivos());

        // Paso 5: Agregar acceso directo a Universidad
        universidad.agregar(new AccesoDirecto("Horario-Clases.lnk"));

        System.out.println("\n--- DESPUÉS DEL ACCESO DIRECTO ---");
        documentos.mostrar("");
        System.out.println("Total archivos: " + documentos.contarArchivos());
    }
}