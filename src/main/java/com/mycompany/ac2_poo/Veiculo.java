/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ac2_poo;

/**
 *
 * @author eduar
 */
public interface Veiculo {
    String setNome(String nome);
    void setTipo(String tipo);    
    void setDistancia(double distancia);
    void setValor(double valor);
    
    
    double gasto();
    
    String getCombustivel();
    void setCombustivel(String combustivel);

    double getConsumo();
    double setConsumo(double consumo);
    
    double getPlaca();
    void setPlaca(double placa);
}
