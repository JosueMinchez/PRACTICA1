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
public class Arma2 extends Tienda{
    //DAÑO ARMA 2
    @Override
    public int Daño() {
        int daño = 15;
        
        return daño;
    }
    //CARACTERISTICAS ARMA 2
    @Override
    public void Caracteristicas() {
        System.out.println("#CARACTERISTICAS#");
        System.out.println("NOMBRE DEL ARMA: LANZA COHETES TELEDIRIGIDO");
        System.out.println("DAÑO QUE PROVOCA: " + Daño());
        System.out.println("PROBABILIDAD DE DAÑO: 65%");
    }
    
}
