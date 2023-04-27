/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package problema1;

import java.util.Locale;
import java.util.Scanner;
import Terreno.Terreno;

/**
 *
 * @author UTPL
 */
public class Problema1 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        Terreno t = new Terreno();
        
        System.out.println("Ingrese el ancho del terreno:");
        double ancho = entrada.nextDouble();
        System.out.println("Ingrese el largo del terreno:");
        double largo = entrada.nextDouble();
        System.out.println("Ingrese el valor del metro cuadrado");
        double valorMetro = entrada.nextDouble();
        
        t.setAncho(ancho);
        t.setLargo(largo);
        t.setValorMetro(valorMetro);
        
        System.out.println("-----COSTO TOTA------");
        System.out.println("El ancho del terreno: "+ t.getAncho());
        System.out.println("El largo del terreno: "+ t.getLargo());
        System.out.println("Valor del Metro Cuadrado: "+ t.getCosto_terreno());
        System.out.println("Valor del area: "+ t.Area());
        System.out.println("El costo del terreno es: "+ t.costo());
        
        
    }
}
