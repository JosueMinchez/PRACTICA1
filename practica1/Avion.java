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
public class Avion extends Vehiculos{
    //Constructor
    public Avion(){
        
    }
    
    /*Indican el daño que se le hace a un enemigo. Aumenta en 2 cada vez que
sube nivel.      El valor inicial es de 7*/
    @Override
    public int ataque(){
        int daño = 5 + (2 * nivel()); 
        
        return daño;
        
    }
    /*Es un porcentaje que indica cuanto daño hacen lo ataques enemigos. 100% indica que
los ataques del enemigo que golpean al jugador no le hacen daño. Aumenta en 1 cada vez que
se sube de nivel.    El valor inicial es de 7%     */
    public double defensa(){
        double escudo = 0.02 + (0.01 * nivel());
        double vida = HPJugador() - (HPJugador() * escudo);
        return vida;
        
    }
    /*Es un porcentaje que indica la probabilidad de golpear al enemigo. 100% indica que
siempre se golpeará al enemigo. Aumenta en 0.5 cada vez que se sube de nivel.      el valor inicial es de 70%*/
    public void punteriaAvion1(){
        double probabilidad= (double) (Math.random() * 100 + 1);
        double punteria = 30.5 - (nivel() * 0.5);
        if(probabilidad > punteria){
            System.out.println("HAS HECHO DAÑO: "+ ataque());
            System.out.println("VIDA DEL ENEMIGO: " + (HPEnemigo1 - ataque()));
            HPEnemigo1 = HPEnemigo1 - ataque();

        }else{
            System.out.println("||||FALLASTE EL DISPARO||||");
            System.out.println("VIDA DEL ENEMIGO: " + HPEnemigo1);
        }
        
    }
    public void punteriaAvion2(){
        double probabilidad= (double) (Math.random() * 100 + 1);
        double punteria = 30.5 - (nivel() * 0.5);
        if(probabilidad > punteria){
            System.out.println("HAS HECHO DAÑO: "+ ataque());
            System.out.println("VIDA DEL ENEMIGO: " + (HPEnemigo2 - ataque()));
            HPEnemigo2 = HPEnemigo2 - ataque();

        }else{
            System.out.println("||||FALLASTE EL DISPARO||||");
            System.out.println("VIDA DEL ENEMIGO: " + HPEnemigo2);
        }
    }
    public void punteriaAvion3(){
        double probabilidad= (double) (Math.random() * 100 + 1);
        double punteria = 30.5 - (nivel() * 0.5);
        if(probabilidad > punteria){
            System.out.println("HAS HECHO DAÑO: "+ ataque());
            System.out.println("VIDA DEL ENEMIGO: " + (HPEnemigo3 - ataque()));
            HPEnemigo3 = HPEnemigo3 - ataque();

        }else{
            System.out.println("||||FALLASTE EL DISPARO||||");
            System.out.println("VIDA DEL ENEMIGO: " + HPEnemigo3);
        }
    }
    /*Consiste en realizar un disparo con la mitad de ataque pero que golpea a todos los
enemigos del escenario. Además aumenta temporalmente la defensa en 5 puntos hasta que sea
golpeado por un ataque enemigo.*/
    public int movimientoEspecial(){
        //Golpea a todos lo enemigos con la mitad del daño normal
        int movimientoEspecial = ataque() / 2;
        return movimientoEspecial;
        
    }
    /*Determina cuantas municiones se disparan por turno, según el nivel en que se encuentre el jugador*/
    public double velocidad(){
        double municiones = nivel() * 1;
        return municiones;
    }
    
    /*Da la opción de seleccionar 3 armas basicas las cuales son:
    TORRETA, LANZA COHETES, GRANADA PEGAJOSA y asi mismo la opción de que se hará
    con ese arma que sera: ATACAR, MOVIMIENTO ESPECIAL O PERDER TURNO*/

    @Override
    public void ArmaBasica() {
                //JUGADOR USA AVIÓN
                System.out.println("|||USANDO AVION|||");
                System.out.println("¿QUE ARMA VAS A ESCOGER?");
                System.out.println("1. TORRETA\n2. LANZA COHETES\n3. GRANADAS PEGAJOSAS");
                
    }
    //Es la batalla que realiza el jugador con el vehiculo Avion hacie los enemigos
    @Override
    public void batallaJugador(){
        Scanner in = new Scanner(System.in);
        int opciones;
        int armasBasicas;
        ArmaBasica();
        armasBasicas = in.nextInt();
        switch(armasBasicas){
            case 1: 
                //JUGADOR USA TORRETA
                System.out.println("|||TORRETA|||");
                System.out.println("¿QUE DESEAS HACER?");
                System.out.println("1. ATACAR\n2. MOVIMIENTO ESPECIAL\n3. PERDER TURNO");
                opciones = in.nextInt();
                
        switch (opciones) {
            case 1:
                //JUGADOR SELECCIONA A QUIEN ATACAR
                System.out.println("¿A QUIÉN QUIERES ATACAR?");
                System.out.println("1. PRIMER ENEMIGO\n2. SEGUNDO ENEMIGO\n3. TERCER ENEMIGO");
                opciones = in.nextInt();
                switch(opciones){
                    case 1: 
                        System.out.println("|||ATACAS AL PRIMER ENEMIGO|||");
                        punteriaAvion1();
                        break;
                    case 2:
                        System.out.println("|||ATACAS AL SEGUNDO ENEMIGO|||");
                        punteriaAvion2();
                        break;
                        
                    case 3:
                        System.out.println("|||ATACAS AL TERCER ENEMIGO|||");
                        punteriaAvion3();
                        break;
                    default:
                        System.out.println("UPPS, SOLO PUEDES SELECCIONAR LA OPCION 1, 2, Y 3.");
                    
                }
                break;
            case 2:
                if(PP() >= 4){
                    //JUGADOR ATACA A TODOS LOS ENEMIGOS CON EL MOVIMIENTO ESPECIAL
                    System.out.println("LE HAS HECHO DAÑO AL PRIMER ENEMIGO: " + movimientoEspecial());
                    System.out.println("LE HAS HECHO DAÑO AL SEGUNDO ENEMIGO: " + movimientoEspecial());
                    System.out.println("LE HAS HECHO DAÑO AL TERCER ENEMIGO: " + movimientoEspecial());
                    
                }else{
                    System.out.println("No tienes suficiente PP");
                }
                break;
            case 3:
                System.out.println("Has perdido tu turno");
                break;
            default:
                System.out.println("Has seleccionado una opcion incorrecta");
                break;
        }
                
                break;
            case 2: 
                //JUGADOR USA LANZA COHETES
                System.out.println("|||LANZA COHETES|||");
                System.out.println("¿QUE DESEAS HACER?");
                System.out.println("1. ATACAR\n2. MOVIMIENTO ESPECIAL\n3. PERDER TURNO");
                opciones = in.nextInt();
                
        switch (opciones) {
            case 1:
                System.out.println("¿A QUIÉN QUIERES ATACAR?");
                System.out.println("1. PRIMER ENEMIGO\n2. SEGUNDO ENEMIGO\n3. TERCER ENEMIGO");
                opciones = in.nextInt();
                switch(opciones){
                    case 1: 
                        System.out.println("|||ATACAS AL PRIMER ENEMIGO|||");
                        punteriaAvion1();
                        break;
                    case 2:
                        System.out.println("|||ATACAS AL SEGUNDO ENEMIGO|||");
                        punteriaAvion2();
                        break;
                        
                    case 3:
                        System.out.println("|||ATACAS AL TERCER ENEMIGO|||");
                        punteriaAvion3();
                        break;
                    default:
                        System.out.println("UPPS, SOLO PUEDES SELECCIONAR LA OPCION 1, 2, Y 3.");
                    
                }
                break;
            case 2:
                if(PP() >= 4){
                    //JUGADOR ATACA A TODOS LOS ENEMIGOS CON EL MOVIMIENTO ESPECIAL
                    System.out.println("LE HAS HECHO DAÑO AL PRIMER ENEMIGO: " + movimientoEspecial());
                    System.out.println("LE HAS HECHO DAÑO AL SEGUNDO ENEMIGO: " + movimientoEspecial());
                    System.out.println("LE HAS HECHO DAÑO AL TERCER ENEMIGO: " + movimientoEspecial());
                    
                }else{
                    System.out.println("No tienes suficiente PP");
                }
                break;
            case 3:
                System.out.println("Has perdido tu turno");
                break;
            default:
                System.out.println("Has seleccionado una opcion incorrecta");
                break;
        }
                
                break;
            case 3:
                //JUGADOR USA GRANADA PEGAJOSA
                System.out.println("|||GRANADA PEGAJOSA|||");
                System.out.println("¿QUE DESEAS HACER?");
                System.out.println("1. DISPARAR GRANADA PEGAJOSA\n2. MOVIMIENTO ESPECIAL\n3. PERDER TURNO");
                opciones = in.nextInt();
                
        switch (opciones) {
            case 1:
                System.out.println("¿A QUIÉN QUIERES ATACAR?");
                System.out.println("1. PRIMER ENEMIGO\n2. SEGUNDO ENEMIGO\n3. TERCER ENEMIGO");
                opciones = in.nextInt();
                switch(opciones){
                    case 1: 
                        System.out.println("|||ATACAS AL PRIMER ENEMIGO|||");
                        punteriaAvion1();
                        break;
                    case 2:
                        System.out.println("|||ATACAS AL SEGUNDO ENEMIGO|||");
                        punteriaAvion2();
                        break;
                        
                    case 3:
                        System.out.println("|||ATACAS AL TERCER ENEMIGO|||");
                        punteriaAvion3();
                        break;
                    default:
                        System.out.println("UPPS, SOLO PUEDES SELECCIONAR LA OPCION 1, 2, Y 3.");
                    
                }
                break;
            case 2:
                if(PP() >= 4){
                    //JUGADOR ATACA A TODOS LOS ENEMIGOS CON EL MOVIMIENTO ESPECIAL
                    System.out.println("LE HAS HECHO DAÑO AL PRIMER ENEMIGO: " + movimientoEspecial());
                    System.out.println("LE HAS HECHO DAÑO AL SEGUNDO ENEMIGO: " + movimientoEspecial());
                    System.out.println("LE HAS HECHO DAÑO AL TERCER ENEMIGO: " + movimientoEspecial());
                    
                }else{
                    System.out.println("No tienes suficiente PP");
                }
                break;
            case 3:
                System.out.println("Has perdido tu turno");
                break;
            default:
                System.out.println("Has seleccionado una opcion incorrecta");
                break;
        }
                break;
            default:
                System.out.println("UPSS! Solo puede seleccionar esas tres armas básicas");
            
        }
    }
    
}
