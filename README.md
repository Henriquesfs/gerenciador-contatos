# Gerenciador de Contatos

Projeto em Java de gerenciamento de contatos, permitindo realizar operações básicas de CRUD (Create, Read, Update, Delete) em contatos armazenados em um banco de dados.

---

## Funcionalidades

- **Adicionar Contato**: Adiciona um novo contato no banco de dados.
- **Listar Contatos**: Lista todos os contatos armazenados.
- **Alterar Contato**: Atualiza os dados de um contato existente.
- **Excluir Contato**: Remove um contato do banco de dados.

---

## Tecnologias Utilizadas

- **Java**: Linguagem de programação principal.
- **PostgreSQL**: Banco de dados relacional para armazenamento dos contatos.
- **JDBC**: Para conexão e execução de operações no banco de dados.
- **Maven**: Gerenciador de dependências e build do projeto.

---
## 📂 Estrutura do Projeto

```
GerenciadorContatos
│── src/
│   ├── main/java/com/crud/
│   │   ├── Contato.java          
│   │   ├── ContatoDAO.java      
│   │   ├── DatabaseConnection.java 
│   │   ├── Main.java             
│   ├── main/resources/sql/
│   │   ├── schema.sql            
│── .gitignore
│── pom.xml
│── README.md
```
---
## Pré-requisitos

Antes de executar o projeto, certifique-se de ter instalado:

1. **Java Development Kit (JDK)**: Versão 17 ou superior.
2. **PostgreSQL**: Banco de dados.
3. **Maven**: Para gerenciar as dependências e build do projeto.

---

## Configuração do Banco de Dados

1. Crie um banco de dados no PostgreSQL:
   ```sql
   CREATE DATABASE contatos_db;
2. Crie a tabela contatos:
   ```sql
   CREATE TABLE contatos (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    telefone VARCHAR(20) NOT NULL,
    email VARCHAR(100) NOT NULL
);
3. Configure as credenciais do banco de dados(db_url,db_user,db_password)

---
## Como Executar o Projeto

Clone o repositório

```
https://github.com/Henriquesfs/gerenciador-contatos.git

```
Siga as instruções do console para interagir com o gerenciador de contatos.

---
📸 Demonstração

Exemplo de menu no terminal:

```
Insira uma ação:
[1] Adicionar Contato
[2] Listar Contatos
[3] Alterar Contato
[4] Excluir Contato
[5] Sair
```
---
📜 Licença

Este projeto está sob a licença MIT. Sinta-se à vontade para usá-lo e modificá-lo.

---


