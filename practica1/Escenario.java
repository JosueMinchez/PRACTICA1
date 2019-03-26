/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica1;

// el escenario se imprimira segun el tipo de numero que tenga apartir de este el siguiente vesctor se cambiara por un texto
// 0 es vacio
// 1 es agua
// 2 es montania
// 3 es terreno
// 4 es
// 5 es
public abstract class Escenario {
    public Escenario(){
        
    }
    // vestro de tipo string que se mostrara como en la consola este es variable dependiendo del esenario que se quiera
    String[][] esena = new String[6][6];
    // de tipo entero ya que segun lo que tenga este se imprimira en la pantalla
    int [][] esenac = new int[6][6];
    abstract public void cambio_esenario();
    abstract public void ver_esenario();
    abstract public void limpiar_esenario();
    abstract public void eleccion_campo();
}   
    
