
# Sistema de Vendas

Um sistema de vendas desenvolvido em Java utilizando Spring Boot, Bootstrap e PostgreSQL. Este projeto tem como objetivo fornecer uma solução completa para gerenciamento de vendas, incluindo funcionalidades para cadastro de produtos, clientes, e processamento de vendas.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação principal.
- **Spring Boot**: Framework para desenvolvimento do backend.
- **Bootstrap**: Framework front-end para design responsivo. [Pendente]
- **PostgreSQL**: Banco de dados relacional.

## Funcionalidades

- Cadastro de produtos.
- Cadastro de clientes.
- Processamento e gerenciamento de vendas.
- Relatórios de vendas. [Pendente]
- Interface de usuário responsiva. [Pendente]

## Pré-requisitos

Antes de começar, certifique-se de ter os seguintes softwares instalados:

- [Java JDK 11 ou superior](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [PostgreSQL](https://www.postgresql.org/download/)
- [Node.js](https://nodejs.org/) (para gerenciar pacotes front-end)

## Configuração do Ambiente

1. **Clone o Repositório**

   ```bash
   git clone https://github.com/seu-usuario/sistema-de-vendas.git
   ```

2. **Configuração do Banco de Dados**

   - Crie um banco de dados no PostgreSQL com o nome `sistema_de_vendas`.
   - Configure as credenciais no arquivo `src/main/resources/application.properties`:

     ```properties
     spring.datasource.url=jdbc:postgresql://localhost:5432/sistema_de_vendas
     spring.datasource.username=seu_usuario
     spring.datasource.password=sua_senha
     ```

3. **Instalação das Dependências**

   Navegue até o diretório do projeto e execute o comando Maven para instalar as dependências:

   ```bash
   mvn install
   ```

4. **Executar o Projeto**

   Para iniciar o servidor Spring Boot, execute:

   ```bash
   mvn spring-boot:run
   ```

   O servidor estará disponível em `http://localhost:8080`.

## Estrutura do Projeto

Em andamento...

## Contato

Se você tiver alguma dúvida, sinta-se à vontade para entrar em contato:

- [Jéssica Figueiredo](mailto:jhessikafeitosa@hotmail.com.br)
- [LinkedIn](https://www.linkedin.com/in/jess-figueiredo/)
