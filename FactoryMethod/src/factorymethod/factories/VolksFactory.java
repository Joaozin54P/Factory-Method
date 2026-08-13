/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethod.factories;

import factorymethod.interfaces.Hatch;
import factorymethod.interfaces.MontadoraFactory;
import factorymethod.interfaces.SUV;
import factorymethod.interfaces.Sedan;
import factorymethod.produtos.VolksPolo;
import factorymethod.produtos.VolksTCross;
import factorymethod.produtos.VolksVirtus;

/**
 * Fábrica concreta da família Volkswagen.
 * É responsável por criar os produtos Volkswagen dos tipos
 * Sedan, Hatch e SUV.
 */
public class VolksFactory implements MontadoraFactory {

    @Override
    public Sedan criarSedan() {
        return new VolksVirtus();
    }

    @Override
    public Hatch criarHatch() {
        return new VolksPolo();
    }

    @Override
    public SUV criarSUV() {
        // Na Parte 3, foi necessário adicionar este método
        // para criar o novo tipo de produto: SUV.
        return new VolksTCross();
    }
}