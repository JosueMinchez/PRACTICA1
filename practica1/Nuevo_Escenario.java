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
public class Nuevo_Escenario extends Escenario {
    Scanner ss = new Scanner(System.in);
    //DatosEnemigo sim= new DatosEnemigo();
    //datos enviar=new datos();
    private int [][] esena0 = new int[6][6];
    //CrearEsena [] guarda = new CrearEsena[6];

    public Nuevo_Escenario(){
        limpiar_esenario();
    }

    @Override
    public void cambio_esenario(){
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
                        //enemigo1
                        esena[i][j] = "\033[32m██" + "\033[30m"+1+ "\033[32m█▉";
                        break;
                    case 5:
                        //enemigo2
                        esena[i][j] = "\033[32m██" + "\033[30m"+2+ "\033[32m█▉";
                        break;
                    case 6:
                        //enemigo3
                        esena[i][j] = "\033[32m██" + "\033[30m"+3+ "\033[32m█▉";
                        break;
                    case 7:
                        //vehiculo
                        esena[i][j] = "\033[32m██" + "\033[30m=" + "\033[32m█▉";
                        break;
                    case 8:
                        //vehiculo
                        esena[i][j] = "\033[34m██" + "\033[30m=" + "\033[34m█▉";
                        break;
                    default:
                }
                esena0[i][j]=esenac[i][j];
            }
        }
        ver_esenario();
    }
    @Override
    public void ver_esenario(){
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

    @Override
    public void limpiar_esenario(){
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                esenac[i][j]= 3;
            }
        }
        cambio_esenario();
    }
    @Override
    public void eleccion_campo(){
        int campo=4;
        while (campo!=0){
            int columna, fila;
            System.out.println("\nElige Columna:");
            columna=ss.nextInt();
            System.out.println("Fila");
            fila=ss.nextInt();
            System.out.println("Que tipo de campo quieres en esa casilla \n1:Agua \n2:Montana");
            System.out.println("3: para terminar");
            campo=ss.nextInt();
            switch (campo){
                case 1:
                    esenac[fila-1][columna-1]=1;
                    break;
                case 2:
                    esenac[fila-1][columna-1]=2;
                    break;
                case 3 :
                    campo=0;
                    break;
            }
            cambio_esenario();
            //System.out.println("4 para terminar");
            //campo=ss.nextInt();
        }
        opcion();
    }
    public void opcion(){
        System.out.println("\n1: Terminar");
        int opcion =ss.nextInt();
        switch (opcion){
            case 1:
                break;
        }

    }
    
}
