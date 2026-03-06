import java.util.Scanner;

public class Solucion {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Definición de arrays
        int[] array1, array2;
        Double[] array3;

        array1 = new int[7];
        array2 = new int[7];
        array3 = new Double[7];

        //Llenado de arrays
        System.out.println("-----------------------");
        for (int i = 0; i < 7; i++) {
            System.out.println("Ingresa un número para el primer array:");
            array1[i] = input.nextInt();

            System.out.println("-----");

            System.out.println("Ingresa un número para el segundo array");
            array2[i] = input.nextInt();
        }

        //llenado de tercer array con diferencia de los dos primeros
        double promedioTotal = 0.0;
        int aux = 0; //contador adicional para evitar conflictos
        for (int i = 0; i < array3.length; i++) {
            array3[aux++] = (double) array1[i] - array2[i];
        }

        System.out.println("---------------\nDatos del tercer array:\r\n");
        //promedio
        double promedio; double suma = 0; //variable auxiliar como acumulador
        int aux2 = 0;
        int contadorExplicacion = 1;
        for (int i = 0; i < array3.length; i++) {
            suma += array3[i];
            System.out.println("Dato " + contadorExplicacion++ + " = " + array3[aux2++]);

        }
        promedio = suma / array3.length;
        System.out.println("\rEl promedio total del tercer array es de: " + Math.round(promedio));
        System.out.println("---------------");





    }
}
