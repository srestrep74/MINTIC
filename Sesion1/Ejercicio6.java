/*Como parte de un sistema de facturación es necesario conocer el valor unitario y las cantidades a comprar de cada uno de los productos para calcular el total a pagar. 

Se requiere un algoritmo que para 1 cliente, calcule el valor a pagar de N tipos de productos comprados de acuerdo a la cantidad a llevar de cada tipo.

Ejemplo:
Cantidad de tipo de productos: 3
Cantidad del producto 1: 4. Valor del producto 1: 2450
Cantidad del producto 2: 10. Valor del producto 2: 6540
Cantidad del producto 3: 1. Valor del producto 3: 1050
Total de la factura: 76250


 */
import java.util.*;
public class Ejercicio6 {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de tipo de productos: ");

        int cantidadProductos = Integer.parseInt(sc.nextLine());

        int total = 0;
        int cantidadProductoI = 0;
        int valorProducto = 0;

        for(int i = 1; i<=cantidadProductos ; i++){

            System.out.print("Ingrese la cantidad del producto "+i+":");
            cantidadProductoI = Integer.parseInt(sc.nextLine());

            System.out.print("Ingrese el valor del producto "+i+": ");
            valorProducto = Integer.parseInt(sc.nextLine());
            valorProducto*=cantidadProductoI;
            total += valorProducto;
        }

        System.out.println("Total de la factura: "+total);

    }
}