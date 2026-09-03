public class TermometroIoT {
    private double temperaturaCelsius;

    public TermometroIoT(double temperaturaCelsius) {
        this.temperaturaCelsius = temperaturaCelsius;
    }

    public double getTemperaturaCelsius() {
        return temperaturaCelsius;
    }

    public void setTemperaturaCelsius(double temperaturaCelsius) {
        this.temperaturaCelsius = temperaturaCelsius;
    }

    public double obtenerFahrenheit() {
        return temperaturaCelsius * 9 / 5 + 32;
    }
}
