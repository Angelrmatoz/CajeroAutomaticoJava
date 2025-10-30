import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double saldo = 1000;
        var cajero = false;
        Scanner scanner = new Scanner(System.in);

        while (!cajero) {
            System.out.println("""
                    *** Cajero Automático ***
                    
                    Menú:
                    1. Consultar saldo
                    2. Retirar
                    3. Depositar
                    4. Salir
                    """);

            System.out.println("Ingrese una opción: ");
            int opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1 -> System.out.println("Su saldo es: " + saldo);
                case 2 -> {
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double retirar = Double.parseDouble(scanner.nextLine());
                    if (retirar <= saldo) {
                        saldo -= retirar;
                        System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
                    } else {
                        System.out.println("Fondos insuficientes.");
                    }
                }
                case 3 -> {
                    System.out.print("Ingrese la cantidad a depositar: ");
                    double depositar = new java.util.Scanner(System.in).nextDouble();
                    saldo += depositar;
                    System.out.println("Depósito exitoso. Nuevo saldo: " + saldo);
                }
                case 4 -> {
                    System.out.println("Gracias por usar el cajero automático. ¡Hasta luego!");
                    cajero = true;
                }
            }
        }

        scanner.close();
    }
}
