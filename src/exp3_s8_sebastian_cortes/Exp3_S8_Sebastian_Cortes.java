/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exp3_s8_sebastian_cortes;
import java.lang.reflect.Array;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.Scanner;
/**
 *  Sebastian Cortés Negrete
 *  
 */

public class Exp3_S8_Sebastian_Cortes {
    
    
    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        // VARIABLES
        
        int contVentas = 0;
        boolean[] A = {false, false, false, false};
        boolean[] B = {false, false, false, false};
        boolean[] C = {false, false, false, false};
        boolean[] D = {false, false, false, false};
        boolean[][] columnas = {A, B, C, D};
        String[] L = {" - "," - ", " - ", " - "};
        
        List<Double> dctos = Arrays.asList(0.9, 0.85);
        double dcto = 0;
        boolean promo = false;
        int precioEntrada = 5000;
        
        // Variables miscelaneas
        Scanner scanner = new Scanner(System.in);
        int menu = 0; int i = 0; int cord = 0; int x = 0; int y = 0; int opcion = 0;
        //              PROGRAMA PRINCIPAL
        
        for (menu = menu; menu < 4;){
            // Menu principal
            System.out.println("Bienvenido al Teatro Moro");
            System.out.println("1.- Comprar entradas");
            System.out.println("2.- Cambiar asiento");
            System.out.println("3.- Confirmar la compra");
            System.out.println("4.- para salir");
            menu = scanner.nextInt();         
            
            
            while (1 == menu){
                System.out.println("---------GRAFICA DE ASIENTOS ---------");
                System.out.println("    Pantalla    ");
                System.out.println("  A    B    C    D  ");
                for (i = 0; i < 4; i++){
                    if (A[i] == false){L[0] = (" - ");
                    } else L[0] = (" X ");
                    if (B[i] == false){L[1] = (" - ");
                    } else L[1] = (" X ");
                    if (C[i] == false){L[2] = (" - ");
                    } else L[2] = (" X ");
                    if (D[i] == false){L[3] = (" - ");
                    } else L[3] = (" X ");
                    System.out.println(Arrays.toString(L));}
                System.out.println("Inserte columna de la entrada a comprar");
                System.out.println("1. A");
                System.out.println("2. B");
                System.out.println("3. C");
                System.out.println("4. D");
                cord = scanner.nextInt();
                cord -= 1; x = cord;
                System.out.println("Inserte hilera para su asiento, del 1 al 6 desde arriba hacia abajo");
                cord = scanner.nextInt();
                cord -= 1; y = cord;
                if (columnas[x][y] == true){System.out.println("Este asiento ya fue comprado");}else{
                columnas[x][y] = true;
                contVentas += 1;
                System.out.println("Pulse 1 para continuar comprando entradas, 0 para regresar al menu");
                menu = scanner.nextInt();}}
            while (menu == 2){
                System.out.println("Inserte la columna de la entrada a modificar");
                x = scanner.nextInt();
                System.out.println("Inserte la hilera a modificar");
                y = scanner.nextInt();
                if (columnas[x][y] == true){
                    columnas[x][y] = false; contVentas -= 1; System.out.println("Compra de entrada cancelada");
                } else {System.out.println("Esta entrada no ha sido comprada");}
                System.out.println("Pulse 1 si desea comprar una entrada, 0 si desea volver al menu principal");
                menu = scanner.nextInt();
            }
            while (menu == 3){
                System.out.println("---------GRAFICA DE ASIENTOS ---------");
                System.out.println("    Pantalla    ");
                System.out.println("  A    B    C    D  ");
                for (i = 0; i < 4; i++){
                    if (A[i] == false){L[0] = (" - ");
                    } else L[0] = (" X ");
                    if (B[i] == false){L[1] = (" - ");
                    } else L[1] = (" X ");
                    if (C[i] == false){L[2] = (" - ");
                    } else L[2] = (" X ");
                    if (D[i] == false){L[3] = (" - ");
                    } else L[3] = (" X ");
                    System.out.println(Arrays.toString(L));}

                if (promo == false){
                    System.out.println("DESCUENTOS:");
                    System.out.println("1. Descuento estudiantes = 10%");
                    System.out.println("2. Descuento adulto mayor = 15%");
                    System.out.println("3. Sin descuento");
                    opcion = scanner.nextInt(); opcion -=1;
                    if (opcion < 3){
                        dcto = dctos.get(opcion);
                        promo = true;}
                }
                if (promo == true){System.out.print("Su compra sera efectuada, ha comprado: "); System.out.println(contVentas); System.out.print("Entradas por el valor de: $"); System.out.println(contVentas*precioEntrada*dcto);}
                if (promo == false){System.out.print("Su compra sera efectuada, ha comprado: "); System.out.println(contVentas); System.out.print("Entradas por el valor de: $"); System.out.println(contVentas*precioEntrada);}
                System.out.println("Presione 1 para confirmar su compra, 2 para volver al menu principal y 3 para cancelar su compra");
                opcion = scanner.nextInt();
                if (opcion == 1){
                    System.out.println("COMPRA REALIZADA CON EXITO");
                    menu = 4;
                }
                if (opcion == 2){menu = 0;}
                if (opcion == 3){menu = 4;}
                }
        }
        
    System.out.println("Muchas gracias, esperamos volver a verle");

    }
}
    
