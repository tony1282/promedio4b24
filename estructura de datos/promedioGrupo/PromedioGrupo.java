


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PromedioGrupo{
    
        /* Programa que calcula el promedio de un grupo
         * El tamano del grupo es N
         * lLas calificaciones se leen y se almacenan en un arreglo de tamano N
         *
         */
        public static void main(String[] args) throws IOException {
            int N;//tamano del arreglo
            BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
            String entrada;
            double[] calificaciones;//arreglo de calificaciones
            double suma = 0;//para sumar calificaciones
            double promedio;//el promedio del grupo
            estudiante[] estudiantes;

            System.out.println("Programa que calcula el promedio de un grupo");
            System.out.println("escribe el tamano del grupo");
            entrada = bufer.readLine();
            N = Integer.parseInt(entrada);
            //construimos el arreglo de calificaciones 
            calificaciones = new double[N];
            //leer las califaciones de cada alunmno 
            for (int i = 0; i < calificaciones.length; i++){
                System.out.println("escriba la calificacion del alumno" +(i+1) + ":");
                entrada = bufer.readLine();
                calificaciones[i] = Double.parseDouble(entrada);
                suma += calificaciones[i];
            }
            promedio = suma / N;
        System.out.println("Las Calificaciones del Grupo son: ");
        for (int i = 0; i < calificaciones.length; i++){
            System.out.println(calificaciones[i]);
        }
        System.out.println("El promedio del Grupo es: " + promedio);

    }
}




    