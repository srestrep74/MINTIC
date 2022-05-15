/*Una determinada empresa ha decidido ofrecer descuentos a sus clientes de acuerdo al día de la semana en el que se realice la compra, para lo cual se requiere un algoritmo que dado el día de la semana (en número), y el total a pagar sin descuento, calcule el total incluyendo el descuento. El descuento se otorga de acuerdo a la siguiente tabla.


Dia	Descuento
1	5%
2	3%
3	10%
4	4%
5	6%
6	2%
7	1%

 */
import java.util.*;
public class Ejercicio5 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el numero del dia de la semana de la compra: ");

        int diaCompra = Integer.parseInt(sc.nextLine());

        System.out.print("Ingrese el total a pagar sin el descuento: ");

        int totalPago = Integer.parseInt(sc.nextLine());

        int pagoDescuento  = 0;

        switch(diaCompra){

            case 1:
                pagoDescuento = totalPago - ((totalPago*5)/100);
                System.out.print("Con el descuento, su total a pagar es de -> "+pagoDescuento);
                break;

            case 2:
                pagoDescuento = totalPago - ((totalPago*3)/100);
                System.out.print("Con el descuento, su total a pagar es de -> "+pagoDescuento);
                break;

            case 3:
                pagoDescuento = totalPago - ((totalPago*10)/100);
                System.out.print("Con el descuento, su total a pagar es de -> "+pagoDescuento);
                break;

            case 4:
                pagoDescuento = totalPago - ((totalPago*4)/100);
                System.out.print("Con el descuento, su total a pagar es de -> "+pagoDescuento);
                break;

            case 5:
                pagoDescuento = totalPago - ((totalPago*6)/100);
                System.out.print("Con el descuento, su total a pagar es de -> "+pagoDescuento);
                break;

            case 6:
                pagoDescuento = totalPago - ((totalPago*2)/100);
                System.out.print("Con el descuento, su total a pagar es de -> "+pagoDescuento);
                break;

            case 7:
                pagoDescuento = totalPago - ((totalPago*1)/100);
                System.out.print("Con el descuento, su total a pagar es de -> "+pagoDescuento);
                break;
                
            default:
                System.out.print("La opcion ingresada no es valida.");
        }

    }
}
