/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ac2_poo;

/**
 *
 * @author eduar
 */
public class Viagem {
    String cidadeOrigem;
    String cidadeDestino;
    String veiculo;
    String condutor;
    double distancia;

    double custo(double consumo, double valor, double distancia, double diasViagem){

        if (distancia / diasViagem > 700){
        System.out.println("Distância maior que 700");
        }
        
        return (valor*(distancia/consumo)) / diasViagem;        
}
    
}
