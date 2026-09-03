//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    TermometroIoT termometro = new TermometroIoT(25);

    System.out.println("Temperatura en Celsius: "
            + termometro.getTemperaturaCelsius() + " °C");

    System.out.println("Temperatura en Fahrenheit: "
            + termometro.obtenerFahrenheit() + " °F");

}
