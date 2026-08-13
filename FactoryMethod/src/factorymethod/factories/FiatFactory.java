/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethod.factories;

import factorymethod.interfaces.Hatch;
import factorymethod.interfaces.MontadoraFactory;
import factorymethod.interfaces.SUV;
import factorymethod.interfaces.Sedan;
import factorymethod.produtos.FiatArgo;
import factorymethod.produtos.FiatCronos;
import factorymethod.produtos.FiatPulse;

/**
 * Fábrica concreta da família Fiat.
 * É responsável por criar os produtos Fiat dos tipos Sedan, Hatch e SUV.
 */
public class FiatFactory implements MontadoraFactory {

    @Override
    public Sedan criarSedan() {
        return new FiatCronos();
    }

    @Override
    public Hatch criarHatch() {
        return new FiatArgo();
    }

    @Override
    public SUV criarSUV() {
        // Na Parte 3, foi necessário adicionar este método
        // para criar o novo tipo de produto: SUV.
        return new FiatPulse();
    }
}