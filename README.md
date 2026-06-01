# Lista de Exercícios VIII — Algoritmos e Programação

**Centro Universitário UNA**  
Programação de Soluções Computacionais  
Professor: Daniel Henrique Matos de Paiva

---

## Sobre

Resolução da Lista VIII da disciplina de Algoritmos e Programação, com foco em **funções/métodos estáticos** em Java. Os exercícios cobrem criação de funções com parâmetros, retorno de valores, loops de repetição e separação de responsabilidades.

---

## Exercícios

| # | Descrição | Conceito principal |
|---|-----------|-------------------|
| 1 | Triângulo onde a linha `i` repete o número `i` exatamente `i` vezes | Funções, laços aninhados |
| 2 | Triângulo onde a linha `i` exibe os números de `1` até `i` | Funções, laços aninhados |
| 3 | Soma de três argumentos passados para uma função | Parâmetros e retorno |
| 4 | Retorna `'P'` se o argumento for positivo, `'N'` se for zero ou negativo | Retorno de `char`, condicionais |
| 5 | Função `somaImposto` que calcula o custo final com imposto sobre vendas | Parâmetros, cálculo numérico |
| 6 | Conversor de horário 24h para 12h com múltiplas funções e loop de repetição | Múltiplas funções, loop `do-while` |

---

## Estrutura dos arquivos

```
Lista8/
├── Exercicio1.java
├── Exercicio2.java
├── Exercicio3.java
├── Exercicio4.java
├── Exercicio5.java
└── Exercicio6.java
```

---

## Como executar

### Pré-requisitos

- Java JDK 8 ou superior instalado
- Terminal / prompt de comando

### Compilar e rodar

```bash
# Compilar
javac Exercicio1.java

# Executar
java Exercicio1
```

Repita o processo para cada exercício substituindo o número correspondente.

---

## Observações

- Todos os programas leem a entrada via `Scanner` no terminal.
- O Exercício 6 possui um loop `do-while` que permite repetir a conversão de horários sem reiniciar o programa — digite `s` para continuar ou `n` para encerrar.
- O código segue as convenções de indentação padrão do Java (4 espaços).
