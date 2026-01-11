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

### 5. Evite Codificações (Avoid Encodings)
> "Não codifique o tipo ou o escopo no nome da variável. Deixe o código limpo e use as ferramentas (IDE) a seu favor."

Informações técnicas sobre o tipo de dado não devem fazer parte do nome.
* **Aprendizado:** Abandonei a "Notação Húngara" (ex: `sName` vira `name`) e prefixos de membros (ex: `m_age` vira `age`).
* **Vantagem:** O nome foca no que a variável **representa**, e não em como ela é armazenada na memória. Se o tipo mudar, o nome continua correto.
* **Exemplo:** Implementado em `src/chapter02/AvoidEncoding.java`.

### 6. Evite o Mapeamento Mental (Avoid Mental Mapping)
> "O leitor não deve ter que traduzir mentalmente seus nomes de variáveis em outros nomes que ele já conhece."

Um programador profissional usa sua inteligência para escrever códigos que **todos** entendam, em vez de usar nomes curtos que apenas ele compreende no momento.
* **Aprendizado:** Não use letras soltas (como `a`, `b`, `c`) para economizar digitação. O tempo gasto lendo código é muito maior que o tempo gasto escrevendo.
* **Vantagem:** O código torna-se autoexplicativo e reduz a fadiga mental de quem está dando manutenção.
* **Exemplo:** Implementado em `src/chapter02/MentalMapping.java`.

### 7. Nomes de Métodos (Method Names)
> "Métodos devem ter nomes com verbos ou frases verbais."

Enquanto classes são os substantivos (objetos), os métodos são as ações que esses objetos realizam.
* **Aprendizado:** Use verbos como `postPayment`, `deletePage` ou `save`. Para acessar atributos, siga o padrão `get`, `set` e `is`.
* **Vantagem:** O código se torna uma leitura lógica de "Sujeito + Verbo + Objeto" (ex: `order.calculateTotal()`).
* **Exemplo:** Implementado em `src/chapter02/MethodsAndClasses.java`.

###  A Regra de Ouro: Substantivos vs Verbos
> "O código limpo deve ser lido como uma prosa bem escrita."

Aprendi a distinguir as responsabilidades linguísticas no código:
- **Classes (Substantivos):** Representam os objetos e entidades do sistema. Devem ser nomes como `Customer`, `Order`, `Task`.
- **Métodos (Verbos):** Representam as ações que os objetos realizam. Devem ser nomes como `save()`, `processPayment()` ou `isValid()`.

**Por que isso importa?** Porque transforma chamadas de código em frases lógicas (ex: `payment.process()`), facilitando a leitura e o entendimento imediato da intenção do programador.