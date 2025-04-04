# 🧮 Calculadora Básica - Android Studio com Java

## 📌 Sobre o Projeto
Este projeto consiste em uma **calculadora mobile simples** desenvolvida no **Android Studio** com **Java**, utilizando **ConstraintLayout** no XML para a construção da interface. O objetivo principal foi aplicar o conhecimento de manipulação de eventos, lógica de programação e separação de responsabilidades com base nos conceitos de **Programação Orientada a Objetos (POO)**.

---

## 🎯 Objetivo

Aplicar conhecimentos de:

- Criação de telas com `ConstraintLayout`;
- Uso de `EditText`, `Button` e `Toast`;
- Organização de código utilizando classes Java;
- Estruturação de pastas seguindo o padrão Android.

---

## 📂 Estrutura do Projeto
O projeto está organizado de forma simples e funcional, separando a lógica da calculadora da `MainActivity`:

```plaintext
/app/src/main/java/com/example/calculadora/
│
├── CalculadoraUtils.java           # Classe com métodos para somar, subtrair, multiplicar e dividir
├── MainActivity.java               # Tela principal com inputs e botões das operações
│
/app/src/main/res/layout/
│
├── activity_main.xml               # Layout da tela principal com ConstraintLayout
```
---

## 🧠 Funcionalidades

- Entrada de dois números via `EditText`;
- Botões separados para:
  - Soma ➕
  - Subtração ➖
  - Multiplicação ✖️
  - Divisão ➗
- Exibição do resultado com `Toast`;
- Validação para evitar divisão por zero ou campos vazios.

---

## 💻 Tecnologias Utilizadas

| Tecnologia      | Finalidade                              |
|-----------------|------------------------------------------|
| Java            | Lógica da aplicação                     |
| Android Studio  | Ambiente de desenvolvimento              |
| XML             | Definição de layout com ConstraintLayout |
| Toast           | Mensagens curtas para o usuário          |

---

## 🏗️ Como Executar o Projeto
1. Clone este repositório:
   ```sh
   git clone https://github.com/lluizcallixtto/Calculadora.git
   ```
2. Abra o **Android Studio** e importe o projeto.
3. Construa e execute a aplicação no **emulador** ou **dispositivo físico**.

## 📌 Conclusão

Este projeto demonstrou a construção de um aplicativo Android simples, utilizando a linguagem Java e a interface ConstraintLayout. Através da criação de uma calculadora com operações básicas (soma, subtração, multiplicação e divisão), foi possível aplicar conceitos fundamentais de programação orientada a objetos, manipulação de eventos, organização de diretórios e boas práticas de desenvolvimento mobile.

Além disso, a separação da lógica de negócio em uma classe utilitária (`CalculadoraUtils.java`) contribuiu para um código mais limpo, reutilizável e de fácil manutenção. O projeto reforça a importância da estruturação e modularização em aplicações Android, preparando o caminho para desenvolvimentos mais robustos no futuro.

---

📌 **Autor:** Luiz Eduardo Americo Calixto 
