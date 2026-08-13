/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethod.produtos;

import factorymethod.interfaces.Sedan;

/**
 * Produto concreto da família Volkswagen.
 * Representa o Volkswagen Virtus e implementa a interface Sedan.
 */
public class VolksVirtus implements Sedan {
    @Override
    public void exibirPortaMalas() {
        System.out.println("Volkswagen Virtus: porta-malas de 521 litros.");
    }
}