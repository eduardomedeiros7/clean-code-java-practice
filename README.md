# Clean Code Studies - Java ☕

Este repositório foi criado para documentar minha jornada de estudos através do livro **"Código Limpo" (Clean Code)** de Robert C. Martin.

## 🎯 Objetivo
Meu foco é praticar os conceitos de qualidade de software, legibilidade e manutenção de código utilizando a linguagem **Java**. À medida que eu avançar na leitura, adicionarei exemplos práticos comparando "código sujo" com "código limpo".

## 🛠 O que pretendo praticar:
- Nomes significativos (Meaningful Names).
- Funções pequenas e com responsabilidade única.
- Comentários produtivos.
- Tratamento de erros profissional.
- Uso de variáveis e padrões em **Inglês**.

---
*Status: Em leitura e desenvolvimento 🚀*

---
## 📝 Diário de Aprendizado

### Capítulo 2: Nomes Significativos (Searchable Names)
Neste capítulo, aprendi que o código deve ser escrito para humanos.
- **Números Mágicos:** Aprendi que usar números "soltos" como `86400` dificulta a manutenção. O ideal é criar constantes como `SECONDS_IN_A_DAY`.
- **Busca Eficiente:** Nomes passíveis de busca facilitam encontrar erros e fazer alterações rápidas com `Ctrl+F`.
- **Exemplo Prático:** Implementado em `src/chapter02/SearchableNames.java`.

### 🎯 Conceito: Nomes que Revelam seu Propósito (Reveal Intent)

> "A diferença entre um nome comum e um nome limpo é que o nome limpo responde: Por que existe? O que faz? Como é usado?"

Nesta parte do estudo, aprendi que se um nome exige um comentário para explicar o que ele é, então o nome falhou em sua missão principal.

#### ❌ O que evitar (Código Obscuro)
No exemplo abaixo, o código funciona perfeitamente para a máquina, mas é um mistério para o humano:
```java
// O que é 'list'? O que tem na posição '0'? O que é '1000'?
public List<double[]> getItems(List<double[]> list) {
    List<double[]> list1 = new ArrayList<>();
    for (double[] x : list) {
        if (x[0] > 1000) {
            list1.add(x);
        }
    }
    return list1;
    
    #### 3. Evite Desinformação (Avoid Disinformation)
O código não deve "mentir" para o programador. 
- **Não use nomes de tipos:** Evite chamar algo de `accountList` se for um array. Use apenas `accounts`.
- **Cuidado com caracteres:** Letras como `l` (L) e `O` (O) podem ser confundidas com `1` e `0`.
- **Diferencie nomes claramente:** Não crie variáveis com nomes quase idênticos que confundem o autocomplete do IntelliJ.
}