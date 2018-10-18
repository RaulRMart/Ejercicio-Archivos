import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("Hola Mundo!");
        //Ejercicio leer las claificaicones de los alumnos desde un archivo de texto y calcular su promedio
        //el archivo contiente el nombre del alumno, materia, cantidad de calificaciones y la secuencia de sus valores
        File archivo = new File("Calificaciones.txt");
        try
        {
            Scanner entrada = new Scanner(archivo);
            while(entrada.hasNext())
            {
                String nombreAlumno = entrada.next();
                String nombreMateria = entrada.next();
                int  totalCalificaciones = entrada.nextInt(); //toma el entero sin leer el salto de linea
                entrada.next(); //omitir el salto de linea
                float promedio = 0;
                //ciclo para que lea las calificaciones según el número de calificaciones que aparecen en el archivo
                for(int i=0; i<totalCalificaciones; i++) {
                    int calificacion = entrada.nextInt();
                    promedio = (calificacion + promedio)/totalCalificaciones;
                }
            }
            //calcular el promedio e imprimirlo
            double prom = suma / totalCalificaiones;
        } catch(FileNotFoundException excepcion) {
            System.out.println("No se puede abrir el archivo");
        }
        catch(InputMismatchException excepcion){
            System.err.println("Existe un error en la entrada");
        }
    }
}
