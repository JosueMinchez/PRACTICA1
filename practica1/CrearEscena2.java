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
public class CrearEscena2 extends Escenario{
    Scanner ss = new Scanner(System.in);
    DatosEscena enviar=new DatosEscena();
    int [][] esena0 = new int[6][6];
    CrearEscena2 [] guarda = new CrearEscena2[6];
    //DISEÑO DEL ESCENARIO QUE PODEMOS CREAR
    private int CrearEscena2[][] =
            {
                    {3, 3, 3, 3, 3, 3,},
                    {3, 3, 3, 3, 3, 3,},
                    {3, 3, 3, 3, 3, 3,},
                    {3, 3, 3, 3, 3, 3,},
                    {3, 3, 3, 3, 3, 3,},
                    {3, 3, 3, 3, 3, 3,}
            };

    public CrearEscena2(){
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                esenac[i][j] = CrearEscena2[i][j];
            }
        }
    }
     //CON ESTO PODEMOS COLOCAR EN NUESTRO ESCENARIO AGUA, MONTAÑA, VEHICULOS Y ENEMIGOS
    @Override
    public void cambio_esenario() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                switch (esenac[i][j]) {
                    case 0:
                        // vacio
                        esena[i][j] = "\033[37m████▉";
                        break;
                    case 1:
                        // agua
                        esena[i][j] = "\033[34m████▉";
                        break;
                    case 2:
                        // montanya
                        esena[i][j] = "\033[31m████▉";
                        break;
                    case 3:
                        //terreno
                        esena[i][j] = "\033[32m████▉";
                        break;
                    case 4:
                        //PRIMER ENEMIGO
                        esena[i][j] = "\033[32m██" + "\033[30m"+("1")+ "\033[32m█▉";
                        break;
                    case 5:
                        //SEGUNDO ENEMIGO
                        esena[i][j] = "\033[32m██" + "\033[30m"+("2")+ "\033[32m█▉";
                        break;
                    case 6:
                        //TERCER ENEMIGO
                        esena[i][j] = "\033[32m██" + "\033[30m"+("3")+ "\033[32m█▉";
                        break;
                    case 7:
                         //TANQUE
                        esena[i][j] = "\033[32m██" + "\033[30mT" + "\033[32m█▉";
                        break;
                    case 8:
                        //AVION
                        esena[i][j] = "\033[32m██" + "\033[30mA" + "\033[32m█▉";
                        break;
                    default:
                }
            }
        }
        ver_esenario();
    }
    //NOS DEJA VER EL ESCENARIO CREADO
    @Override
    public void ver_esenario() {
        // numero de filas
        for (int i = 0; i < 6; i++) {
            System.out.print("\033[30m    "+(i+1));
        }
        //nuero de columnas casillas
        for (int i = 0; i < 6; i++) {
            System.out.println("");
            System.out.print("\033[30m"+(i+1)+" ");
            //casilla por casilla
            for (int j = 0; j < 6; j++) {

                System.out.print(esena[i][j]);
            }
            System.out.print(" \033[30m"+(i+1)+" ");
        }
        System.out.println("");
        for (int i = 0; i < 6; i++) {
            System.out.print("\033[30m    "+(i+1));
        }
    }
    //LIMPIAR ESCENARIO
    @Override
    public void limpiar_esenario(){
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                esenac[i][j]= 3;
            }
        }
        cambio_esenario();
    }
    //ELECCION DE CAMPO
    @Override
    public void eleccion_campo(){
        int campo=4;
        while (campo!=0){
            int columna, fila;
            System.out.println("\nElige Columna:");
            columna=ss.nextInt();
            System.out.println("Fila");
            fila=ss.nextInt();
            System.out.println("Que tipo de campo o vehiculo quieres en esa casilla \n1: Agua \n2: Montana \n3: Tanque \n4: Avión \n5: Primer Enemigo \n6: Segundo Enemigo \n7: Tercer Enemigo \n8: Terminar");
            campo=ss.nextInt();
            switch (campo){
                case 1:
                    esenac[fila-1][columna-1]=1;
                    break;
                case 2:
                    esenac[fila-1][columna-1]=2;
                    break;
                case 3:
                     esenac[fila-1][columna-1]=7;
                    break;
                case 4:
                     esenac[fila-1][columna-1]=8;
                    break;
                case 5:
                    esenac[fila-1][columna-1]=4;
                    break;
                case 6:
                    esenac[fila-1][columna-1]=5;
                    break;
                case 7:
                    esenac[fila-1][columna-1]=6;
                    break;
                case 8 :
                    campo=0;
                    break;
            }
            cambio_esenario();
        }
        opcion();
    }
    //OPCION NOS SIRVE PARA TERMINAR EL CREADOR DE ESCENARIO CUANDO LO QUERAMOS
    public void opcion(){
        System.out.println("\n1: Terminar");
        int opcion =ss.nextInt();
        switch (opcion){
            case 1:
                break;
        }

    }
}
