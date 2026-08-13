/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethod.produtos;

import factorymethod.interfaces.Hatch;

/**
 * Produto concreto da família Volkswagen.
 * Representa o Volkswagen Polo e implementa a interface Hatch.
 */
public class VolksPolo implements Hatch {
    @Override
    public void exibirConsumo() {
        System.out.println("Volkswagen Polo: consumo medio de 12,5 km/l na cidade.");
    }
}