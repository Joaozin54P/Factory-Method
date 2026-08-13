/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethod.produtos;

import factorymethod.interfaces.SUV;

/**
 * Produto concreto da família Volkswagen.
 * Representa o Volkswagen T-Cross e implementa a interface SUV.
 * Foi adicionado na Parte 3 da atividade.
 */
public class VolksTCross implements SUV {
    @Override
    public void exibirAltura() {
        System.out.println("Volkswagen T-Cross: altura do veiculo de 1,58 m.");
    }
}