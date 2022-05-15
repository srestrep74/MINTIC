/* Una determinada empresa con varias sedes en una ciudad tiene dentro de su información 1 lista, y 2 tablas que  corresponden a:

1: Lista con el código del producto.
2: Tabla con la cantidad en bodega del producto para el conjunto de sedes.
3: Tabla con la cantidad mínima requerida del producto para el mismo conjunto de sedes.

Es decir

A continuación se detallan los datos para 3 productos en 4 sedes.

Lista de códigos
354	256	127

Tabla de la cantidad en bodega
17	34	60
14	31	65
45	2	12
56	43	8

Tabla de la cantidad mínima requerida
14	44	76
10	51	15
46	23	2
89	4	18

Para el sistema de inventario es importante conocer si es necesario solicitar un determinado producto a su proveedor de acuerdo a la cantidad mínima requerida. 

Se solicita diseñar un algoritmo que:

●	Lea la lista de los códigos.
●	Lea las dos tablas mencionadas.
●	Almacene la lista en un vector y cada tabla en una matriz.
Una vez leídos los datos:
●	Indique los códigos de los productos de los cuales se deben realizar los pedidos, especificando el número de la sede. El número de sede corresponde al número de la fila en la tabla.
●	El promedio de las cantidades de cada producto en bodega y su respectivo código.

Nota: para facilitar el proceso de lectura, leer los códigos en una sola línea separados por coma, la tabla de cantidad en bodega leerla en una sola línea separando las filas por punto y coma y números por espacio. 

Es decir, para el ejemplo anteriormente descrito las entradas serán 3:
354 256 127
17 34 60;14 31 65;45 2 12;56 43 8
14 44 76;10 51 15;46 23 2;89 4 18

Y las salidas serán:

Se debe solicitar producto 256 en sede 0
Se debe solicitar producto 127 en sede 0
Se debe solicitar producto 256 en sede 1
Se debe solicitar producto 354 en sede 2
Se debe solicitar producto 256 en sede 2
Se debe solicitar producto 354 en sede 3
Se debe solicitar producto 127 en sede 3

El promedio de productos del codigo 354 es 27.75
El promedio de productos del codigo 256 es 27.5
El promedio de productos del codigo 127 es 14.75
*/
import java.util.*;
public class EjercicioSesion2 {
    
    public static void main(String[]args){

        String listaCodigos = "354,256,127";
        String tablaBodega = "17 34 60;14 31 65;45 2 12;56 43 8";
        String tablaMinimos = "14 44 76;10 51 15;46 23 2;89 4 18";

        
        int columnas = 0;
        int filas = 0;
        int codigos [];
        int tablaBodegaArr[][];
        int tablaMinimosArr[][];

        String codigosTexto[] = listaCodigos.split(",");
        codigos = new int[codigosTexto.length];

        for(int i = 0; i<codigos.length; i++){

            codigos[i] = Integer.parseInt(codigosTexto[i]);
        }

        
        // Saber cuantas filas tiene la tabla
        for(int i = 0; i<tablaBodega.length(); i++){
            if(tablaBodega.charAt(i) == ';'){
                filas++;
            }
        }
        filas++;

        //Saber cuantas columnas tiene la tabla
        for(int i = 0; i<tablaBodega.length(); i++){
            if(tablaBodega.charAt(i) == ';'){
                break;
            }else if(tablaBodega.charAt(i) == ' '){
                columnas++;
            }
        }
        columnas++;

        tablaBodegaArr = new int[filas][columnas];
        tablaMinimosArr = new int[filas][columnas];


        //Generar tabla de bodega y pasar sus datos a la matriz
        tablaBodega = tablaBodega.replace(';', ' ');
        String tablaBodegaTexto [] = tablaBodega.split(" ");

        
        int tablaBodegaInt[] = new int[tablaBodegaTexto.length];
        
        for(int i = 0; i<tablaBodegaTexto.length; i++){

            tablaBodegaInt[i] = Integer.parseInt(tablaBodegaTexto[i]);
            
        }

        int guia = 0;
        for(int i = 0; i<tablaBodegaArr.length; i++){
            for(int j = 0; j<tablaBodegaArr[0].length; j++){
                
                tablaBodegaArr[i][j] = tablaBodegaInt[guia];
                guia++;
               
            }
        }

        //Generar matriz de datos de productos minimos
        tablaMinimos = tablaMinimos.replace(';', ' ');
        String tablaMinimosTexto [] = tablaMinimos.split(" ");

        int tablaMinimosInt[] = new int[tablaMinimosTexto.length];

        for(int i = 0; i<tablaMinimosTexto.length; i++){

            tablaMinimosInt[i] = Integer.parseInt(tablaMinimosTexto[i]);
            
        }

        int guia2 = 0;
        for(int i = 0; i<tablaMinimosArr.length; i++){
            for(int j = 0; j<tablaMinimosArr[0].length; j++){
                
                tablaMinimosArr[i][j] = tablaMinimosInt[guia2];
                guia2++;
               
            }
        }

        //  Productos a realizar pedidos
        for(int i = 0; i<tablaBodegaArr.length; i++){
            for(int j = 0; j<tablaBodegaArr[0].length; j++){
                if(tablaBodegaArr[i][j]<tablaMinimosArr[i][j]){
                    System.out.println("Se debe solicitar producto "+codigos[j]+ " en sede "+i);
                }
            }
        }

        System.out.println("\n");

        //Promedio de las cantidades en bodega
        int tablabodegaArr_Inversa [][] = new int[columnas][filas];
        for(int i = 0; i<tablabodegaArr_Inversa.length; i++){
            for(int j = 0; j<tablabodegaArr_Inversa[0].length; j++){
                tablabodegaArr_Inversa[i][j] = tablaBodegaArr[j][i];
            }
        }

        double promedio = 0;
        double suma = 0;
        int j;
        for(int i = 0; i<tablabodegaArr_Inversa.length; i++){
            promedio = 0;
            suma = 0;
            for(j = 0; j<tablabodegaArr_Inversa[0].length; j++){
                suma += tablabodegaArr_Inversa[i][j];
                
                
            }

            promedio = suma/filas;
            //System.out.println(promedio);
            System.out.println("El promedio de los productos del codigo "+codigos[i]+" es "+promedio);
        }


    }
}
