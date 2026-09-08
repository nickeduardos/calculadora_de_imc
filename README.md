# Calculadora de IMC

## Descrição

Este projeto consiste em um programa desenvolvido em **Java** capaz de calcular o **IMC (Índice de Massa Corporal)** de uma pessoa.

O programa solicita ao usuário seu nome, gênero, peso e altura. Após receber essas informações, realiza o cálculo do IMC e apresenta a classificação correspondente de acordo com o gênero informado.

---

## Funcionalidades

O programa permite:

* Informar o nome do usuário;
* Informar o gênero:

  * **M** para Masculino;
  * **F** para Feminino;
  * **N** para Não desejar informar;
* Informar o peso;
* Informar a altura;
* Calcular automaticamente o IMC;
* Exibir o nome, gênero e IMC calculado;
* Classificar o resultado de acordo com as faixas definidas no programa;
* Validar gêneros inválidos;
* Limpar o terminal ao iniciar o programa.

---

## Fórmula utilizada

O cálculo do IMC é realizado utilizando a seguinte fórmula:

**IMC = Peso / (Altura × Altura)**

Onde:

* **Peso** é informado em quilogramas (kg);
* **Altura** é informada em metros (m).

### Exemplo

Uma pessoa com:

* Peso: **80 kg**
* Altura: **1,80 m**

Terá o seguinte cálculo:

**IMC = 80 / (1,80 × 1,80)**

**IMC = 24,69**

---

## Classificações utilizadas

### Masculino

| IMC                 | Classificação      |
| ------------------- | ------------------ |
| Menor que 20        | Abaixo do normal   |
| Entre 20 e 24,99    | Normal             |
| Entre 25 e 29,98    | Obesidade Leve     |
| Entre 30 e 39,99    | Obesidade Moderada |
| Maior ou igual a 40 | Obesidade Mórbida  |

### Feminino e Não informado

| IMC                 | Classificação      |
| ------------------- | ------------------ |
| Menor que 19        | Abaixo do normal   |
| Entre 19 e 23,99    | Normal             |
| Entre 24 e 28,99    | Obesidade Leve     |
| Entre 29 e 38,99    | Obesidade Moderada |
| Maior ou igual a 39 | Obesidade Mórbida  |

---

## Tecnologias utilizadas

* Java;
* Estruturas condicionais (`if` e `else if`);
* Estrutura de decisão (`switch`);
* Conversão de dados com `Double.valueOf()`;
* Operações matemáticas;
* Entrada e saída de dados utilizando a classe `IO`.

---

## Como executar

Para executar o programa:

1. Abra o projeto em uma IDE ou ambiente compatível com Java;
2. Certifique-se de possuir a classe `IO` disponível no projeto;
3. Compile o código;
4. Execute o método `main`;
5. Informe os dados solicitados pelo programa.

---

## Exemplo de execução

```text
==========CALCULO DE IMC==========

Digite o seu Nome: João
Digite o seu Genero [M] para Masculino, [F] para Feminino e [N] para não desejo informar: M
Digite o seu peso: 80
Digite a sua altura: 1.80

Nome: João
Gênero: M
IMC: 24.69

Normal
```

---

## Observações

* O gênero deve ser informado utilizando as letras **M**, **F** ou **N**;
* O programa aceita letras maiúsculas e minúsculas;
* Caso seja informado um gênero diferente dos disponíveis, o programa exibirá uma mensagem de erro;
* O peso e a altura devem ser informados utilizando valores numéricos válidos;
* As classificações utilizadas são aquelas definidas diretamente na lógica do programa.

---

## Autor

Projeto desenvolvido como exercício prático de programação em **Java**.
