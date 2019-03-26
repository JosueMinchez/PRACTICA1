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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);  
        Vehiculos miTanque = new Tanque();
        Vehiculos miAvion = new Avion();
        Escenario miEscena1 = new Escena1();
        Escenario miEscena2 = new Escena2();
        Escenario miEscena3 = new Escena3();
        DatosEscena datos = new DatosEscena();
        CrearEscena1 crear1 = new CrearEscena1();
        CrearEscena2 crear2 = new CrearEscena2();
        Enemigos LosEnemigos = new LosEnemigos();
        ListadoVehiculos miListado = new ListadoVehiculos();
        ReporteVehiculos miMejor = new ReporteVehiculos();
        Tienda miArma1 = new Arma1();
        Tienda miArma2 = new Arma2();
        Tienda miArma3 = new Arma3();
        String tecla = null;
        String nombre;
        int vehiculo;
        int opcion;
        //Ingrese el nombre de usuario
        System.out.println("");
        System.out.println("INGRESA TU USUARIO: ");
        nombre = in.nextLine();
        do{
         // Entra al menú
        System.out.println("|||BIENVENIDO AL MENÚ DEL RPG " + nombre + "|||");
        System.out.println("1. JUGAR \n2. CREAR ESENARIO 1 \n3. CREAR ESCENARIO 2 \n4. VER ESENARIOS CREADOS \n5. TIENDA \n6. LISTADO DE VEHICULOS \n7. MEJOR VEHICULO \n8. PEOR VEHICULO \n9. REPORTE DE BATALLAS \n10. SALIR");
        opcion = in.nextInt();
        
        switch(opcion){
            case 1:
                //Opcion con que escenario se quiere jugar
                System.out.println("¿CON QUE ESCENARIO QUIERES JUGAR?");
                System.out.println("1: JUGAR CON PREDETERMINADO 1 \n2: JUGAR CON PREDETERMINADO 2 \n3: JUGAR CON PREDETERMINADO 3 \n4: JUGAR CON PRIMER ESCENARIO CREADO \n5: JUGAR CON SEGUNDO ESCENARIO CREADO \n6: TERMINAR");
                opcion = in.nextInt();
                switch(opcion){
                    case 1:
                        //Pregunta su queremos usar el Tanque o el Avión
                        while(LosEnemigos.HPJugador > 0){
                            System.out.println("ESCENARIO SELECCIONADO: ");
                            miEscena1.cambio_esenario();
                            System.out.println("\n¿QUE VEHICULO QUIERES USAR " + nombre + "?");
                            System.out.println("1. TANQUE\n2. AVION");
                            vehiculo = in.nextInt();
                    
                    switch(vehiculo){
                        case 1:
                            //Jugador usa Tanque
                            System.out.println("|||USANDO TANQUE|||");
                            System.out.println("VIDA: " + LosEnemigos.HPJugador);
                            System.out.println("PUNTOS DE PODER: " + miTanque.PP());
                            System.out.println("NIVEL: " + miTanque.nivel());
                            miEscena1.cambio_esenario();
                            miTanque.batallaJugador();
                            break;
            
                        case 2: 
                            //Jugador usa Avión
                            System.out.println("|||USANDO AVION|||");
                            System.out.println("VIDA: " + LosEnemigos.HPJugador);
                            System.out.println("PUNTOS DE PODER: " + miAvion.PP());
                            System.out.println("NIVEL: " + miAvion.nivel());
                            miEscena1.cambio_esenario();
                            miTanque.batallaJugador();

                            break;
            
                        default:
                            System.out.println("SOLO PUEDES USAR TANQUE O AVION");
                    }
                        LosEnemigos.batallaEnemigo();
        
                }
                        System.out.println("|||TE HAN MATADO, HAS PERDIDO|||");
                        break;
                    case 2:
                        while(LosEnemigos.HPJugador > 0){
                            System.out.println("ESCENARIO SELECCIONADO: ");
                            miEscena2.cambio_esenario();
                            System.out.println("\n¿QUE VEHICULO QUIERES USAR " + nombre + "?");
                            System.out.println("1. TANQUE\n2. AVION");
                            vehiculo = in.nextInt();
                    
                    switch(vehiculo){
                        case 1:
                            System.out.println("|||USANDO TANQUE|||");
                            System.out.println("VIDA: " + LosEnemigos.HPJugador);
                            System.out.println("PUNTOS DE PODER: " + miTanque.PP());
                            System.out.println("NIVEL: " + miTanque.nivel());
                            miEscena2.cambio_esenario();
                            miTanque.batallaJugador();
                            break;
            
                        case 2: 
                            System.out.println("|||USANDO AVION|||");
                            System.out.println("VIDA: " + LosEnemigos.HPJugador);
                            System.out.println("PUNTOS DE PODER: " + miAvion.PP());
                            System.out.println("NIVEL: " + miAvion.nivel());
                            miEscena2.cambio_esenario();
                            miTanque.batallaJugador();

                            break;
            
                        default:
                            System.out.println("SOLO PUEDES USAR TANQUE O AVION");
                    }
                        LosEnemigos.batallaEnemigo();
        
                }
                        System.out.println("|||TE HAN MATADO, HAS PERDIDO|||");
                        break;
                    case 3:
                        //Opcion Escenario
                        while(LosEnemigos.HPJugador > 0){
                            System.out.println("ESCENARIO SELECCIONADO: ");
                            miEscena3.cambio_esenario();
                            System.out.println("\n¿QUE VEHICULO QUIERES USAR " + nombre + "?");
                            System.out.println("1. TANQUE\n2. AVION");
                            vehiculo = in.nextInt();
                    
                    switch(vehiculo){
                        case 1:
                            //Usando Tanque
                            System.out.println("|||USANDO TANQUE|||");
                            System.out.println("VIDA: " + LosEnemigos.HPJugador);
                            System.out.println("PUNTOS DE PODER: " + miTanque.PP());
                            System.out.println("NIVEL: " + miTanque.nivel());
                            miEscena3.cambio_esenario();
                            miTanque.batallaJugador();
                            break;
            
                        case 2: 
                            //Usando Avión
                            System.out.println("|||USANDO AVION|||");
                            System.out.println("VIDA: " + LosEnemigos.HPJugador);
                            System.out.println("PUNTOS DE PODER: " + miAvion.PP());
                            System.out.println("NIVEL: " + miAvion.nivel());
                            miEscena3.cambio_esenario();
                            miTanque.batallaJugador();

                            break;
            
                        default:
                            System.out.println("SOLO PUEDES USAR TANQUE O AVION");
                    }
                        LosEnemigos.batallaEnemigo();
        
                }
                        System.out.println("|||TE HAN MATADO, HAS PERDIDO|||");
                        break;
                    case 4:
                        //Usar Tanque o Avión
                        while(LosEnemigos.HPJugador > 0){
                            System.out.println("ESCENARIO SELECCIONADO: ");
                            crear1.cambio_esenario();
                            System.out.println("\n¿QUE VEHICULO QUIERES USAR " + nombre + "?");
                            System.out.println("1. TANQUE\n2. AVION");
                            vehiculo = in.nextInt();
                    
                    switch(vehiculo){
                        case 1:
                            //USA TANQUE
                            System.out.println("|||USANDO TANQUE|||");
                            System.out.println("VIDA: " + LosEnemigos.HPJugador);
                            System.out.println("PUNTOS DE PODER: " + miTanque.PP());
                            System.out.println("NIVEL: " + miTanque.nivel());
                            crear1.cambio_esenario();
                            miTanque.batallaJugador();
                            break;
            
                        case 2: 
                            //USA AVIÓN
                            System.out.println("|||USANDO AVION|||");
                            System.out.println("VIDA: " + LosEnemigos.HPJugador);
                            System.out.println("PUNTOS DE PODER: " + miAvion.PP());
                            System.out.println("NIVEL: " + miAvion.nivel());
                            crear1.cambio_esenario();
                            miTanque.batallaJugador();

                            break;
            
                        default:
                            System.out.println("SOLO PUEDES USAR TANQUE O AVION");
                    }
                        LosEnemigos.batallaEnemigo();
        
                }
                        System.out.println("|||TE HAN MATADO, HAS PERDIDO|||");
                        break;
                    case 5:
                        while(LosEnemigos.HPJugador > 0){
                            System.out.println("ESCENARIO SELECCIONADO: ");
                            crear2.cambio_esenario();
                            System.out.println("\n¿QUE VEHICULO QUIERES USAR " + nombre + "?");
                            System.out.println("1. TANQUE\n2. AVION");
                            vehiculo = in.nextInt();
                    
                    switch(vehiculo){
                        case 1:
                            System.out.println("|||USANDO TANQUE|||");
                            System.out.println("VIDA: " + LosEnemigos.HPJugador);
                            System.out.println("PUNTOS DE PODER: " + miTanque.PP());
                            System.out.println("NIVEL: " + miTanque.nivel());
                            crear2.cambio_esenario();
                            miTanque.batallaJugador();
                            break;
            
                        case 2: 
                            System.out.println("|||USANDO AVION|||");
                            System.out.println("VIDA: " + LosEnemigos.HPJugador);
                            System.out.println("PUNTOS DE PODER: " + miAvion.PP());
                            System.out.println("NIVEL: " + miAvion.nivel());
                            crear2.cambio_esenario();
                            miTanque.batallaJugador();

                            break;
            
                        default:
                            System.out.println("SOLO PUEDES USAR TANQUE O AVION");
                    }
                        LosEnemigos.batallaEnemigo();
        
                }
                        System.out.println("|||TE HAN MATADO, HAS PERDIDO|||");
                        break;
                    default:
                        break;
                }
               break;
            case 2:
                //CREAR ESCENARIO 1
                System.out.println("|||CREAR ESENARIO 1|||");
                crear1.cambio_esenario();
                crear1.eleccion_campo();
                break;
            case 3:
                //CREAR ESCENARIO 2
                System.out.println("|||CREAR ESENARIO 2|||");
                crear2.cambio_esenario();
                crear2.eleccion_campo();
                break;
            case 4:
                //ESCENARIOS CREADOS
                System.out.println("|||ESENARIOS CREADOS|||");
                System.out.println("***ESCENARIOS PREDETERMINADOS***");
                datos.verTodo();
                System.out.println("\n***ESCENARIOS CREADOS POR EL JUGADOR***");
                crear1.cambio_esenario();
                crear2.cambio_esenario();
                break;
            case 5:
                //TIENDA DEL JUEGO
                System.out.println("|||TIENDA DEL JUEGO|||"); 
                System.out.println("***VER ARMAS DISPONIBLES PARA OBTENER***");
                System.out.println("1: PRIMER ARMA \n2: SEGUNDA ARMA \n3: TERCER ARMA");
                opcion = in.nextInt();
                switch(opcion){
                    case 1:
                        miArma1.Caracteristicas();
                        System.out.println("1: EQUIPAR \n2: SALIR");
                        opcion = in.nextInt();
                        switch(opcion){
                            case 1:
                                System.out.println("¡¡¡LO HAS EQUIPADO!!!");
                                break;
                            case 2:
                                break;
                        }
                        
                        break;
                    case 2:
                        miArma2.Caracteristicas();
                        System.out.println("1: EQUIPAR \n2: SALIR");
                        opcion = in.nextInt();
                        switch(opcion){
                            case 1:
                                System.out.println("¡¡¡LO HAS EQUIPADO!!!");
                                break;
                            case 2:
                                break;
                        }
                        break;
                    case 3:
                        miArma3.Caracteristicas();
                        System.out.println("1: EQUIPAR \n2: SALIR");
                        opcion = in.nextInt();
                        switch(opcion){
                            case 1:
                                System.out.println("¡¡¡LO HAS EQUIPADO!!!");
                                break;
                            case 2:
                                break;
                        }
                        break;
                }
                break;
            case 6:
                //LISTADO DE VEHICULOS
                System.out.println("|||LISTADO DE VEHICULOS E IDENTIFICADOR|||");
                miListado.Listado();
                break;
            case 7:
                //REPORTE DEL MEJOR VEHICULO
                System.out.println("|||REPORTE DEL MEJOR VEHICULO|||");
                miMejor.MejorVehi();
                break;
            case 8:
                //REPORTE DEL PEOR VEHICULO
                System.out.println("|||REPORTE DEL PEOR VEHICULO|||");
                miMejor.PeorVehi();
                break;
            case 9:
                System.out.println("|||REPORTE DE BATALLAS|||");
                miMejor.RepBatalla();
                break;
            case 10:
                //TERMINAR EL PROGRAMA
                System.exit(0);
                break;
            }
            //OPCION PODER SALIR AL MENU DESPUES DE QUE TERMINA CADA CASE
            System.out.print("\n¿QUIERES SEGUIR?\n***PRESIONA S PARA REGRESAR AL MENÚ***\n");
            tecla = new Scanner(System.in).nextLine();
        }while(tecla.equals("s") || tecla.equals("S"));  
        main.main (null);
    }
    
}
