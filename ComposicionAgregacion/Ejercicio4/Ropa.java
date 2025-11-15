/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author Doghy
 */
public class Ropa {
    private String tipo;
    private String material;
    
    public Ropa(String tipo, String material){
        this.tipo = tipo;
        this.material = material;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public String getMaterial(){
        return material;
    }
    
    public String toString(){
        return "Tipo => " + tipo + " | Mterial => " + material;
    }
}
