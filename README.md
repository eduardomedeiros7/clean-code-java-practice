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