/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package factorymethod.interfaces;
/**
 * Interface da fábrica das montadoras.
 *
 * Define os métodos que todas as fábricas precisam implementar
 * para criar os diferentes tipos de veículos.
 *
 * Na Parte 3 foi adicionado o método criarSUV().
 * Como todas as fábricas implementam esta interface, elas também
 * precisaram ser alteradas para implementar esse novo método.
 *
 * Isso mostra um problema do padrão Abstract Factory quando é
 * necessário adicionar um novo tipo de produto, pois todas as
 * fábricas existentes precisam ser modificadas.
 */
public interface MontadoraFactory {
    Sedan criarSedan();
    Hatch criarHatch();
    SUV criarSUV();
}