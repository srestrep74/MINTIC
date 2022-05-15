/*En un sistema de inventario es importante conocer si es necesario solicitar un determinado producto a su proveedor de acuerdo a una cantidad mínima requerida en bodega. Se requiere un algoritmo que dada una cantidad en bodega y una cantidad mínima requerida indique si es necesario o no solicitar el producto al proveedor.

Ejemplos: 
*Cantidad en bodega: 500, Cantidad mínima requerida 100. Entonces no es necesario realizar el pedido al proveedor.
*Cantidad en bodega: 300, Cantidad mínima requerida 450. Entonces si es necesario realizar el pedido al proveedor.

Requerimiento: utilice condicionales dobles.


 */
import java.util.*;
 public class Ejercicio2{
     public static void main(String [] args){   
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad del producto en bodega: ");
        int cantidadBodega = Integer.parseInt(sc.nextLine());

        
        int cantidadMinimaRequerida = 100;

        //Condicionales Dobles
        if(cantidadBodega>=cantidadMinimaRequerida){
            System.out.println("Cantidad en bodega: "+cantidadBodega+", Cantidad minima requerida 100. Entonces no es necesario realizar el pedido al proveedor");
        }else{
            System.out.println("Cantidad en bodega: "+cantidadBodega+", Cantidad minima requerida 100. Entonces si es necesario realizar el pedido al proveedor");
        }
     }
 }
