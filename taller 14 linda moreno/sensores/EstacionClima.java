import java.util.ArrayList;
import java.util.List;

public class EstacionClima {
    private List<SensorTemperatura> sensores = new ArrayList<>();

    public void agregar(SensorTemperatura sensor) {
        sensores.add(sensor);
    }

    public void reporte() {
        double suma = 0;
        int cantidad = 0;

        for (SensorTemperatura s : sensores) {
            double temperatura = s.leerCelsius();
            System.out.printf("%-18s %5.1f C%n", s.getNombre(), temperatura);
            suma += temperatura;
            cantidad++;
        }

        if (cantidad > 0) {
            System.out.printf("Promedio:          %5.1f C%n", suma / cantidad);
        } else {
            System.out.println("No hay sensores registrados.");
        }
    }
}
