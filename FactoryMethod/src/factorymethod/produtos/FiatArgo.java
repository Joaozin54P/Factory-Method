/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethod.produtos;

import factorymethod.interfaces.Hatch;

/**
 * Produto concreto da família Fiat.
 * Representa o Fiat Argo e implementa a interface Hatch.
 */
public class FiatArgo implements Hatch {
    @Override
    public void exibirConsumo() {
        System.out.println("Fiat Argo: consumo medio de 13 km/l na cidade.");
    }
}