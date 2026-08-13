/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorymethod;

import factorymethod.factories.FiatFactory;
import factorymethod.factories.VeiculoFactory;
import factorymethod.factories.VolksFactory;
import factorymethod.interfaces.Hatch;
import factorymethod.interfaces.MontadoraFactory;
import factorymethod.interfaces.SUV;
import factorymethod.interfaces.Sedan;
import factorymethod.interfaces.Veiculo;

/**
 * Classe principal do projeto.
 * É responsável por testar o Factory Method e o Abstract Factory.
 */
public class FactoryMethod {

    public static void main(String[] args) {

        // ==============================
        // PARTE 1 - FACTORY METHOD
        // ==============================

        // Cria a fábrica de veículos.
        VeiculoFactory veiculoFactory = new VeiculoFactory();

        // A fábrica cria os veículos sem usar new diretamente no cliente.
        Veiculo carro = veiculoFactory.criarVeiculo("CARRO");
        Veiculo moto = veiculoFactory.criarVeiculo("MOTO");

        // Exibe os detalhes dos veículos criados.
        carro.exibirDetalhes();
        moto.exibirDetalhes();


        // ==============================
        // PARTE 2 e 3 - ABSTRACT FACTORY
        // ==============================

        // Cria a fábrica da família Fiat.
        MontadoraFactory fiatFactory = new FiatFactory();

        // Cria os produtos da família Fiat.
        Sedan fiatSedan = fiatFactory.criarSedan();
        Hatch fiatHatch = fiatFactory.criarHatch();
        SUV fiatSUV = fiatFactory.criarSUV();

        // Exibe as informações dos veículos Fiat.
        fiatSedan.exibirPortaMalas();
        fiatHatch.exibirConsumo();
        fiatSUV.exibirAltura();


        // Cria a fábrica da família Volkswagen.
        MontadoraFactory volksFactory = new VolksFactory();

        // Cria os produtos da família Volkswagen.
        Sedan volksSedan = volksFactory.criarSedan();
        Hatch volksHatch = volksFactory.criarHatch();
        SUV volksSUV = volksFactory.criarSUV();

        // Exibe as informações dos veículos Volkswagen.
        volksSedan.exibirPortaMalas();
        volksHatch.exibirConsumo();
        volksSUV.exibirAltura();
    }
}