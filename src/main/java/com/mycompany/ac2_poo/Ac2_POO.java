/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ac2_poo;

import Veiculos.Caminhao;
import Veiculos.Carro;
import Veiculos.Moto;
import com.mycompany.ac2_poo.Condutor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author eduar
 */
public class Ac2_POO {
    public static void main(String[] args) {         
                
        
        List<Condutor> condutores = new ArrayList();
        List<String> veiculosNomes = new ArrayList();

        
        System.out.println("Adicionar condutores:");
        Boolean loopCheck = true;
        int repeated = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        String nome;
        int cpf;
        String dataNasc;
        double salario;
        int cilindradas;
        String combustivel;
        int consumo;
        
        while(loopCheck == true){
            System.out.println("Digite o nome: ");
            nome = scanner.next();
            System.out.println("Digite o CPF: ");
            cpf = scanner.nextInt();
            System.out.println("Digite a data de nascimento: ");
            dataNasc = scanner.next();
            System.out.println("Digite o salário: ");
            salario = scanner.nextDouble();
            
            condutores.add(new Condutor(nome,cpf,dataNasc,salario));
            repeated++;
            System.out.println("Adicionar mais um condutor? (true ou false)");
            loopCheck = scanner.nextBoolean();
        }
        
        System.out.println("Adicionar veículos:");
        loopCheck = true;
        repeated = 0;

        
        Moto moto[] = new Moto[10];
        Carro carro[] = new Carro[10];
        Caminhao caminhao[] = new Caminhao[10];

        for (int x = 1;loopCheck == true; x++) {
            
            System.out.println("Digite o nome: ");
            nome = scanner.next();
            veiculosNomes.add(moto[x].setNome(nome));
            System.out.println("Digite as cilindradas: ");
            cilindradas = scanner.nextInt();
            moto[x].setCilindradas(cilindradas);
            System.out.println("Digite o tipo de combustível: ");
            combustivel = scanner.next();
            moto[x].setCombustivel(combustivel);
            System.out.println("Digite o consumo (km/l): ");
            consumo = scanner.nextInt();
            moto[x].setConsumo(consumo);
            
            repeated++;
            System.out.println("Adicionar mais um veiculo? (true ou false)");
            loopCheck = scanner.nextBoolean();
        }
        
        
        System.out.println("Relatório dos condutores ordenado por nome: ");
        Relatorios.imprimeVeiculos(veiculosNomes, repeated);

        
         
        
        
    }
}
