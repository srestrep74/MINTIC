/*En un sistema de inventario es importante conocer si es necesario solicitar un determinado producto a su proveedor de acuerdo a una cantidad mínima requerida en bodega. Se requiere un algoritmo que dada una cantidad en bodega y una cantidad mínima requerida indique si es necesario o no solicitar el producto al proveedor. 

Adicionalmente, en caso de no ser necesario la solicitud del producto, indique cuántas unidades hacen falta vender para tener que realizar el pedido y genere una alerta cuando estas unidades sean menores a 10. Por el contrario si se debe realizar el pedido, debe solicitar las unidades de compra deseadas, el valor de compra del producto y el dinero en caja con el fin de validar si es posible realizar la compra.

Ejemplos: 
*Cantidad en bodega: 500, Cantidad mínima requerida 100. Entonces no es necesario realizar el pedido al proveedor. Unidades que hacen falta vender: 400. 
*Cantidad en bodega: 55, Cantidad mínima requerida 50. Entonces no es necesario realizar el pedido al proveedor. Unidades que hacen falta vender: 5. Alerta generada.
*Cantidad en bodega: 300, Cantidad mínima requerida 450. Entonces si es necesario realizar el pedido al proveedor. Cantidades de compra deseada: 200. Valor de compra: 3350, Valor en caja: 1.050.000. Si es posible realizar el pedido
*Cantidad en bodega: 300, Cantidad mínima requerida 450. Entonces si es necesario realizar el pedido al proveedor. Cantidades de compra deseada: 200. Valor de compra: 3350, Valor en caja: 400.000. No es posible realizar el pedido

Requerimiento: utilice condicionales anidados

 */
import java.util.*;
public class Ejercicio4 {
    public static void main(String[]args){

       Scanner sc = new Scanner(System.in);
       System.out.print("Ingrese la cantidad del producto en bodega: ");

       //Variables a utilizar
        int cantidadBodega = Integer.parseInt(sc.nextLine());
        int cantidadMinimaRequerida = 100;
        int faltantesVenta = cantidadBodega - cantidadMinimaRequerida;
        int unidadesDeseadas = 0;
        int valorCompra = 0;
        int dineroCaja = 0;

        //Condicionales Anidados

        if(cantidadBodega>=cantidadMinimaRequerida && faltantesVenta>=10){
            
            System.out.println("Cantidad en bodega: "+cantidadBodega+", Cantidad minima requerida 100. Entonces no es necesario realizar el pedido al proveedor. Unidades que hacen falta vender: "+faltantesVenta);
            
                
        }else if(cantidadBodega>=cantidadMinimaRequerida && faltantesVenta<10){
            System.out.println("Cantidad en bodega: "+cantidadBodega+", Cantidad minima requerida 100. Entonces no es necesario realizar el pedido al proveedor. Unidades que hacen falta vender: "+faltantesVenta+". Alerta generada");

        }else{
            
            System.out.print("¿Cuantas unidades desea solicitar? : ");
            unidadesDeseadas = Integer.parseInt(sc.nextLine());
            System.out.println("\n Ingrese el valor de la compra: ");
            valorCompra = Integer.parseInt(sc.nextLine());
            System.out.print("Ingrese el dinero en caja: ");
            dineroCaja = Integer.parseInt(sc.nextLine());

            if(dineroCaja>=valorCompra){
                System.out.println("Cantidad en bodega: "+cantidadBodega+", Cantidad minima requerida 100. Entonces si es necesario realizar el pedido al proveedor. Cantidades de compra deseada: "+unidadesDeseadas+" .Valor de compra: "+valorCompra+" ,Valor en caja: "+dineroCaja+" .Si es posible realizar el pedido.");
            }else{
                System.out.println("Cantidad en bodega: "+cantidadBodega+", Cantidad minima requerida 100. Entonces si es necesario realizar el pedido al proveedor. Cantidades de compra deseada: "+unidadesDeseadas+" .Valor de compra: "+valorCompra+" ,Valor en caja: "+dineroCaja+" .No es posible realizar el pedido.");
            }
        }
    }
}
