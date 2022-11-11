/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ac2_poo;

import Veiculos.Moto;

/**
 *
 * @author eduar
 */
public class Ac2_POO {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Moto moto= new Moto();
        moto.setCombustivel("Alcool");    
        moto.setValor(10); //valor do litro de combustível
        moto.setConsumo(5); //conwsumo em kms/l
        moto.setDistancia(10); //distancia percorrida
        System.out.println(moto.gasto());
    }
}
