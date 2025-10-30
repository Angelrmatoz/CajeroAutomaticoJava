# Cajero Automático

Este proyecto es una simulación sencilla de un cajero automático en Java. Permite al usuario consultar su saldo, retirar dinero, depositar dinero y salir del sistema. El código está completamente comentado para facilitar su comprensión.

## Estructura del Proyecto

- `src/Main.java`: Contiene la lógica principal del cajero automático.

## Funcionamiento

Al ejecutar el programa, se muestra un menú con las siguientes opciones:

1. **Consultar saldo**: Muestra el saldo actual del usuario.
2. **Retirar**: Permite retirar una cantidad de dinero si hay fondos suficientes.
3. **Depositar**: Permite depositar una cantidad de dinero al saldo.
4. **Salir**: Finaliza el programa.

## Código comentado

```java
import java.util.Scanner; // Importa la clase Scanner para leer la entrada del usuario

public class Main {
    public static void main(String[] args) {
        double saldo = 1000; // Saldo inicial del usuario
        boolean cajero = false; // Variable de control para el bucle principal
        Scanner scanner = new Scanner(System.in); // Objeto Scanner para leer entradas

        while (!cajero) { // Bucle principal del cajero automático
            System.out.println("""
                    *** Cajero Automático ***
                    
                    Menú:
                    1. Consultar saldo
                    2. Retirar
                    3. Depositar
                    4. Salir
                    """);

            System.out.println("Ingrese una opción: "); // Solicita la opción al usuario
            int opcion = Integer.parseInt(scanner.nextLine()); // Lee la opción como entero

            switch (opcion) { // Evalúa la opción seleccionada
                case 1 -> System.out.println("Su saldo es: " + saldo); // Muestra el saldo
                case 2 -> {
                    System.out.print("Ingrese la cantidad a retirar: "); // Solicita cantidad a retirar
                    double retirar = Double.parseDouble(scanner.nextLine()); // Lee la cantidad
                    if (retirar <= saldo) { // Verifica si hay fondos suficientes
                        saldo -= retirar; // Resta la cantidad al saldo
                        System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
                    } else {
                        System.out.println("Fondos insuficientes."); // Mensaje si no hay fondos
                    }
                }
                case 3 -> {
                    System.out.print("Ingrese la cantidad a depositar: "); // Solicita cantidad a depositar
                    double depositar = Double.parseDouble(scanner.nextLine()); // Lee la cantidad
                    saldo += depositar; // Suma la cantidad al saldo
                    System.out.println("Depósito exitoso. Nuevo saldo: " + saldo);
                }
                case 4 -> {
                    System.out.println("Gracias por usar el cajero automático. ¡Hasta luego!"); // Mensaje de despedida
                    cajero = true; // Sale del bucle
                }
                default -> System.out.println("Opción no válida."); // Opción inválida
            }
        }
        scanner.close(); // Cierra el Scanner
    }
}
```

## Notas
- El saldo inicial es de 1000 unidades monetarias.
- El programa utiliza un bucle `while` para mostrar el menú hasta que el usuario elija salir.
- Se recomienda ingresar solo números válidos para evitar errores de ejecución.

## Autor
- Proyecto realizado como ejemplo educativo para el manejo de estructuras de control y entrada de datos en Java.

