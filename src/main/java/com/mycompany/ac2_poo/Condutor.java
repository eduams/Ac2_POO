/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ac2_poo;

import java.util.Date;

/**
 *
 * @author eduar
 */
public class Condutor implements Comparable<Condutor>{
    String nome;
    int cpf;
    String dataNasc; 
    double salario;
    
    Condutor(String nome, int cpf, String dataNasc, double salario){
    this.cpf = cpf;
    this.nome = nome;
    this.dataNasc = dataNasc;
    this.salario = salario;
    }
    
    @Override
    public String toString() {
        return ("Nome:"+nome+
                    " CPF: "+ cpf +
                    " Nascimento: "+ dataNasc +
                    " Salário : " + salario);
   }

    @Override
    public int compareTo(Condutor o) {
        return (int) (this.cpf - o.cpf);
    }


}
