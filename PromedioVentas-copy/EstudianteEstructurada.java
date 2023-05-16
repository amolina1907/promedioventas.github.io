/**
 * Write a description of class EstudianteEstructurada here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class EstudianteEstructurada
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] identificaciones = new String[50];
        String[] nombres = new String[50];
        String[] cursos = new String[50];
        double[] notauno = new double[50];
        double[] notados = new double[50];
        double[] notatres = new double[50];
       
        int numeroEstudiantes;
        String identificacion, nombre, curso;
        double nota1, nota2, nota3;
        double promedio = 0;
        System.out.println("Digite la cantidad de estudiantes");
        numeroEstudiantes = sc.nextInt();
        for(int i = 0; i < numeroEstudiantes; i++){
            System.out.println("digite la identificacion del estudiante");
            identificacion = sc.next();
            System.out.println("digite el nombre del estudiante");
            nombre = sc.next();
            System.out.println("digite el curso del estudiante");
            curso = sc.next();
            System.out.println("digite nota 1 del estudiante");
            nota1 = sc.nextDouble();
            System.out.println("digite nota 2 del estudiante");
            nota2 = sc.nextDouble();
            System.out.println("digite nota 3 del estudiante");
            nota3 = sc.nextDouble();
            identificaciones[i] = identificacion;
            nombres[i] = nombre;
            cursos[i] = curso;
            notauno[i] = nota1;
            notados[i] = nota2;
            notatres[i] = nota3;
        }
        for (int i = 0; i < numeroEstudiantes; i++){
            promedio = promedio + ((notauno[i] + notados[i] + notatres[i]) / 3) / numeroEstudiantes;
        }
        System.out.println("El promedio de notas es: " + promedio);
    }
}