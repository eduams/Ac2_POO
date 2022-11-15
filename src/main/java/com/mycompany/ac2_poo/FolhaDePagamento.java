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
public class FolhaDePagamento {
    int mes;
    int ano;

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    static double totalaPagar(List<Condutor> condutores, int repeated){
        double soma=0;
        int x = 0;
        while (x < repeated){
        soma = condutores.get(x).salario + soma;
        x++;
        }
        return soma;
    }
    
    public static void imprimir(List<Condutor> condutores, int repeated){
        Collections.sort(condutores);
        for (int i = 0; i < repeated; i++) {
        System.out.println("Condutores e seus salários:");
        System.out.println(condutores.get(i).toString());
        }
        System.out.println("Total a pagar para os condutores");
        System.out.println(totalaPagar(condutores, repeated));
    }
}
