/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica1;

/**
 *
 * @author joshua
 */
public class Arma3 extends Tienda{
    //DAÑO ARMA 3
    @Override
    public int Daño() {
        int daño = 13;
        
        return daño;
    }
    //CARACTERISTICAS ARMA 3
    @Override
    public void Caracteristicas() {
        System.out.println("#CARACTERISTICAS#");
        System.out.println("NOMBRE DEL ARMA: LANZA GRANADAS");
        System.out.println("DAÑO QUE PROVOCA: " + Daño());
        System.out.println("PROBABILIDAD DE DAÑO: 60%");
    }
    
}
