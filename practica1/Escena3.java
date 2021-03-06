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
public class Escena3 extends Escenario {
    // esenario basico 3
    private int esena3[][] =
            {
                    {7, 3, 5, 3, 6, 3,},
                    {3, 3, 3, 2, 2, 1,},
                    {3, 2, 3, 1, 3, 1,},
                    {3, 2, 3, 1, 3, 3,},
                    {3, 1, 3, 3, 2, 2,},
                    {4, 1, 8, 3, 3, 3,}
            };
    public Escena3(){
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                esenac[i][j] = esena3[i][j];
            }
        }
        //cambio_esenario();
        //ver_esenario();
    }
     //SE PUEDE DETERMINAR AL MOMENTO DE PROGRAMARLO QUE QUEREMOS SI TERRENO, MONTAÑA, AGUA, VEHICULOS Y ENEMIGOS
    @Override
     public void cambio_esenario(){
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                switch (esenac[i][j]) {
                    case 0:
                        // VACIO
                        esena[i][j] = "\033[37m████▉";
                        break;
                    case 1:
                        // AGUA
                        esena[i][j] = "\033[34m████▉";
                        break;
                    case 2:
                        // MONTAÑA
                        esena[i][j] = "\033[31m████▉";
                        break;
                    case 3:
                        //TERRENO
                        esena[i][j] = "\033[32m████▉";
                        break;
                    case 4:
                        //ENEMIGO 1
                        esena[i][j] = "\033[32m██" + "\033[30m"+1+ "\033[32m█▉";
                        break;
                    case 5:
                        //ENEMIGO 2
                        esena[i][j] = "\033[32m██" + "\033[30m"+2+ "\033[32m█▉";
                        break;
                    case 6:
                        //ENEMIGO 3
                        esena[i][j] = "\033[32m██" + "\033[30m"+3+ "\033[32m█▉";
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
     //MUESTRA EL ESCENARIO
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
    //LIMPIA EL ESCENARIO
    @Override
    public void limpiar_esenario(){}
    //SELECCIONA EL CAMPO DISPONNIBLE
    @Override
    public void eleccion_campo(){}
}
