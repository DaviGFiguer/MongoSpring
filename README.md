# MongoSpring

**MongoSpring** é um projeto simples construído com **Spring Boot** que demonstra como realizar operações CRUD básicas (Create, Read, Update, Delete) utilizando o **MongoDB** como banco de dados. O objetivo principal do projeto é servir como um teste de conexão e manipulação de dados com o MongoDB usando uma API RESTful.

## 📚 Funcionalidades

O projeto lida com uma entidade chamada `Student`, oferecendo os seguintes endpoints:

- `POST /addStudent`  
  Adiciona um novo estudante ao banco de dados.

- `GET /getStudent/{id}`  
  Retorna os dados de um estudante específico com base no `id`.

- `GET /fetchStudents`  
  Retorna a lista de todos os estudantes armazenados.

- `PUT /updateStudent`  
  Atualiza os dados de um estudante existente (busca pelo `rno`, atualiza `name` e `address`).

- `DELETE /deleteStudent/{id}`  
  Remove um estudante do banco de dados com base no `id`.

## 🛠 Tecnologias

- Java
- Spring Boot
- MongoDB
- Spring Data MongoDB

## ⚙️ Configuração

Antes de rodar a aplicação, é necessário configurar o acesso ao seu banco MongoDB no arquivo `application.properties`.

### Exemplo:
```properties
spring.application.name=MongoSpring

# Defina aqui a porta do servidor, se quiser mudar da padrão (8080)
server.port=8080

# Altere o IP e porta do seu MongoDB conforme seu ambiente
spring.data.mongodb.uri=mongodb://localhost:27017/seuBanco
```

> ⚠️ **Importante**: Certifique-se de que o MongoDB esteja rodando localmente ou forneça uma URI válida para uma instância remota.

## 🚀 Como rodar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seuusuario/MongoSpring.git
   ```

2. Navegue até o diretório do projeto:
   ```bash
   cd MongoSpring
   ```

3. Configure o `application.properties` com suas credenciais do MongoDB.

4. Rode a aplicação


## ✅ Status
