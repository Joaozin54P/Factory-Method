/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethod.produtos;

import factorymethod.interfaces.Veiculo;

/**
 * Produto concreto da fábrica.
 * Representa um carro e implementa a interface Veiculo.
 */
public class Carro implements Veiculo {
    @Override
    public void exibirDetalhes() {
        System.out.println("Carro: 4 rodas, uso urbano, capacidade para 5 pessoas.");
    }
}