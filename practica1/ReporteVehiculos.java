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
public class ReporteVehiculos {
    public ReporteVehiculos(){
        
    }
    //REPORTA EL MEJOR VEHICULO
    public void MejorVehi(){
        System.out.println("EL MEJOR VEHICULO ES: ");
        System.out.println("|_AVION_|\nEste vehiculo puede volar y\npara el no es obstaculo el agua.\nTiene movimiento especial que daña a todos los enemigos");
    }
    //REPORTA EL PEOR VEHICULO
    public void PeorVehi(){
        System.out.println("EL PEOR VEHICULO ES: ");
        System.out.println("|_TANQUE_|\nEste vehiculo no puede pasar sobre el agua\npuede destruir montañas pero unicamente\ncuando le dispara 2 veces para destruirlo");
    }
    //PEQUEÑO REPORTE DE COMO SE DARA LA BATAÑA
    public void RepBatalla(){
        System.out.println("La probabilidad de que el Jugador gane es muy baja\nsolo con una buena estrategia podra derrotar al enemigo.\nSi el jugador pierde no se le dara experiencia,\nse le dara unicamente cuando gane");
        System.out.println("EL ENEMIGO TENDRA MAYOR PROBABILIDAD DE GANAR\nASI QUE PIENSA BIEN TU ESTRATEGIA");
    }
}
