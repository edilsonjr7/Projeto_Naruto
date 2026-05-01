# 🥷 Sistema de Batalha Ninja - POO em Java

[![Java Version](https://img.shields.io/badge/JDK-21-orange.svg)](https://www.oracle.com/java/technologies/javase-jdk21-downloads.html)
[![Main Concept](https://img.shields.io/badge/Paradigma-Orientação%20a%20Objetos-blue.svg)](#-pilares-da-poo-aplicados)
[![Theme](https://img.shields.io/badge/Temática-Universo%20Naruto-red.svg)](https://en.wikipedia.org/wiki/Naruto)

Este projeto foi desenvolvido com o objetivo de praticar e demonstrar os quatro pilares da **Programação Orientada a Objetos (POO)** utilizando a linguagem Java. Para tornar o aprendizado dinâmico, o sistema utiliza a temática do anime **Naruto**, simulando batalhas entre ninjas de diferentes clãs, cada um com atributos e habilidades exclusivas.

## 🏗️ Estrutura do Projeto

O sistema é composto por 9 arquivos Java organizados para separar as responsabilidades e garantir a escalabilidade do código:

| Arquivo | Tipo | Finalidade |
| :--- | :--- | :--- |
| `Ninja.java` | Classe Abstrata | Base de todos os ninjas. Define atributos e métodos comuns. |
| `Uchiha.java` | Subclasse | Clã Uchiha; possui Sharingan e Amaterasu. |
| `Uzumaki.java` | Subclasse | Clã Uzumaki; possui Rasengan e Modo Sennin. |
| `Nara.java` | Subclasse | Clã Nara; possui manipulação de sombras amplificada. |
| `Yuga.java` | Subclasse | Clã Hyuga; realiza ataques combinados com invocações. |
| `Kage.java` | Subclasse Final | O ninja mais poderoso; implementa cura e jutsus proibidos. |
| `InterfaceCuravel.java` | Interface | Define o contrato de cura implementado pelo Kage. |
| `Arena.java` | Classe Auxiliar | Gerencia o combate, turnos e fluxo de rodadas. |
| `ClasseTeste.java` | Classe Principal | Instancia os ninjas e executa as demonstrações. |

---

## 💎 Pilares da POO Aplicados

* **Abstração:** A classe `Ninja` é abstract, definindo o contrato `usarJutsu()` sem implementar uma lógica genérica.
* **Herança:** Clãs herdam de `Ninja`, reutilizando atributos como vida e chakra.
* **Encapsulamento:** Atributos privados com acesso via métodos que validam regras de negócio.
* **Polimorfismo:** Métodos sobrescritos permitem que um `Uchiha` e um `Uzumaki` reajam de formas diferentes ao mesmo comando.

---

## ⚔️ Sistema de Batalha
A classe `Arena` orquestra o confronto entre os ninjas, garantindo a separação entre a lógica de negócio e a execução:

* 🥊 **Turnos de combate:** Controla quem ataca em cada momento.
* 🔄 **Rodadas automáticas:** Fluxo contínuo até o fim da luta.
* ⚡ **Uso de habilidades:** Gerencia o gasto de chakra e bônus de dano.
* 🏆 **Declaração de vencedor:** Exibe o sobrevivente e o status final.

---

## 🎭 Clãs e Habilidades Especiais

| Clã | Habilidade Principal | Diferencial Técnico |
| :--- | :--- | :--- |
| **Uchiha** | `Amaterasu` | O **Sharingan** amplifica o dano de 45 para 55. |
| **Uzumaki** | `Rasenshuriken` | O **Modo Sennin** potencializa o ataque para 80 de dano. |
| **Nara** | `Jutsu de Sombra` | Especialista em controle, aumenta o próximo golpe para 28. |
| **Hyuga** | `Ataque Combinado` | Ninja invocador que luta em conjunto com animais. |
| **Kage** | `Jutsu Proibido` | Classe **final**; único que se cura via `InterfaceCuravel`. |

---

## 🧪 Testes Realizados
O projeto foi validado com o **JDK 21**, cobrindo os seguintes comportamentos:

* ✔ **Batalhas completas:** Vitória do Madara sobre o Naruto com 10 de vida restante.
* ✔ **Buffs funcionando:** Dano amplificado corretamente pelo Sharingan e Sombras.
* ✔ **Recuperação de chakra:** Sistema de descanso funcionando (Ex: 125 -> 155).
* ✔ **Polimorfismo validado:** Diferentes comportamentos em um array do tipo `Ninja[]`.
* ✔ **Interface aplicada:** Minato realizou a cura dupla (180 -> 220) com sucesso.
* ✔ **Validação de Chakra:** Bloqueio de jutsus poderosos quando o chakra está insuficiente.

---

