/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ac2_poo;

/**
 *
 * @author eduar
 */
public class Viagem implements Comparable<Viagem>{
    String cidadeOrigem;
    String cidadeDestino;
    String veiculo;
    String condutor;
    double distancia;
    double custoFinal;
    
    public Viagem(String cidadeOrigem, String cidadeDestino, String veiculo, String condutor, double distancia, double custoFinal ){
        this.cidadeOrigem = cidadeOrigem;
        this.cidadeDestino = cidadeDestino;
        this.veiculo = veiculo;
        this.condutor = condutor;
        this.distancia = distancia;
        this.custoFinal = custoFinal;
    }

    public static double custo(double consumo, double valor, double distancia, double diasViagem){

        if (distancia / diasViagem > 700){
        System.out.println("Distância maior que 700");
        }
        
        return (valor*(distancia/consumo)) / diasViagem;        
}
    @Override
    public String toString() {
        return ("Cidade de origem:" + cidadeOrigem
                + " Cidade de destino: " + cidadeDestino
                + " Veículo: " + veiculo
                + " Condutor: " + condutor
                + " Distância: " + distancia);
    }

    
    @Override
    public int compareTo(Viagem o) {
        return (int) (custoFinal - o.custoFinal);
    }

    
}
