/**
 * Write a description of class EstudianteEstructurada here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class VendedorEstructurada
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] identificaciones = new String[50];
        String[] nombres = new String[50];        
        double[] ventauno = new double[50];        
       
        int numeroVendedores;
        String identificacion, nombre;
        double venta1 , venta2 , venta3;
        double promedio = 0;
        System.out.println("Digite la cantidad de vendedores");
        numeroVendedores = sc.nextInt();
        for(int i = 0; i < numeroVendedores; i++){
            System.out.println("digite la identificacion del vendedor");
            identificacion = sc.next();
            System.out.println("digite el nombre del vendedor");
            nombre = sc.next();            
            System.out.println("digite venta mensual del vendedor");
            venta1 = sc.nextDouble(); 
            identificaciones[i] = identificacion;
            nombres[i] = nombre;           
            ventauno[i] = venta1;             
        }
        for (int i = 0; i < numeroVendedores; i++){
            promedio = promedio + (ventauno[i] )  / numeroVendedores;
        }
        
        System.out.println("El promedio de venta del mes de todos los vendedores es: " + promedio);
    }
}
