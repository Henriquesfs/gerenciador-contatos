# Gerenciador de Contatos

Um projeto simples em Java para gerenciar contatos, utilizando PostgreSQL como banco de dados. Este projeto permite realizar operações básicas de CRUD (Create, Read, Update, Delete) em contatos armazenados em um banco de dados.

---

## Funcionalidades

- **Adicionar Contato**: Insere um novo contato no banco de dados.
- **Listar Contatos**: Exibe todos os contatos armazenados.
- **Alterar Contato**: Atualiza os dados de um contato existente.
- **Excluir Contato**: Remove um contato do banco de dados.

---

## Tecnologias Utilizadas

- **Java SE**: Linguagem de programação principal.
- **PostgreSQL**: Banco de dados relacional para armazenamento dos contatos.
- **JDBC**: API para conexão e execução de operações no banco de dados.
- **Maven**: Gerenciador de dependências e build do projeto.

---
## 📂 Estrutura do Projeto

```
GerenciadorContatos
│── src/
│   ├── main/java/com/crud/
│   │   ├── Contato.java          # Classe modelo
│   │   ├── ContatoDAO.java       # Operações de CRUD
│   │   ├── DatabaseConnection.java  # Conexão com PostgreSQL
│   │   ├── Main.java             # Menu interativo do sistema
│   ├── main/resources/sql/
│   │   ├── schema.sql            # Script para criar a tabela no banco
│── .gitignore
│── pom.xml
│── README.md
```
---
## Pré-requisitos

Antes de executar o projeto, certifique-se de ter instalado:

1. **Java Development Kit (JDK)**: Versão 17 ou superior.
2. **PostgreSQL**: Banco de dados instalado e configurado.
3. **Maven**: Para gerenciar as dependências e build do projeto.

---

## Configuração do Banco de Dados

1. Crie um banco de dados no PostgreSQL:
   ```sql
   CREATE DATABASE contatos_db;
