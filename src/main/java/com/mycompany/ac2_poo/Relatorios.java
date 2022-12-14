/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ac2_poo;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author eduar
 */
public class Relatorios {
    public static void imprimeCondutores(List<Condutor> condutor, int repeated){
        Collections.sort(condutor);
        for(int i = 0; i < repeated; i++){
            System.out.println(condutor.get(i).toString());
        }
    };
    
    public static void imprimeVeiculos(List<String> veiculo, int repeated) {
        Collections.sort(veiculo);
        for (int i = 0; i < repeated; i++) {
            System.out.println(veiculo.get(i).toString());
        }
    };
    public static void imprimeViagens(List<Viagem> viagem, int repeated){
        Collections.sort(viagem);
        for (int i = 0; i < repeated; i++) {
            System.out.println(viagem.get(i).toString());
        }
    };

}
