/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Terreno;

/**
 *
 * @author UTPL
 */
public class Terreno {
    public double costo_terreno;
    public double ancho;
    public double largo;
    public double area;
    public double valorMetro;

    public double getCosto_terreno() {
        return costo_terreno;
    }

    public void setCosto_terreno(double costo_terreno) {
        this.costo_terreno = costo_terreno;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getValorMetro() {
        return valorMetro;
    }

    public void setValorMetro(double valorMetro) {
        this.valorMetro = valorMetro;
    }

    
    
    public double Area(){
        area = ancho * largo;
        return area;
    }
   
    public double costo(){
        costo_terreno = valorMetro * area;
        return costo_terreno;
    }
    
    
}
