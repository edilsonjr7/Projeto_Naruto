# 🥷 Sistema de Batalha Ninja - POO em Java

[![Java Version](https://img.shields.io/badge/JDK-21-orange.svg)](https://www.oracle.com/java/technologies/javase-jdk21-downloads.html)
[![Main Concept](https://img.shields.io/badge/Paradigma-Orientação%20a%20Objetos-blue.svg)](#-pilares-da-poo-aplicados)
[![Theme](https://img.shields.io/badge/Temática-Universo%20Naruto-red.svg)](https://en.wikipedia.org/wiki/Naruto)

Este projeto foi desenvolvido com o objetivo de praticar e demonstrar os quatro pilares da **Programação Orientada a Objetos (POO)** utilizando a linguagem Java. Para tornar o aprendizado dinâmico, o sistema utiliza a temática do anime **Naruto**, simulando batalhas entre ninjas de diferentes clãs, cada um com atributos e habilidades exclusivas.

## 🏗️ Estrutura do Projeto

O sistema é composto por 9 arquivos Java organizados de forma a separar responsabilidades e garantir a escalabilidade do código[cite: 11]:

| Arquivo | Tipo | Finalidade |
| :--- | :--- | :--- |
| `Ninja.java` | Classe Abstrata | Base de todos os ninjas. [cite_start]Define atributos e métodos comuns[cite: 12]. |
| `Uchiha.java` | Subclasse | [cite_start]Representa o Clã Uchiha; possui Sharingan e Amaterasu[cite: 12]. |
| `Uzumaki.java` | Subclasse | [cite_start]Representa o Clã Uzumaki; possui Rasengan e Modo Sennin[cite: 12]. |
| `Nara.java` | Subclasse | [cite_start]Representa o Clã Nara; possui manipulação de sombras[cite: 12]. |
| `Yuga.java` | Subclasse | [cite_start]Representa o Clã Hyuga; realiza ataques combinados[cite: 12]. |
| `Kage.java` | Subclasse Final | [cite_start]O ninja mais poderoso; implementa cura e jutsus proibidos[cite: 12, 82]. |
| `InterfaceCuravel.java` | Interface | [cite_start]Define o contrato de cura implementado pelo Kage[cite: 12]. |
| `Arena.java` | Classe Auxiliar | [cite_start]Gerencia as batalhas e o fluxo de rodadas[cite: 12]. |
| `ClasseTeste.java` | Classe Principal | [cite_start]Instancia os ninjas e demonstra os conceitos na prática[cite: 12]. |

---

## 💎 Pilares da POO Aplicados

O projeto serve como uma prova de conceito para os seguintes fundamentos:

### 1. Abstração
A classe `Ninja` é **abstract**, o que significa que não pode ser instanciada diretamente[cite: 15]. [cite_start]Ela define o contrato `usarJutsu()`, obrigando cada clã a fornecer sua própria implementação.

### 2. Herança
[cite_start]Todos os clãs estendem a classe `Ninja`, herdando automaticamente atributos como vida e chakra. Isso evita a repetição de código (Princípio DRY).

### 3. Encapsulamento
[cite_start]Os atributos `vida` e `chakra` são **private**[cite: 29]. [cite_start]O acesso é protegido por *getters* e *setters*, garantindo, por exemplo, que a vida nunca fique negativa através do método `receberDano()`[cite: 30, 31].

### 4. Polimorfismo
[cite_start]Um array do tipo `Ninja[]` pode armazenar qualquer subclasse[cite: 37]. [cite_start]Ao chamar `usarJutsu()`, o Java executa o comportamento específico do objeto real em tempo de execução[cite: 38, 43].

---

## ⚔️ Detalhes das Classes e Habilidades

* [cite_start]**Uchiha:** Possui o sistema de **Sharingan**, que amplifica o dano do *Amaterasu* de 45 para 55[cite: 62, 63].
* **Uzumaki:** Grande reserva de chakra. [cite_start]O **Modo Sennin** transforma o *Rasengan* no *Rasenshuriken*, aumentando o dano para 80[cite: 68, 70].
* [cite_start]**Nara:** Especialistas em controle com o **Jutsu de Sombra**, que amplifica o dano no próximo golpe[cite: 72, 73].
* [cite_start]**Hyuga (Yuga):** Ninja invocador que realiza ataques combinados com animais[cite: 76, 77].
* [cite_start]**Kage:** Declarado como **final**, não pode ser estendido[cite: 82, 87]. [cite_start]É o único capaz de usar o **Jutsu Proibido** e se curar via `InterfaceCuravel`[cite: 83, 85].

---

## 🧪 Resultados dos Testes

[cite_start]O projeto foi validado com o **JDK 21** apresentando os seguintes comportamentos[cite: 96]:
* [cite_start]**Batalha Madara vs Naruto:** Madara venceu com 10 de vida, validando a amplificação de dano do Sharingan[cite: 97].
* [cite_start]**Recuperação de Status:** O sistema de descanso recuperou corretamente o chakra do Uzumaki de 125 para 155[cite: 97].
* [cite_start]**Interface de Cura:** O Kage (Minato) recuperou vida de 180 para 220, utilizando o bônus de cura dupla[cite: 97].
* [cite_start]**Validação de Chakra:** Mensagens de erro são exibidas corretamente quando não há chakra para Jutsus Proibidos[cite: 97].

---

> [cite_start]Desenvolvido como projeto de portfólio para demonstrar domínio técnico em Java e Arquitetura de Software[cite: 102, 103].
