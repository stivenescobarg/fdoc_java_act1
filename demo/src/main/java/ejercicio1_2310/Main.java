package ejercicio1_2310;

public class Main {
    
    public static void main(String[] args) {
        
        int numero = 5;
        System.out.println("El número es: " + numero);

        double decimal = 5.99;
        System.out.println("El número decimal es: " + decimal);

        String texto = "Hola, Mundo!";
        System.out.println(texto);

        
        // lowerCamelCase: se usa para variables y métodos
        String nombreCompleto = "Stiven Escobar";
        int edadActual = 22;
       
        System.out.println("Nombre completo: " + nombreCompleto);
        System.out.println("Edad actual: " + edadActual);

        // MAYÚSCULAS_CON_GUIONES: se usa para constantes
        final int AÑO_ACTUAL = 2025;
        System.out.println("El año actual es: " + AÑO_ACTUAL);

        // Mensaje explicando la convención PascalCase
        String mensajeConvencion = "La convención PascalCase se usa para nombres de clases en Java. la primera letra de cada palabra compuesta se escribe en mayúscula, sin usar espacios ni guiones bajos, en este caso la clase Main.";
        System.out.println(mensajeConvencion);

         // lowerCamelCase para variables
        String nombreUsuario = "stivenescobarg";
        int numeroDeIntentos = 3;

        System.out.println("Usuario: " + nombreUsuario);
        System.out.println("Número de intentos: " + numeroDeIntentos);

        // snake_case: también válido en Java (aunque no común)
        String nombre_usuario = "stiven_escobar";
        int edad_usuario = 30;

        System.out.println("Nombre (snake_case): " + nombre_usuario);
        System.out.println("Edad (snake_case): " + edad_usuario);

    }
}