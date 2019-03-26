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
public class DatosEscena {
    Escenario [] guarda = new Escenario[6];
    Escenario e1= new Escena1();
    Escenario e2= new Escena2();
    Escenario e3= new Escena3();
    int num=3;
    public DatosEscena(){
        guarda[0] = e1;
        guarda[1] = e2;
        guarda[2] = e3;
    }
    
    public void Crear(){
        
        guarda[num]=new CrearEscena1();
        guarda[num].limpiar_esenario();
        guarda[num].eleccion_campo();
        num=num+1;
    }
    public void verTodo(){
        for (int i=0;i<num;i++){
            guarda[i].cambio_esenario();
        }
    }
}
