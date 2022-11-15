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
        List<Viagem> viagens = new ArrayList();

        
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
        double distancia;
        int placa;
        String tipo;
        double valor = 0;
        int portas;
        int eixos;
        int repeatedCondutores = 0;
        int repeatedMotos = 0;
        int repeatedCaminhoes = 0;
        int repeatedCarros = 0;
        int repeatedViagem = 0;
        
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
            if (loopCheck == false){
            repeatedCondutores = repeated;
            }
        }
        
        System.out.println("Adicionando veículos...");
        
        Moto moto[] = new Moto[10];
        Carro carro[] = new Carro[10];
        Caminhao caminhao[] = new Caminhao[10];
        
        loopCheck = true;
        System.out.println("Adicionar motos:");
        for (int x = 0;loopCheck == true; x++) {
            repeated = 0;
            moto[x] = new Moto();
            moto[x].setTipo("Moto");
            
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
            System.out.println("Digite a distância em km percorrida pela moto: ");
            distancia = scanner.nextDouble();
            moto[x].setDistancia(distancia);
            System.out.println("Digite sua placa: ");
            placa = scanner.nextInt();
            moto[x].setPlaca(placa);
            System.out.println("Digite o valor do combustível (por litro): ");
            valor = scanner.nextDouble();
            moto[x].setValor(valor);
           
            repeated++;
            System.out.println("Adicionar mais uma moto? (true ou false)");
            loopCheck = scanner.nextBoolean();
            if (loopCheck == false) {
                repeatedMotos = repeated;
            }
            
        }
        
        loopCheck = true;        
        System.out.println("Adicionar carros:");
        for (int x = 0; loopCheck == true; x++) {
            repeated = 0;

            carro[x] = new Carro();
            carro[x].setTipo("Carro");

            System.out.println("Digite o nome: ");
            nome = scanner.next();
            veiculosNomes.add(carro[x].setNome(nome));
            System.out.println("Digite o número de portas: ");
            portas = scanner.nextInt();
            carro[x].setQuantidadePortas(portas);
            System.out.println("Digite o tipo de combustível: ");
            combustivel = scanner.next();
            carro[x].setCombustivel(combustivel);
            System.out.println("Digite o consumo (km/l): ");
            consumo = scanner.nextInt();
            carro[x].setConsumo(consumo);
            System.out.println("Digite a distância em km percorrida: ");
            distancia = scanner.nextDouble();
            carro[x].setDistancia(distancia);
            System.out.println("Digite sua placa: ");
            placa = scanner.nextInt();
            carro[x].setPlaca(placa);
            System.out.println("Digite o valor do combustível (por litro): ");
            valor = scanner.nextDouble();
            carro[x].setValor(valor);

            repeated++;
            System.out.println("Adicionar mais um carro? (true ou false)");
            loopCheck = scanner.nextBoolean();
            if (loopCheck == false) {
                repeatedCarros = repeated;
            }
            
        }
        
        loopCheck = true;
        System.out.println("Adicionar caminhões:");
        for (int x = 0; loopCheck == true; x++) {
            repeated = 0;

            caminhao[x] = new Caminhao();
            caminhao[x].setTipo("Caminhão");

            System.out.println("Digite o nome: ");
            nome = scanner.next();
            veiculosNomes.add(caminhao[x].setNome(nome));
            System.out.println("Digite o número de portas: ");
            eixos = scanner.nextInt();
            caminhao[x].setQuantidadeEixos(eixos); 
            System.out.println("Digite o tipo de combustível: ");
            combustivel = scanner.next();
            caminhao[x].setCombustivel(combustivel);
            System.out.println("Digite o consumo (km/l): ");
            consumo = scanner.nextInt();
            caminhao[x].setConsumo(consumo);
            System.out.println("Digite a distância em km percorrida pela moto: ");
            distancia = scanner.nextDouble();
            caminhao[x].setDistancia(distancia);
            System.out.println("Digite sua placa: ");
            placa = scanner.nextInt();
            caminhao[x].setPlaca(placa);
            System.out.println("Digite o valor do combustível (por litro): ");
            valor = scanner.nextDouble();
            caminhao[x].setValor(valor);

            repeated++;
            System.out.println("Adicionar mais um caminhão? (true ou false)");
            loopCheck = scanner.nextBoolean();
            if (loopCheck == false) {
                repeatedCaminhoes = repeated;
            }
        }
        
        String cidadeOrigem;
        String cidadeDestino;
        String veiculo;
        String condutor;
        loopCheck = true;
        double distanciaViagem;
        int dias;
        while (loopCheck == true) {
            repeated = 0;
            System.out.println("Digite a cidade de origem: ");
            cidadeOrigem = scanner.next();
            System.out.println("Digite a cidade de destino: ");
            cidadeDestino = scanner.next();
            System.out.println("Digite o veículo: ");
            veiculo = scanner.next();
            System.out.println("Digite o condutor: ");
            condutor = scanner.next();
            System.out.println("Digite a distância");
            distancia = scanner.nextDouble();
            System.out.println("Digite o consumo");
            consumo = scanner.nextInt();
            System.out.println("Digite os dias de viagem");
            dias = scanner.nextInt();
            System.out.println("Digite o valor do combustivel");
            valor = scanner.nextDouble();
            
            viagens.add(new Viagem(cidadeOrigem,cidadeDestino, veiculo, condutor,distancia,Viagem.custo(consumo, valor, distancia, dias)));
            repeated++;
            System.out.println("Adicionar mais uma viagem? (true ou false)");
            loopCheck = scanner.nextBoolean();
            if (loopCheck == false) {
                repeatedViagem = repeated;
            }
        }

        System.out.println("Relatório dos condutores ordenado por nome: ");
        Relatorios.imprimeCondutores(condutores, repeatedCondutores);
        System.out.println("Relatório dos nomes dos veículos em ordem alfabética: ");
        int repeatedSoma = (repeatedMotos + repeatedCarros + repeatedCaminhoes);
        Relatorios.imprimeVeiculos(veiculosNomes, repeatedSoma);
        System.out.println("Relatório das viagens ordenadas pelo custo: ");
        Relatorios.imprimeViagens(viagens,repeatedViagem);
        
        System.out.println("Relatório do total dos salários a pagar para motoristas: ");
        FolhaDePagamento novembro2022= new FolhaDePagamento();
        novembro2022.setAno(2022);
        novembro2022.setMes(11);
        novembro2022.imprimir(condutores,repeatedCondutores);
    }
}
