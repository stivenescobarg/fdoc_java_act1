package ejercicio1_2310;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
          Scanner sc = new Scanner(System.in);
          
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

        //Operadores aritméticos

        int a=5;
        int b=10;

        int sumar=  a+b;
        int restar= b-a;
        int multiplicar= a*b;
        int dividir= b/a;
        int modulo= b%a;

        System.out.println("Suma: " + sumar);
        System.out.println("Resta: " + restar);
        System.out.println("Multiplicación: " + multiplicar);
        System.out.println("División: " + dividir);
        System.out.println("Módulo: " + modulo);

        // Division entera y decimal del mismo par de numeros

        int divisionEntera= b/a;
        double divisionDecimal= (double) b/a;

        System.out.println("División entera: " + divisionEntera);
        System.out.println("División decimal: " + divisionDecimal);

        // Incremento y decremento

        int contador = 10;
        System.out.println("Contador inicial: " + contador);
        contador+=2; // Incremento
        System.out.println("Después del incremento: " + contador);
        contador--; // Decremento
        System.out.println("Después del decremento: " + contador);

        // Operadores de asignación

        int valor = 10;
        System.out.println("Valor inicial: " + valor);
        
        valor += 5; // Equivale a: valor = valor + 5
        System.out.println("Después de valor += 5: " + valor);
        
        valor -= 3; // Equivale a: valor = valor - 3
        System.out.println("Después de valor -= 3: " + valor);
        
        int numeroAsignación = 4;
        System.out.println("Número inicial: " + numeroAsignación);
        
        numeroAsignación *= 4; // Equivale a: numero = numero * 2
        System.out.println("Después de numero *= 4: " + numeroAsignación);
        
        numeroAsignación /= 3; // Equivale a: numero = numero / 3
        System.out.println("Después de numero /= 3: " + numeroAsignación);

        //%=

        int dividendo = 17;
        System.out.println("Valor inicial: " + dividendo);
        
        System.out.println("\nExplicación: %= calcula el residuo de la división");
        System.out.println("Por ejemplo: 17 % 5 = 2 (porque 17 ÷ 5 = 3 con residuo 2)");
        
        dividendo %= 5;
        System.out.println("\nDespués de dividendo %= 5: " + dividendo);
        System.out.println("Esto significa: 17 dividido entre 5 da residuo " + dividendo);

        // Operadores de comparación

        int comparador1 = 10;
        int comparador2 = 5;
        int comparador3 = 10;
        
        System.out.println("comparador 1 = " + comparador1 + ", comparador 2 = " + comparador2 + ", comparador 3 = " + comparador3);
        
        System.out.println("comparador 1 == comparador 2: " + (comparador1 == comparador2));  
        System.out.println("comparador 1 == comparador 3: " + (comparador1 == comparador3)); 
        System.out.println("comparador 1 != comparador 2: " + (comparador1 != comparador3));   
        System.out.println("comparador 1 != comparador 3: " + (comparador1 != comparador3));

        // <>

        int num1 = 10;
        int num2 = 40;
        int num3 = 20;

        System.out.println("numero 1: " +num1 + " Numero 2: " +num2 + " Numero 3: " + num3);

        System.out.println("Numero 3 > Numero 2?: " + (num3>num2));
        System.out.println("numero 1 < numero 2?: " + (num1<num2));
         System.out.println("Numero 2 >= Numero 1?: " + (num2>=num1));
        System.out.println("numero 3 <= numero 1?: " + (num3<=num1));

        // USANDO IF

        if(comparador1==comparador3){
            System.out.println("Los numero son iguales");
        } else{
            System.out.println("Ambos son numeros diferentes");
        }

        if (num3<num1){
            System.out.println("El numero 3 es menor a el numero 1");
        } else{
            System.out.println("El numero 1 es menor a el numero 3");
        }

        // Operadores lógicos

        // || &&

        boolean condicion1 = true;
        boolean condicion2 = false;
        boolean condicion3= false;

        System.out.println("Condición 1: "+ condicion1 + " \nCondicion 2: " + condicion2 + " \nCondicion 3: " + condicion3);

        System.out.println(" Condicion 1 && Condicion 2: " + (condicion1&&condicion2));
        System.out.println(" Condicion 2 || Condicion 3: " + (condicion2||condicion3));
         System.out.println(" Condicion 2 || Condicion 1: " + (condicion2||condicion1));

         // ! boolean

        System.out.println(" Negación condicional 1 " + (!condicion1));
        System.out.println(" Negación Condicional 2 " + (!condicion3));

        // Combinación operadores lógicos y parentesis

        boolean combinacion1 = (condicion1 && condicion2) || condicion3;
        System.out.println("(Condición1 AND Condición2) OR Condición3: " + combinacion1);

         // ---------- IF ----------
        int if1 = 10;
        int if2 = 5;
        if (a > b) {
            System.out.println("El número " + if1 + " es mayor que " + if2);
        }

        // ---------- IF - ELSE ----------
        int edad = 17;
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }

        // ---------- IF - ELSE IF - ELSE ----------
        int numeroIfElse = 45;
        if (numeroIfElse < 20) {
            System.out.println("El número es pequeño");
        } else if (numeroIfElse <= 50) {
            System.out.println("El número es mediano");
        } else {
            System.out.println("El número es grande");
        }

         // ---------- OPERADOR TERNARIO ----------
        int edad2 = 20;
        String mensajeEdad = (edad2 >= 18) ? "Mayor de edad" : "Menor de edad";
        System.out.println(mensajeEdad);

        int cantidad = 12;
        double precio = 100.0;
        double total = (cantidad * precio);
        System.out.println("El precio sin descuento es: "+total);
        double totalAPagar = (cantidad > 10) ? precio * 0.9 : precio; // 10% de descuento si compra más de 10
        System.out.println("Total a pagar aplicando el descuento: $" + totalAPagar);
        

        int num = 7;
        String paridad = (num % 2 == 0) ? "Par" : "Impar";
        System.out.println("El número " + num + " es " + paridad);

               // ---------- SWITCH ----------
        String dia = "Martes";
        int numeroDia;
        switch (dia.toLowerCase()) {
            case "lunes": numeroDia = 1; break;
            case "martes": numeroDia = 2; break;
            case "miércoles":
            case "miercoles": numeroDia = 3; break;
            case "jueves": numeroDia = 4; break;
            case "viernes": numeroDia = 5; break;
            case "sábado":
            case "sabado": numeroDia = 6; break;
            case "domingo": numeroDia = 7; break;
            default: numeroDia = 0;
        }
        System.out.println("El día " + dia + " corresponde al número " + numeroDia);

        int calificacion = 4;
        String textoCalificacion;
        switch (calificacion) {
            case 1: textoCalificacion = "Insuficiente"; break;
            case 2: textoCalificacion = "Regular"; break;
            case 3: textoCalificacion = "Bueno"; break;
            case 4: textoCalificacion = "Muy Bueno"; break;
            case 5: textoCalificacion = "Excelente"; break;
            default: textoCalificacion = "Calificación inválida";
        }
        System.out.println("Tu desempeño es: " + textoCalificacion);

        int estacion = 2;
        switch (estacion) {
            case 1: System.out.println("Primavera"); break;
            case 2: System.out.println("Verano"); break;
            case 3: System.out.println("Otoño"); break;
            case 4: System.out.println("Invierno"); break;
            default: System.out.println("Número inválido");
        }

        
        // ---------- OTROS EJEMPLOS ----------
        int n = -3;
        if (n > 0) {
            System.out.println("El número es positivo");
        } else if (n < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es cero");
        }

        String contraseñaEsperada = "1234";
        System.out.print("Ingrese su contraseña: ");
        String contraseñaIngresada = sc.nextLine();

        if (contraseñaIngresada.equals(contraseñaEsperada)) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Contraseña incorrecta");
        }

        double nota = 3.5;
        if (nota < 3.0) {
            System.out.println("Reprobado");
        } else if (nota < 4.0) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Excelente desempeño");
        }

        sc.close();

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