/**
 * Write a description of class Notas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Ventas
{   
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int numeroVendedores;
       VendedorPOO[] losVendedores = new VendedorPOO[50];
       String identificacion, nombre, curso;
       double venta1;
       double promedio = 0;  
       System.out.println("Digite la cantidad de vendedores");
       numeroVendedores = sc.nextInt();
       for(int i = 0; i < numeroVendedores; i++){
           System.out.println("Digite la identificacion del vendedor"); 
            identificacion = sc.next();
            System.out.println("Digite el nombre del vendedor"); 
            nombre = sc.next();
            
            System.out.println("Ingrese la venta realizada en el mes"); 
            venta1 = sc.nextDouble();             
            VendedorPOO unVendedor = new VendedorPOO();
            unVendedor.identificacion = identificacion;
            unVendedor.nombre = nombre;
            unVendedor.ventauno = venta1;
    
            losVendedores[i] = unVendedor;
       }
       for (int i = 0; i< numeroVendedores; i++){
           double sum = (losVendedores[i].ventauno + losVendedores[i].ventauno  )/numeroVendedores;
           promedio = promedio + sum / numeroVendedores;
       }
       
       System.out.println("El promedio de venta mensual es : " + promedio);
   }
}
