# Atividade - Factory Method e Abstract Factory (Veículos)

A atividade foi desenvolvida em Java, utilizando os padrões de criação Factory Method e Abstract Factory.



## Estrutura do projeto

```
src/factorymethod/
├── interfaces/
│   ├── Veiculo.java          (Parte 1 - Product)
│   ├── Sedan.java             (Parte 2 - Abstract Product)
│   ├── Hatch.java              (Parte 2 - Abstract Product)
│   ├── SUV.java                 (Parte 3 - Abstract Product novo)
│   └── MontadoraFactory.java   (Parte 2/3 - Abstract Factory)
├── produtos/
│   ├── Carro.java, Moto.java                         (Parte 1)
│   ├── FiatCronos.java, FiatArgo.java, FiatPulse.java (Fiat)
│   └── VolksVirtus.java, VolksPolo.java, VolksTCross.java (Volkswagen)
├── factories/
│   ├── VeiculoFactory.java   (Parte 1 - Factory Method)
│   ├── FiatFactory.java      (Parte 2/3 - Concrete Factory)
│   └── VolksFactory.java     (Parte 2/3 - Concrete Factory)
└── FactoryMethod.java        (Cliente / classe main)
```

## Parte 1 — Factory Method

`VeiculoFactory.criarVeiculo(String tipo)` decide, em tempo de execução, se
devolve um `Carro` ou uma `Moto`, ambos implementando `Veiculo`. A classe
cliente nunca chama `new Carro()` nem `new Moto()` diretamente, apenas usa a
fábrica.

## Parte 2 — Abstract Factory

A interface `MontadoraFactory` define os métodos para criação dos produtos de cada família. Assim, ao utilizar `FiatFactory`, os produtos criados pertencem à família Fiat, enquanto `VolksFactory` cria produtos da família Volkswagen.

## Parte 3 — O desafio do novo produto (SUV)

**O problema na prática:** o Abstract Factory funciona muito bem quando é
preciso adicionar uma **nova família** (por exemplo, uma montadora nova como
a Toyota) — basta criar uma nova classe que implementa `MontadoraFactory`, e
nada mais precisa mudar.

O problema aparece quando é preciso adicionar um **novo tipo de produto**
dentro das famílias que já existem, que foi exatamente o caso do SUV:

1. Foi necessário alterar a **interface** `MontadoraFactory`, adicionando o
   método `SUV criarSUV()`.
2. Como consequência, **todas** as fábricas concretas que já existiam
   (`FiatFactory` e `VolksFactory`) precisaram ser alteradas para implementar
   esse novo método — senão o projeto simplesmente não compila mais.
3. Isso viola o **Princípio Aberto/Fechado** (Open/Closed Principle): o
   ideal seria que a classe estivesse "aberta para extensão, fechada para
   modificação", mas aqui fomos obrigados a modificar código que já estava
   pronto e testado.

**Conclusão do grupo:** o Abstract Factory é ótimo para garantir consistência
entre produtos de uma mesma família e para adicionar famílias novas com
facilidade, mas tem um custo de manutenção alto quando o "menu" de produtos
das famílias muda com frequência — nesse cenário, cada novo tipo de produto
obriga a tocar em toda fábrica já existente.

## Diagrama de classes

O diagrama abaixo mostra a relação entre `MontadoraFactory`, suas
implementações (`FiatFactory` e `VolksFactory`) e os produtos criados por
cada uma, além do Factory Method (`VeiculoFactory` → `Carro`/`Moto`).

<img width="8192" height="2746" alt="Factory Method Diagama" src="https://github.com/user-attachments/assets/f2f42d59-abaa-4ee7-90ce-20d4c5e1098a" />

## Integrantes

- João Pedro Machado
- Giovanna Aparecida
