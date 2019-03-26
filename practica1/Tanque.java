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
public class Tanque extends Vehiculos {
    //Constructor
    public Tanque(){
        
    }
    /*Es un porcentaje que indica cuanto daño hacen lo ataques enemigos. 100% indica que
los ataques del enemigo que golpean al jugador no le hacen daño. Aumenta en 1 cada vez que
se sube de nivel.    el valor inicial es de 6%     */
    public double defensa(){
        double escudo = 0.05 + (0.01 * nivel());
        double vida = HPJugador() - (HPJugador() * escudo);
        return vida;
        
    }
    /*Es un porcentaje que indica la probabilidad de golpear al enemigo. 100% indica que
siempre se golpeará al enemigo. Aumenta en 0.5 cada vez que se sube de nivel.      el valor inicial es de 60%*/
    
    public void punteriaTanque1(){
       double probabilidad= (double) (Math.random() * 100 + 1);
        double punteria = 40.5 - (nivel() * 0.5);
        if(probabilidad > punteria && HPEnemigo1 > 0){
            System.out.println("HAS HECHO DAÑO: "+ ataque());
            System.out.println("VIDA DEL ENEMIGO: " + (HPEnemigo1 - ataque()));
            HPEnemigo1 = HPEnemigo1 - ataque();
        }else{
            System.out.println("||||FALLASTE EL DISPARO O EL PRIMER ENEMIGO YA NO TIENE VIDA Y LO HAS ELIMINADO||||");
            System.out.println("VIDA DEL ENEMIGO: " + HPEnemigo1);
        }
    }
    
    public void punteriaTanque2(){
       double probabilidad= (double) (Math.random() * 100 + 1);
        double punteria = 40.5 - (nivel() * 0.5);
        if(probabilidad > punteria && HPEnemigo2 > 0){
            System.out.println("HAS HECHO DAÑO: "+ ataque());
            System.out.println("VIDA DEL ENEMIGO: " + (HPEnemigo2 - ataque()));
            HPEnemigo2 = HPEnemigo2 - ataque();

        }else{
            System.out.println("||||FALLASTE EL DISPARO O EL SEGUNDO ENEMIGO YA NO TIENE VIDA Y LO HAS ELIMINADO||||");
            System.out.println("VIDA DEL ENEMIGO: " + HPEnemigo2);
             }

        
    }
    public void punteriaTanque3(){
       double probabilidad= (double) (Math.random() * 100 + 1);
        double punteria = 40.5 - (nivel() * 0.5);
        if(probabilidad > punteria && HPEnemigo3 > 0){
            System.out.println("HAS HECHO DAÑO: "+ ataque());
            System.out.println("VIDA DEL ENEMIGO: " + (HPEnemigo3 - ataque()));
            HPEnemigo3 = HPEnemigo3 - ataque();

        }else{
            System.out.println("||||FALLASTE EL DISPARO O EL TERCER ENEMIGO YA NO TIENE VIDA Y LO HAS ELIMINADO||||");
            System.out.println("VIDA DEL ENEMIGO: " + HPEnemigo3);
             }        
    }
    
    
    /*Consiste en realizar un disparo con el doble de ataque sin que las secciones del
escenario reduzcan su ataque.*/
    public int movimientoEspecial(){
        int movimientoEspecial = ataque() * 2;
        return movimientoEspecial;
        
    }
    
    /*Da la opción de seleccionar 3 armas basicas las cuales son:
    TORRETA, LANZA COHETES, GRANADA PEGAJOSA y asi mismo la opción de que se hará
    con ese arma que sera: ATACAR, MOVIMIENTO ESPECIAL O PERDER TURNO*/
    @Override
    public void ArmaBasica() {
                //JUGADOR USA TANQUE
                System.out.println("\n¿QUE ARMA VAS A ESCOGER?");
                System.out.println("1. TORRETA\n2. LANZA COHETES\n3. GRANADAS PEGAJOSAS\n|||ARMA 4, 5 Y 6 ESTAN DISPONIBLES COMPRANDOLAS EN LA TIENDA|||\n4. CAÑON\n5. LANZA COHETES TELEDIRIGIDO\n6. LANZA GRANADA");

    
    }
    //Es la batalla que realiza el jugador con el vehiculo tanque hacie los enemigos
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
                System.out.println("1. ATACAR\n2. MOVIMIENTO ESPECIAL\n3. RENDIRSE");
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
                        punteriaTanque1();

                        break;
                    case 2:
                        System.out.println("|||ATACAS AL SEGUNDO ENEMIGO|||");
                        punteriaTanque2();
                        break;
                        
                    case 3:
                        System.out.println("|||ATACAS AL TERCER ENEMIGO|||");
                        punteriaTanque3();
                        break;
                    default:
                        System.out.println("UPPS, SOLO PUEDES SELECCIONAR LA OPCION 1, 2, Y 3.");
                        break;
                    }
                break;
            case 2:
                if(PP() >= 4){
                    //JUGADOR SELECCIONA A QUIEN ATACAR CON MOVIMIENTO ESPECIAL
                    System.out.println("¿A QUIEN QUIERES ATACAR?");
                    System.out.println("1. PRIMER ENEMIGO\n2. SEGUNDO ENEMIGO\n3. TERCER ENEMIGO");
                    opciones = in.nextInt();
                    switch(opciones){
                        case 1: 
                            if(HPEnemigo1 > 0){
                            System.out.println("LE HAS HECHO DAÑO AL PRIMER ENEMIGO: " + movimientoEspecial());
                            System.out.println("VIDA DEL ENEMIGO: " + (HPEnemigo1 - movimientoEspecial()));
                            HPEnemigo1 = HPEnemigo1 - movimientoEspecial();
                            }else{
                                System.out.println("|*****|HAS ELIMINADO AL PRIMER ENEMIGO|*****|");
                            }
                            break;
                        case 2:
                            if(HPEnemigo2 > 0){
                            System.out.println("LE HAS HECHO DAÑO AL SEGUNDO ENEMIGO: " + movimientoEspecial());
                            System.out.println("VIDA DEL ENEMIGO: " + (HPEnemigo2 - movimientoEspecial()));
                            HPEnemigo2 = HPEnemigo2 - movimientoEspecial();
                            }else{
                                System.out.println("|*****|HAS ELIMINADO AL SEGUNDO ENEMIGO|*****|");
                            }
                            break;
                        case 3:
                            if(HPEnemigo3 > 0){
                           System.out.println("LE HAS HECHO DAÑO AL TERCER ENEMIGO: " + movimientoEspecial());
                           System.out.println("VIDA DEL ENEMIGO: " + (HPEnemigo3 - movimientoEspecial()));
                           HPEnemigo3 = HPEnemigo3 - movimientoEspecial();
                            }else{
                                System.out.println("|*****|HAS ELIMINADO AL TERCER ENEMIGO|*****|");
                            }
                           break;
                        default:
                            System.out.println("UPSS, SOLO PUEDES SELECCIONAR LA OPCION 1, 2 , 3");
                            break;
                            }
               
                        }else{
                            System.out.println("No tienes suficiente PP");
                    }
                break;
            case 3:
                System.out.println("|||***TE HAS RENDIDO***|||");
                main.main (null);
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
                System.out.println("1. ATACAR\n2. MOVIMIENTO ESPECIAL\n3. RENDIRSE");
                opciones = in.nextInt();
                switch(opciones){
                    case 1:
                        //JUGADOR SELECCIONA A QUIEN ATACAR
                        System.out.println("¿A QUIÉN QUIERES ATACAR?");
                        System.out.println("1. PRIMER ENEMIGO\n2. SEGUNDO ENEMIGO\n3. TERCER ENEMIGO");
                        opciones = in.nextInt();
                        switch(opciones){
                            case 1: 
                        System.out.println("|||ATACAS AL PRIMER ENEMIGO|||");
                        punteriaTanque1();
                        break;
                    case 2:
                        System.out.println("|||ATACAS AL SEGUNDO ENEMIGO|||");
                        punteriaTanque2();
                        break;
                        
                    case 3:
                        System.out.println("|||ATACAS AL TERCER ENEMIGO|||");
                        punteriaTanque3();
                        break;
                    default:
                        System.out.println("UPPS, SOLO PUEDES SELECCIONAR LA OPCION 1, 2, Y 3.");
                        break;
                        }
                        break;
                    case 2:
                         if(PP() >= 4){
                    //JUGADOR SELECCIONA A QUIEN ATACAR CON MOVIMIENTO ESPECIAL
                    System.out.println("¿A QUIEN QUIERES ATACAR?");
                    System.out.println("1. PRIMER ENEMIGO\n2. SEGUNDO ENEMIGO\n3. TERCER ENEMIGO");
                    opciones = in.nextInt();
                    switch(opciones){
                        case 1: 
                            if(HPEnemigo1 > 0){
                            System.out.println("LE HAS HECHO DAÑO AL PRIMER ENEMIGO: " + movimientoEspecial());
                            System.out.println("VIDA DEL ENEMIGO: " + (HPEnemigo1 - movimientoEspecial()));
                            HPEnemigo1 = HPEnemigo1 - movimientoEspecial();
                            }else{
                                System.out.println("|*****|HAS ELIMINADO AL PRIMER ENEMIGO|*****|");
                            }
                            break;
                        case 2:
                            if(HPEnemigo1 > 0){
                            System.out.println("LE HAS HECHO DAÑO AL SEGUNDO ENEMIGO: " + movimientoEspecial());
                            System.out.println("VIDA DEL ENEMIGO: " + (HPEnemigo2 - movimientoEspecial()));
                            HPEnemigo2 = HPEnemigo2 - movimientoEspecial();
                            }else{
                                System.out.println("|*****|HAS ELIMINADO AL SEGUNDO ENEMIGO|*****|");
                            }
                            break;
                        case 3:
                            if(HPEnemigo1 > 0){
                           System.out.println("LE HAS HECHO DAÑO AL TERCER ENEMIGO: " + movimientoEspecial());
                           System.out.println("VIDA DEL ENEMIGO: " + (HPEnemigo3 - movimientoEspecial()));
                           HPEnemigo3 = HPEnemigo3 - movimientoEspecial();
                            }else{
                                System.out.println("|*****|HAS ELIMINADO AL TERCER ENEMIGO|*****|");
                            }
                           break;
                        default:
                            System.out.println("UPSS, SOLO PUEDES SELECCIONAR LA OPCION 1, 2 , 3");
                            break;
                         }
               
                        }else{
                            System.out.println("No tienes suficiente PP");
                    }
                        break;
                         case 3:
                            System.out.println("|||***TE HAS RENDIDO***|||");
                            main.main (null);
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
                        System.out.println("1. ATACAR\n2. MOVIMIENTO ESPECIAL\n3. RENDIRSE");
                        opciones = in.nextInt(); 
                        switch(opciones){
                            case 1:
                                //JUGADOR SELECCIONA A QUIEN ATACAR
                        System.out.println("¿A QUIÉN QUIERES ATACAR?");
                        System.out.println("1. PRIMER ENEMIGO\n2. SEGUNDO ENEMIGO\n3. TERCER ENEMIGO");
                        opciones = in.nextInt();
                        switch(opciones){
                            case 1: 
                        System.out.println("|||ATACAS AL PRIMER ENEMIGO|||");
                        punteriaTanque1();
                        break;
                    case 2:
                        System.out.println("|||ATACAS AL SEGUNDO ENEMIGO|||");
                        punteriaTanque2();
                        break;
                        
                    case 3:
                        System.out.println("|||ATACAS AL TERCER ENEMIGO|||");
                        punteriaTanque3();
                        break;
                    default:
                        System.out.println("UPPS, SOLO PUEDES SELECCIONAR LA OPCION 1, 2, Y 3.");
                        break;
                        }
                        break;
                    case 2:
                        if(PP() >= 4){
                            //JUGADOR SELECCIONA A QUIEN ATACAR CON MOVIMIENTO ESPECIAL
                            System.out.println("¿A QUIEN QUIERES ATACAR?");
                            System.out.println("1. PRIMER ENEMIGO\n2. SEGUNDO ENEMIGO\n3. TERCER ENEMIGO");
                            opciones = in.nextInt();
                            switch(opciones){
                                case 1: 
                                    if(HPEnemigo1 > 0){
                                    System.out.println("LE HAS HECHO DAÑO AL PRIMER ENEMIGO: " + movimientoEspecial());
                                    System.out.println("VIDA DEL ENEMIGO: " + (HPEnemigo1 - movimientoEspecial()));
                                    HPEnemigo1 = HPEnemigo1 - movimientoEspecial();
                                    }else{
                                        System.out.println("|*****|HAS ELIMINADO AL PRIMER ENEMIGO|*****|");
                                    }
                                    break;
                                case 2:
                                    if(HPEnemigo1 > 0){
                                    System.out.println("LE HAS HECHO DAÑO AL SEGUNDO ENEMIGO: " + movimientoEspecial());
                                    System.out.println("VIDA DEL ENEMIGO: " + (HPEnemigo2 - movimientoEspecial()));
                                    HPEnemigo2 = HPEnemigo2 - movimientoEspecial();
                                    }else{
                                        System.out.println("|*****|HAS ELIMINADO AL SEGUNDO ENEMIGO|*****|");
                                    }
                                    break;
                                case 3:
                                    if(HPEnemigo1 > 0){
                                    System.out.println("LE HAS HECHO DAÑO AL TERCER ENEMIGO: " + movimientoEspecial());
                                    System.out.println("VIDA DEL ENEMIGO: " + (HPEnemigo3 - movimientoEspecial()));
                                    HPEnemigo3 = HPEnemigo3 - movimientoEspecial();
                                    }else{
                                        System.out.println("|*****|HAS ELIMINADO AL TERCER ENEMIGO|*****|");
                                    }
                                    break;
                                default:
                                    System.out.println("UPSS, SOLO PUEDES SELECCIONAR LA OPCION 1, 2 , 3");
                                    break;
                                }
               
                        }else{
                                System.out.println("No tienes suficiente PP");
                            }
                                break;
                                case 3:
                                    System.out.println("|||***TE HAS RENDIDO***|||");
                                    main.main (null);
                                    break;
                                default:
                                     System.out.println("Has seleccionado una opcion incorrecta");
                                     break;
                                     }
                        break;  
                    case 4:
                        //JUGADOR USA CAÑON
                        System.out.println("|||CAÑON|||");
                        System.out.println("¿QUE DESEAS HACER?");
                        System.out.println("1. ATACAR\n2. MOVIMIENTO ESPECIAL\n3. RENDIRSE");
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
                                        punteriaTanque1();

                                        break;
                                    case 2:
                                    System.out.println("|||ATACAS AL SEGUNDO ENEMIGO|||");
                        punteriaTanque2();
                        break;
                        
                    case 3:
                        System.out.println("|||ATACAS AL TERCER ENEMIGO|||");
                        punteriaTanque3();
                        break;
                    default:
                        System.out.println("UPPS, SOLO PUEDES SELECCIONAR LA OPCION 1, 2, Y 3.");
                        break;
                    }
                break;
            case 2:
                if(PP() >= 4){
                    //JUGADOR SELECCIONA A QUIEN ATACAR CON MOVIMIENTO ESPECIAL
                    System.out.println("¿A QUIEN QUIERES ATACAR?");
                    System.out.println("1. PRIMER ENEMIGO\n2. SEGUNDO ENEMIGO\n3. TERCER ENEMIGO");
                    opciones = in.nextInt();
                    switch(opciones){
                        case 1: 
                            if(HPEnemigo1 > 0){
                            System.out.println("LE HAS HECHO DAÑO AL PRIMER ENEMIGO: " + movimientoEspecial());
                            System.out.println("VIDA DEL ENEMIGO: " + (HPEnemigo1 - movimientoEspecial()));
                            HPEnemigo1 = HPEnemigo1 - movimientoEspecial();
                            }else{
                                System.out.println("|*****|HAS ELIMINADO AL PRIMER ENEMIGO|*****|");
                            }
                            break;
                        case 2:
                            if(HPEnemigo2 > 0){
                            System.out.println("LE HAS HECHO DAÑO AL SEGUNDO ENEMIGO: " + movimientoEspecial());
                            System.out.println("VIDA DEL ENEMIGO: " + (HPEnemigo2 - movimientoEspecial()));
                            HPEnemigo2 = HPEnemigo2 - movimientoEspecial();
                            }else{
                                System.out.println("|*****|HAS ELIMINADO AL SEGUNDO ENEMIGO|*****|");
                            }
                            break;
                        case 3:
                            if(HPEnemigo3 > 0){
                           System.out.println("LE HAS HECHO DAÑO AL TERCER ENEMIGO: " + movimientoEspecial());
                           System.out.println("VIDA DEL ENEMIGO: " + (HPEnemigo3 - movimientoEspecial()));
                           HPEnemigo3 = HPEnemigo3 - movimientoEspecial();
                            }else{
                                System.out.println("|*****|HAS ELIMINADO AL TERCER ENEMIGO|*****|");
                            }
                           break;
                        default:
                            System.out.println("UPSS, SOLO PUEDES SELECCIONAR LA OPCION 1, 2 , 3");
                            break;
                            }
               
                        }else{
                            System.out.println("No tienes suficiente PP");
                    }
                break;
            case 3:
                System.out.println("|||***TE HAS RENDIDO***|||");
                main.main (null);
                break;
            default:
                System.out.println("Has seleccionado una opcion incorrecta");
                break;
                }
                        break;
                    case 5:
                         //JUGADOR USA LANZA COHETES TELEDIRIGIDO
                System.out.println("|||LANZA COHETES TELEDIRIGIDO|||");
                System.out.println("¿QUE DESEAS HACER?");
                System.out.println("1. ATACAR\n2. MOVIMIENTO ESPECIAL\n3. RENDIRSE");
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
                        punteriaTanque1();

                        break;
                    case 2:
                        System.out.println("|||ATACAS AL SEGUNDO ENEMIGO|||");
                        punteriaTanque2();
                        break;
                        
                    case 3:
                        System.out.println("|||ATACAS AL TERCER ENEMIGO|||");
                        punteriaTanque3();
                        break;
                    default:
                        System.out.println("UPPS, SOLO PUEDES SELECCIONAR LA OPCION 1, 2, Y 3.");
                        break;
                    }
                break;
            case 2:
                if(PP() >= 4){
                    //JUGADOR SELECCIONA A QUIEN ATACAR CON MOVIMIENTO ESPECIAL
                    System.out.println("¿A QUIEN QUIERES ATACAR?");
                    System.out.println("1. PRIMER ENEMIGO\n2. SEGUNDO ENEMIGO\n3. TERCER ENEMIGO");
                    opciones = in.nextInt();
                    switch(opciones){
                        case 1: 
                            if(HPEnemigo1 > 0){
                            System.out.println("LE HAS HECHO DAÑO AL PRIMER ENEMIGO: " + movimientoEspecial());
                            System.out.println("VIDA DEL ENEMIGO: " + (HPEnemigo1 - movimientoEspecial()));
                            HPEnemigo1 = HPEnemigo1 - movimientoEspecial();
                            }else{
                                System.out.println("|*****|HAS ELIMINADO AL PRIMER ENEMIGO|*****|");
                            }
                            break;
                        case 2:
                            if(HPEnemigo2 > 0){
                            System.out.println("LE HAS HECHO DAÑO AL SEGUNDO ENEMIGO: " + movimientoEspecial());
                            System.out.println("VIDA DEL ENEMIGO: " + (HPEnemigo2 - movimientoEspecial()));
                            HPEnemigo2 = HPEnemigo2 - movimientoEspecial();
                            }else{
                                System.out.println("|*****|HAS ELIMINADO AL SEGUNDO ENEMIGO|*****|");
                            }
                            break;
                        case 3:
                            if(HPEnemigo3 > 0){
                           System.out.println("LE HAS HECHO DAÑO AL TERCER ENEMIGO: " + movimientoEspecial());
                           System.out.println("VIDA DEL ENEMIGO: " + (HPEnemigo3 - movimientoEspecial()));
                           HPEnemigo3 = HPEnemigo3 - movimientoEspecial();
                            }else{
                                System.out.println("|*****|HAS ELIMINADO AL TERCER ENEMIGO|*****|");
                            }
                           break;
                        default:
                            System.out.println("UPSS, SOLO PUEDES SELECCIONAR LA OPCION 1, 2 , 3");
                            break;
                            }
               
                        }else{
                            System.out.println("No tienes suficiente PP");
                    }
                break;
            case 3:
                System.out.println("|||***TE HAS RENDIDO***|||");
                main.main (null);
                break;
            default:
                System.out.println("Has seleccionado una opcion incorrecta");
                break;
                }
                        break;
                    case 6: 
                         //JUGADOR USA LANZA GRANADA
                System.out.println("|||LANZA GRANADA|||");
                System.out.println("¿QUE DESEAS HACER?");
                System.out.println("1. ATACAR\n2. MOVIMIENTO ESPECIAL\n3. RENDIRSE");
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
                        punteriaTanque1();

                        break;
                    case 2:
                        System.out.println("|||ATACAS AL SEGUNDO ENEMIGO|||");
                        punteriaTanque2();
                        break;
                        
                    case 3:
                        System.out.println("|||ATACAS AL TERCER ENEMIGO|||");
                        punteriaTanque3();
                        break;
                    default:
                        System.out.println("UPPS, SOLO PUEDES SELECCIONAR LA OPCION 1, 2, Y 3.");
                        break;
                    }
                break;
            case 2:
                if(PP() >= 4){
                    //JUGADOR SELECCIONA A QUIEN ATACAR CON MOVIMIENTO ESPECIAL
                    System.out.println("¿A QUIEN QUIERES ATACAR?");
                    System.out.println("1. PRIMER ENEMIGO\n2. SEGUNDO ENEMIGO\n3. TERCER ENEMIGO");
                    opciones = in.nextInt();
                    switch(opciones){
                        case 1: 
                            if(HPEnemigo1 > 0){
                            System.out.println("LE HAS HECHO DAÑO AL PRIMER ENEMIGO: " + movimientoEspecial());
                            System.out.println("VIDA DEL ENEMIGO: " + (HPEnemigo1 - movimientoEspecial()));
                            HPEnemigo1 = HPEnemigo1 - movimientoEspecial();
                            }else{
                                System.out.println("|*****|HAS ELIMINADO AL PRIMER ENEMIGO|*****|");
                            }
                            break;
                        case 2:
                            if(HPEnemigo2 > 0){
                            System.out.println("LE HAS HECHO DAÑO AL SEGUNDO ENEMIGO: " + movimientoEspecial());
                            System.out.println("VIDA DEL ENEMIGO: " + (HPEnemigo2 - movimientoEspecial()));
                            HPEnemigo2 = HPEnemigo2 - movimientoEspecial();
                            }else{
                                System.out.println("|*****|HAS ELIMINADO AL SEGUNDO ENEMIGO|*****|");
                            }
                            break;
                        case 3:
                            if(HPEnemigo3 > 0){
                           System.out.println("LE HAS HECHO DAÑO AL TERCER ENEMIGO: " + movimientoEspecial());
                           System.out.println("VIDA DEL ENEMIGO: " + (HPEnemigo3 - movimientoEspecial()));
                           HPEnemigo3 = HPEnemigo3 - movimientoEspecial();
                            }else{
                                System.out.println("|*****|HAS ELIMINADO AL TERCER ENEMIGO|*****|");
                            }
                           break;
                        default:
                            System.out.println("UPSS, SOLO PUEDES SELECCIONAR LA OPCION 1, 2 , 3");
                            break;
                            }
               
                        }else{
                            System.out.println("No tienes suficiente PP");
                    }
                break;
            case 3:
                System.out.println("|||***TE HAS RENDIDO***|||");
                main.main (null);
                break;
            default:
                System.out.println("Has seleccionado una opcion incorrecta");
                break;
                }
                        break;
        }
                
    }
    
}
