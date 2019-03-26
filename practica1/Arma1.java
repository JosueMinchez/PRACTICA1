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
public class Arma1 extends Tienda{
    public Arma1(){
        
    }
    //DAÑO ARMA 1
    @Override
    public int Daño() {
        int daño = 10;
        
        return daño;
    }
    //CARACTERISTICAS ARMA 1
    @Override
    public void Caracteristicas() {
        System.out.println("#CARACTERISTICAS#");
        System.out.println("NOMBRE DEL ARMA: CAÑON");
        System.out.println("DAÑO QUE PROVOCA: " + Daño());
        System.out.println("PROBABILIDAD DE DAÑO: 50%");
    }
   
    
}
