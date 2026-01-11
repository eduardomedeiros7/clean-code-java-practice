# Clean Code Studies - Java ☕



Este repositório foi criado para documentar minha jornada de estudos através do livro **"Código Limpo" (Clean Code)** de Robert C. Martin.



## 🎯 Objetivo

Meu foco é praticar os conceitos de qualidade de software, legibilidade e manutenção de código utilizando a linguagem **Java**. À medida que eu avançar na leitura, adicionarei exemplos práticos comparando "código sujo" com "código limpo".
## 📝 Diário de Aprendizado - Capítulo 2: Nomes Significativos

Neste capítulo, aprendi que nomes existem para revelar intenção e facilitar a comunicação entre programadores. Abaixo, os princípios organizados:

### 1. Nomes que Revelam Propósito (Reveal Intent)
> "Se um nome exige um comentário para ser explicado, então ele falhou."

O nome deve responder por que a variável existe, o que ela faz e como é usada.
* **Aprendizado:** Substituímos nomes genéricos por nomes intencionais. No arquivo `RevealIntent.java`, usamos `getHighValueOrders()` em vez de um genérico `getItems()`.
* **Dica:** Use classes e objetos (como `Order`) em vez de tipos genéricos (como `double[]`) para dar significado aos dados.

### 2. Nomes Passíveis de Busca (Searchable Names)
> "O tamanho de um nome deve ser proporcional ao seu escopo."

Aprendi que nomes de uma única letra ou "números mágicos" são difíceis de localizar em projetos grandes.
* **Aprendizado:** Evite números "soltos" como `86400`. O ideal é criar constantes como `SECONDS_IN_A_DAY`.
* **Vantagem:** Facilita alterações rápidas com `Ctrl+F` e torna o código autoexplicativo.
* **Exemplo:** Implementado em `src/chapter02/SearchableNames.java`.

### 3. Evite Desinformação (Avoid Disinformation)
> "O código não deve 'mentir' ou induzir o programador ao erro."

O nome não deve sugerir algo que não é verdade.
* **Nomes de Tipos:** Não chame algo de `accountList` se o tipo real for um `Set` ou `Array`. Use apenas `accounts`.
* **Caracteres Ambíguos:** Evite usar `l` (L minúsculo) ou `O` (Ó maiúsculo), pois se confundem com `1` e `0`.
* **Diferenciação Clara:** Não use nomes quase idênticos (ex: `XYZControllerForHandlingStrings` vs `XYZControllerForStorageStrings`) que confundem o autocomplete do IntelliJ.
* **Exemplo:** Implementado em `src/chapter02/AvoidDisinformation.java`.

### 4. Use Nomes Pronunciáveis (Use Pronounceable Names)
> "Se você não consegue pronunciar um nome, você não consegue discutir sobre ele sem parecer um idiota."

A programação é uma atividade social. Nomes impronunciáveis dificultam a comunicação entre a equipe.
* **Aprendizado:** Evite siglas ou contrações malucas (ex: `modymdhms`). Use palavras reais (ex: `modificationTimestamp`).
* **Vantagem:** Facilita reuniões de revisão de código e ajuda a memória a reter o que aquela variável faz.
* **Exemplo:** Implementado em `src/chapter02/PronounceableNames.java`.