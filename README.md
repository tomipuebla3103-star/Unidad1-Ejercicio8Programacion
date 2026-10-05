<img width="837" height="116" alt="image" src="https://github.com/user-attachments/assets/8eb454d9-6d20-4a90-ae7d-ef3a3d4afe33" />
 Simulación de un Termómetro Digital

 Descripción

El programa utiliza una clase llamada `TermometroIoT` para guardar una temperatura en grados Celsius y convertirla a grados Fahrenheit.

De esta forma, se pueden mostrar las dos temperaturas por consola.

 Objetivo

El objetivo del ejercicio es practicar algunos conceptos de Programación Orientada a Objetos (POO), como:

 Clases y objetos.
 Atributos privados.
 Constructores.
 Métodos.
 Cálculos con atributos de un objeto.

 Clase TermometroIoT

La clase `TermometroIoT` tiene el siguiente atributo privado:

 `temperaturaCelsius`: temperatura registrada en grados Celsius.

 Constructor

El constructor recibe la temperatura en grados Celsius y la guarda en el objeto.

 Métodos
`obtenerFahrenheit()`

Convierte la temperatura de grados Celsius a grados Fahrenheit utilizando la siguiente fórmula:

F = C × 9/5 + 32


El método devuelve el resultado de la conversión.

 Ejemplo

En el `main` se crea un objeto `TermometroIoT` con una temperatura en grados Celsius.

Después se utiliza el método `obtenerFahrenheit()` para realizar la conversión y se muestran por consola tanto la temperatura en Celsius como la temperatura en Fahrenheit.
