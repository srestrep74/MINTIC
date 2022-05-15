/*Como parte de un sistema de facturación es necesario conocer el valor unitario y las cantidades a comprar de cada uno de los productos para calcular el total a pagar. 

Se requiere un algoritmo que para un conjunto de clientes, calcule para cada uno de ellos el valor a pagar de N tipos de productos comprados de acuerdo a la cantidad a llevar de cada tipo. Al finalizar la atención de los clientes, se debe indicar el total vendido por la empresa. Para las compras superiores a 100.000 la empresa ha decido otorgar un 10% de descuento sobre el total de la compra.

Nota: Se deben atender a los clientes hasta que el usuario indique lo contrario.

Ejemplo:
Cliente 1:
Cantidad de tipo de productos: 3
Cantidad del producto 1: 4. Valor del producto 1: 2450
Cantidad del producto 2: 10. Valor del producto 1: 6540
Cantidad del producto 3: 1. Valor del producto 1: 1050
Total de la factura: 76250

Cliente 2:
Cantidad de tipo de productos: 2
Cantidad del producto 1: 5. Valor del producto 1: 10560
Cantidad del producto 2: 7. Valor del producto 1: 650
Total de la factura: 57350

Total vendido:133600



 */
import java.util.*;
public class Ejercicio7 {

    public static void main(String[]args){

        Scanner s = new Scanner(System.in);

        System.out.print("¿Desea atender usuarios? y/n ");

        String respuesta = s.nextLine();

        //Variables a utilizar
        int cantidadClientes = 0;
        int cantidadTipoProductos = 0;
        int cantidadProductoI = 0;
        int valorProducto = 0;
        int totalFactura = 0;
        int totalVendido = 0;

        if(respuesta.equals("y") || respuesta.equals("n")){
            while(!respuesta.equals("n")){
                
                System.out.print("Cuantos clientes desea atender: ");
                cantidadClientes = Integer.parseInt(s.nextLine());

                for(int i = 1; i<=cantidadClientes; i++){
                    
                    totalFactura = 0;
                    System.out.print("Ingrese la cantidad de tipo de productos del cliente "+i+": ");
                    cantidadTipoProductos = Integer.parseInt(s.nextLine());

                    for(int j =1; j<=cantidadTipoProductos; j++){
                        
                        System.out.print("Ingrese la cantidad del producto "+j+": ");
                        cantidadProductoI = Integer.parseInt(s.nextLine());

                        System.out.print("Ingrese el valor del producto "+j+": ");
                        valorProducto = Integer.parseInt(s.nextLine());
                        valorProducto *= cantidadProductoI;
                        totalFactura += valorProducto;

                    }

                    System.out.println("Total de la factura: "+totalFactura);

                    totalVendido += totalFactura;
                }

                System.out.println("Total Vendido: "+totalVendido);

                System.out.print("¿Desea atender mas clientes? y/n ");
                respuesta  = s.nextLine();

            }
        }else{
            
            System.out.println("La opcion ingresada no es valida.");
        }
        

        
    }
}

