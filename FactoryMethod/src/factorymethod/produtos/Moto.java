/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethod.produtos;

import factorymethod.interfaces.Veiculo;

/**
 * Produto concreto da fábrica.
 * Representa uma moto e implementa a interface Veiculo.
 */
public class Moto implements Veiculo {
    @Override
    public void exibirDetalhes() {
        System.out.println("Moto: 2 rodas, agil no transito, capacidade para 2 pessoas.");
    }
}