/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ac2_poo;

import Veiculos.Moto;
import com.mycompany.ac2_poo.Condutor;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eduar
 */
public class Ac2_POO {
    public static void main(String[] args) {         
                
                
        System.out.println("Hello World!");
        Moto moto = new Moto();
        moto.setCombustivel("Alcool");    
        moto.setValor(10); //valor do litro de combustível
        moto.setConsumo(5); //conwsumo em km/l
        moto.setDistancia(10); //distancia percorrida
        System.out.println(moto.gasto());
        
        
        List<Condutor> condutores = new ArrayList();
        
        System.out.println("Adicionar condutores");
        Boolean loopCheck = true;
        int repeated = 0;
        while(loopCheck == true){
            condutores.add(new Condutor("Elon Musk",223456789,"12/10/1995",2000));
            repeated++;
            condutores.add(new Condutor("Bill Gates",323456789,"22/04/1983",2500));
            repeated++;
            condutores.add(new Condutor("Jeff Bezos",123456789,"12/09/1955",2500));
            repeated++;
            loopCheck = false;
        }
        
        Relatorios.imprimeCondutores(condutores, repeated);

        
         
        
        
    }
}
