/*En un sistema de inventario es importante conocer si es necesario solicitar un determinado producto a su proveedor de acuerdo a una cantidad mínima requerida en bodega. Se requiere un algoritmo que dada una cantidad en bodega y una cantidad mínima requerida indique si es necesario o no solicitar el producto al proveedor. En caso de no ser necesario la solicitud del producto, indique cuántas unidades hacen falta vender para tener que realizar el pedido y genere una alerta cuando estas unidades sean menores a 10.

Ejemplos: 
*Cantidad en bodega: 500, Cantidad mínima requerida 100. Entonces no es necesario realizar el pedido al proveedor. Unidades que hacen falta vender: 400. 
*Cantidad en bodega: 55, Cantidad mínima requerida 50. Entonces no es necesario realizar el pedido al proveedor. Unidades que hacen falta vender: 5. Alerta generada.
*Cantidad en bodega: 300, Cantidad mínima requerida 450. Entonces si es necesario realizar el pedido al proveedor.

Requerimiento: utilice condicionales múltiples.

 */
import java.util.*;
public class Ejercicio3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad del producto en bodega: ");
        int cantidadBodega = Integer.parseInt(sc.nextLine());
        int cantidadMinimaRequerida = 100;
        int faltantesVenta = cantidadBodega - cantidadMinimaRequerida;
        
        //Condicionales multiples
        
        if(cantidadBodega>=cantidadMinimaRequerida && faltantesVenta>=10){
            
            System.out.println("Cantidad en bodega: "+cantidadBodega+", Cantidad minima requerida 100. Entonces no es necesario realizar el pedido al proveedor. Unidades que hacen falta vender: "+faltantesVenta);
            
                
        }else if(cantidadBodega>=cantidadMinimaRequerida && faltantesVenta<10){
            System.out.println("Cantidad en bodega: "+cantidadBodega+", Cantidad minima requerida 100. Entonces no es necesario realizar el pedido al proveedor. Unidades que hacen falta vender: "+faltantesVenta+". Alerta generada");

        }else{
            System.out.println("Cantidad en bodega: "+cantidadBodega+", Cantidad minima requerida 100. Entonces si es necesario realizar el pedido al proveedor");
        }
               
        
           

    }
}

