/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethod.produtos;

import factorymethod.interfaces.Sedan;

/**
 * Produto concreto da família Fiat.
 * Representa o Fiat Cronos e implementa a interface Sedan.
 */
public class FiatCronos implements Sedan {
    @Override
    public void exibirPortaMalas() {
        System.out.println("Fiat Cronos: porta-malas de 525 litros.");
    }
}