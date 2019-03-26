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
public abstract class Vehiculos {
    int HPEnemigo1 = HPEnemigos1();
    int HPEnemigo2 = HPEnemigos2();
    int HPEnemigo3 = HPEnemigos3();
    int HPJugador = HPJugador();
    //Constructor
    public Vehiculos(){
        super();

    }  
    /*Usamos abstraccion porque existe la herencia multiple en ArmaBasica
      con la clase Tanque y la clase Avion*/
    public abstract void ArmaBasica();
    public abstract void batallaJugador();
    
    /*Indican el daño que se le hace a un enemigo. Aumenta en 2 cada vez que
     sube nivel.      El valor inicial es de 10 */
    public int ataque(){
        int daño = 8 + (2 * nivel()); 
        
        return daño;
        
    }
    
    /*Muestra los puntos de vida (HP) en pantalla según el nivel en que se encuentra*/
    public int HPJugador(){

        int nivel = nivel();
        if(nivel >= 1){
            return HPJugador = nivel * 100;
            
        }
        return HPJugador;      
    }
    /*Muestra los puntos de poder (PP) en pantalla según el nivel en que se encuentra*/
    public int PP(){
        int nivel = nivel();
        int PP = 3;
        if(nivel >= 1){
            return PP = PP + (2 * nivel);
            
        }
            return PP;
        
        
    }
    /*Determina el nivel según la experiencia (XP) que se tiene*/
    public int nivel(){
        int nivel;
        int XP =XP();
        if(XP >= 0 && XP < 100){
            return nivel = 1;
        }else if(XP >= 100 && XP < 200){
          return nivel = 2;  
        }else if(XP >= 200 && XP < 350){
            return nivel = 3;
        } else if(XP >= 350 && XP < 500){
            return nivel = 4;
        }else if(XP >= 500 && XP < 750){
            return nivel = 5;
        }else if(XP >= 750 && XP < 900){
            return nivel = 6;
        }else if(XP >= 900 && XP < 1050){
            return nivel = 7;
        }else{
        return 0;
        }
    }   
    /*Se determina la experiencia que se obtiene al momento de ganar 
      una partida, en este caso por partida ganada obtenemos 100 de experiencia*/
    public int XP(){
        int partidaGanada = 100;
        int XP = 0;
        
        XP = XP + partidaGanada;
        return XP;
        
    }
    public int HPEnemigos1() {
        int nivel = nivel();
        if(nivel >= 1){
            return HPEnemigo1 = nivel * 50;
            
        }else{
        
        return HPEnemigo1;
        }
    }
    public int HPEnemigos2() {
        int nivel = nivel();
        if(nivel >= 1){
            return HPEnemigo2 = nivel * 50;
            
        }else{
        
        return HPEnemigo2;
        }
    }
    public int HPEnemigos3() {
        int nivel = nivel();
        if(nivel >= 1){
            return HPEnemigo3 = nivel * 50;
            
        }else{
        
        return HPEnemigo3;
        }
    }
    
}
