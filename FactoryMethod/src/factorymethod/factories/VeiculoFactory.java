/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethod.factories;

import factorymethod.interfaces.Veiculo;
import factorymethod.produtos.Carro;
import factorymethod.produtos.Moto;

/**
 * Fábrica responsável pela criação dos veículos.
 * Centraliza a criação de Carro e Moto, evitando que o cliente
 * precise utilizar o new diretamente nessas classes.
 */
public class VeiculoFactory {

    public Veiculo criarVeiculo(String tipo) {
        // Verifica se o tipo informado não é nulo.
        if (tipo == null) {
            throw new IllegalArgumentException("Tipo de veiculo nao pode ser nulo.");
        }

        // Converte o tipo para maiúsculo para facilitar a comparação.
        switch (tipo.toUpperCase()) {
            case "CARRO":
                return new Carro();

            case "MOTO":
                return new Moto();

            default:
                // Caso o tipo informado não seja CARRO ou MOTO.
                throw new IllegalArgumentException("Tipo de veiculo desconhecido: " + tipo);
        }
    }
}