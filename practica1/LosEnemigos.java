/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica1;

import java.util.Scanner;

/**
 *
 * @author joshua
 */
public class LosEnemigos extends Enemigos {
    //Constructor
    public LosEnemigos(){
        
    }
    /*Determinara el arma que usara el PRIMER ENEMIGO. 
      También la probabilidad de un 55% de hacerle daño con una TORRETA o no */
    @Override
    public void batallaEnemigo() {
        int probabilidad= (int) (Math.random() * 100 + 1);
        Scanner in = new Scanner(System.in);
        int torreta = 35;
        int opcion;
        System.out.println("|||PRESIONA 1 PARA CONTINUAR CON EL JUEGO|||");
        opcion = in.nextInt();
        switch(opcion){
            case 1:
                
                if(probabilidad >torreta){  
                        System.out.println("PRIMER ENEMIGO TE HA HECHO DAÑO CON UNA TORRETA : "+ ataque());
                        System.out.println("VIDA DEL JUGADOR: " + (HPJugador - ataque()));
                        HPJugador = HPJugador - ataque();
                        
                     }else{
                        System.out.println("||||PRIMER ENEMIGO FALLO EL DISPARO||||");
                        System.out.println("VIDA DEL JUGADOR: " + HPJugador);
                    }
                if(probabilidad > torreta){
                    System.out.println("SEGUNDO ENEMIGO TE HA HECHO DAÑO CON LANZA COHETES : "+ ataque());
                    System.out.println("VIDA DEL JUGADOR: " + (HPJugador - ataque()));
                    HPJugador = HPJugador - ataque();
                }else{
                    System.out.println("||||SEGUNDO ENEMIGO FALLO EL DISPARO||||");
                    System.out.println("VIDA DEL JUGADOR: " + HPJugador);
                }
                if(probabilidad > torreta){
                    System.out.println("TERCER ENEMIGO TE HA HECHO DAÑO CON GRANADA PEGAJOSA : "+ ataque());
                    System.out.println("VIDA DEL JUGADOR: " + (HPJugador - ataque()));
                    HPJugador = HPJugador - ataque();
                }else{
                    System.out.println("||||TERCER ENEMIGO FALLO EL DISPARO||||");
                    System.out.println("VIDA DEL JUGADOR: " + HPJugador);
                }
                break;

            default:
                System.out.println("PRESIONA SOLO 1 PARA CONTINUAR CON EL JUEGO");
            
        }
    }
    
}
