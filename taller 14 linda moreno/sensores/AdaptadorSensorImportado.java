
public class AdaptadorSensorImportado implements SensorTemperatura {
    private SensorImportado sensor;

    public AdaptadorSensorImportado(SensorImportado sensor) {
        this.sensor = sensor;
    }

    @Override
    public String getNombre() {
        return "Importado " + sensor.getModelo();
    }

    @Override
    public double leerCelsius() {
        return (sensor.readFahrenheit() - 32) * 5.0 / 9.0;
    }
}
