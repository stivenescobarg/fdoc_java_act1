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

      /*  Comentario sobre kebab-case:
        kebab-case (ejemplo: mi-variable) NO es válido en Java porque el guion medio "-" se interpreta como un operador de resta.
        Ejemplo inválido: String mi-variable = "error"; Esto causaría un error de compilación. */

        // Datos primitivos en Java

        byte bytePrimitivo = 100;
        short shortPrimitivo = 10000;
        int intPrimitivo = 100000;
        long longPrimitivo = 100000L;
        float floatPrimitivo = 10.99f;
        double doublePrimitivo = 19.99d;
        boolean booleanPrimitivo = true;
        char charPrimitivo = 'A';

        System.out.println("byte: " + bytePrimitivo);
        System.out.println("short: " + shortPrimitivo);
        System.out.println("int: " + intPrimitivo);
        System.out.println("long: " + longPrimitivo);
        System.out.println("float: " + floatPrimitivo);    
        System.out.println("double: " + doublePrimitivo);
        System.out.println("boolean: " + booleanPrimitivo);
        System.out.println("char: " + charPrimitivo);

        // Ejemplos de operaciones con datos primitivos
        int operacionSuma = 5 + 3;
        System.out.println("Suma: " + operacionSuma);

        // Ejemplo con boolean y condicional
        int edadActualBool = 17;
        boolean esMayor = edadActualBool > 18;
        System.out.println("¿Es mayor de edad? " + esMayor);
        if (esMayor) {
            System.out.println("El usuario es mayor de edad.");
        } else {
            System.out.println("El usuario es menor de edad.");
        }

        // Datos no primitivos (objetos)
        String textoNoPrimitivo = "hola, mundo no primitivo";
        

         int[] numeros = new int[3];

        // Asignación de valores a las posiciones del arreglo
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;

        // Impresión de los valores del arreglo
        System.out.println("Contenido del arreglo int[]:");
        System.out.println("Posición 0: " + numeros[0]);
        System.out.println("Posición 1: " + numeros[1]);
        System.out.println("Posición 2: " + numeros[2]);

        Persona persona1 = new Persona("Stiven", 17);

        // Mostrar los datos del objeto creado
        System.out.println("Datos de la persona:");
        System.out.println("Nombre: " + persona1.nombre);
        System.out.println("Edad: " + persona1.edad);
    }

    // Clase Persona como ejemplo de dato no primitivo
        static class Persona {
    String nombre;
    int edad;

    // Constructor de la clase Persona
        Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }
        
    }
}