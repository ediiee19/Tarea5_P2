/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea5_p2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author caste
 */
public class Tarea5_P2 {

    public static ArrayList inventario = new ArrayList();

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean menu = true;
        while (menu) {
            System.out.println("---Menu---");
            System.out.println("1. Agregar\n"
                    + "2. Modificar Prodcuto\n"
                    + "3. Eliminar producto\n"
                    + "4. Simulacion de Facturacion\n"
                    + "5. Reporte\n"
                    + "6. Salir");
            int opcMenu = entrada.nextInt();
            switch (opcMenu) {
                case 6: {
                    System.out.println("Saliendo del programa");
                    menu = false;
                    break;
                }
                case 1: {

                    break;
                }
            }
        }//fin while
    }//fin main

    public static void agregar() {
        Scanner entrada = new Scanner(System.in);
        Scanner lea = new Scanner(System.in);
        boolean menuAgregar = true;
        while (menuAgregar) {
            System.out.println("Que desea agregar?\n"
                    + "1- Granos Basicos\n"
                    + "2- Productos de Limpieza\n"
                    + "3- Liquidos\n"
                    + "4- Carnes o Embutidos\n"
                    + "5- Frutas o verduras\n"
                    + "presione [6] para salir");
            int opc = entrada.nextInt();
            switch (opc) {
                case 6: {
                    System.out.println("Saliendo...");
                    menuAgregar = false;
                    break;
                }
                case 1: {
                    System.out.println("Ingrese el producto: ");
                    String nombre = lea.nextLine();
                    System.out.println("Ingrese cantidad de quintales");
                    int cant = entrada.nextInt();
                    System.out.println("Ingrese unidad de medida(lb, kg)");
                    String unidad = lea.nextLine();
                    System.out.println("Ingrese el precio:");
                    double precio = entrada.nextDouble();
                    System.out.println("Ingrese lugar de provenencia: ");
                    String lugar = lea.nextLine();
                    inventario.add((GranosBasicos) new GranosBasicos(nombre, cant, precio, unidad, lugar));
                    break;
                }
                case 2: {
                    System.out.println("Ingrese el tipo del producto: ");
                    String nombre = lea.nextLine();
                    System.out.println("Ingrese tipo de producto: ");
                    String tipo = lea.nextLine();
                    inventario.add((ProductosDeLimpieza) new ProductosDeLimpieza(crearCode()));
                    System.out.println("size del producto(pequeño, mediano, grande): ");
                    String size = lea.nextLine();
                    System.out.println("Ingrese proveedor: ");
                    String proveedor = lea.nextLine();
                    inventario.add((ProductosDeLimpieza) new ProductosDeLimpieza(tipo, size, proveedor, nombre));
                    break;
                }
                case 3:{
                    System.out.println("Ingrese categoria(lácteos, gaseosas, jugos, agua):");
                    inventario.add((Liquidos) new Liquidos(categoria, empaaquetado, size, nombre, opc));
                    break;
                }
            }
        }
    }//fin de agregar

    public static String crearCode() {
        boolean creandoCode = true;
        String code ="";
        while (creandoCode) {
            code = codeAleatorio();
            int busc = 0;
            for (Object t : inventario) {
                if (t.equals(t)) {
                    busc++;
                }
            }
            if (busc == 0) {
                creandoCode = false;
                break;
            }
        }
        return code;
    }

    public static String codeAleatorio() {
        Random r = new Random();
        String code = "";
        for (int i = 0; i < 8; i++) {
            int opc = r.nextInt(2);
            if (opc == 0) {
                int letraRandom = r.nextInt(26);
                char letra = (char) (97 + letraRandom);
                code += letra;
            } else {
                int letraRandom = r.nextInt(10);
                char num = (char) (48 + letraRandom);
                code += num;
            }
        }
        return code;
    }
}//fin
