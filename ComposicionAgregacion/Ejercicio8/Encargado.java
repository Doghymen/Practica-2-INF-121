/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8;

/**
 *
 * @author Doghy
 */
public class Encargado {
    private String nombre;
    private int edad;
    private String cargo;
    
    public Encargado(String nombre, int edad, String cargo){
        this.nombre = nombre;
        this.edad = edad;
        this.cargo = cargo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getEdad(){
        return  edad;
    }
    
    public String getCargo(){
        return cargo;
    }
}
