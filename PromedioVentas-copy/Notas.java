
/**
 * Write a description of class Notas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Notas
{   
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int numeroEstudiantes;
       EstudiantePOO[] losEstudiantes = new EstudiantePOO[50];
       String identificacion, nombre, curso;
       double nota1, nota2 , nota3;
       double promedio = 0;  
       System.out.println("Digite la cantidad de estudiantes");
       numeroEstudiantes = sc.nextInt();
       for(int i = 0; i < numeroEstudiantes; i++){
           System.out.println("Digite la identificacion del estudiante"); 
            identificacion = sc.next();
            System.out.println("Digite el nombre del estudiante"); 
            nombre = sc.next();
            System.out.println("Digite el curso del estudiante"); 
            curso = sc.next();
            System.out.println("Digite la nota 1  del estudiante"); 
            nota1 = sc.nextDouble();
            System.out.println("Digite la nota 2  del estudiante"); 
            nota2 = sc.nextDouble();
            System.out.println("Digite la nota 3  del estudiante"); 
            nota3 = sc.nextDouble();
            EstudiantePOO unEstudiante = new EstudiantePOO();
            unEstudiante.identificacion = identificacion;
            unEstudiante.nombre = nombre;
            unEstudiante.curso = curso;
            unEstudiante.notauno = nota1;
            unEstudiante.notados = nota2;
            unEstudiante.notatres =nota3;
            losEstudiantes[i] = unEstudiante;
       }
       for (int i = 0; i< numeroEstudiantes; i++){
           double sum = (losEstudiantes[i].notauno + losEstudiantes[i].notados + losEstudiantes[i].notatres)/3;
           promedio = promedio + sum / numeroEstudiantes;
       }
       
       System.out.println("El promedio es: " + promedio);
   }
}
