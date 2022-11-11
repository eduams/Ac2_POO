/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Veiculos;

import com.mycompany.ac2_poo.Veiculo;

/**
 *
 * @author eduar
 */
public class Moto implements Veiculo {

    double cilindradas;
    
    double distancia;
    double valor;
    double consumo;
    double placa;
    String nome;
    String tipo;
    String combustivel;
    
    @Override
    public double gasto() {
        return valor*(distancia/consumo);
    }
    
    @Override
    public String setNome(String nome) {
        return this.nome = nome;
    }

    @Override
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String getCombustivel() {
        return this.combustivel;
    }

    @Override
    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    @Override
    public double getConsumo() {
        return this.consumo;
    }

    @Override
    public double getPlaca() {
        return this.placa;
    }

    @Override
    public void setPlaca(double placa) {
        this.placa = placa;
    }

    @Override
    public double setConsumo(double consumo) {
        return this.consumo = consumo;
    }
    
    @Override
    public void setDistancia(double distancia){
    this.distancia = distancia;
    }
    
    @Override
    public void setValor(double valor){
    this.valor = valor;
    }
    
}
