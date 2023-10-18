<h1 align="center">
  Desafio Back-end AmeDigital
</h1>

<p align="center">
 <img src="https://img.shields.io/static/v1?label=Linkedin&message=@tgribeiro&color=8257E5&labelColor=000000" alt="@tgribeiro" />
 <img src="https://img.shields.io/static/v1?label=Tipo&message=Desafio&color=8257E5&labelColor=000000" alt="Desafio" />
</p>

# Objetivo

Desenvolver uma API que gerencie os dados de alguns dos planetas de Star Wars. Para isto devemos criar um (CRUD) que faz parte [desse desafio](https://github.com/AmeDigital/challenge-back-end-hit) para desenvolvedores back-end.

## Requisitos:
- [x]  A API deve ser REST
- [x] Para cada planeta, os seguintes dados devem ser obtidos do banco de dados da aplicação, sendo inserido manualmente:
  - [x] Nome
  - [x] Clima
  - [x] Terreno
- [x] Para cada planeta também devemos ter a quantidade de aparições em filmes, que podem ser obtidas pela API pública do Star Wars: https://swapi.info/planets.

## Funcionalidades desejadas:
- [x] Adicionar um planeta (com nome, clima e terreno)
- [ ] Listar planetas
- [ ] Buscar por nome
- [ ] Buscar por ID
- [ ] Remover planeta

## Práticas adotadas

- SOLID, DRY, YAGNI, KISS
- API REST
- Consultas com Spring Data JPA
- Injeção de Dependências
- Tratamento de respostas de erro
- Geração automática do Swagger com a OpenAPI 3
- Testes automatizados
- Uso de DTOs para a API

## Tecnologias

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [SpringDoc OpenAPI 3](https://springdoc.org/v2/#spring-webflux-support)
- [PostgreSQL](https://www.postgresql.org/download/)

## Como Executar

- Clonar repositório git
- Construir o projeto:
```
$ ./mvnw clean package
```
- Executar a aplicação:
```
$ java -jar target/todolist-0.0.1-SNAPSHOT.jar
```

A API poderá ser acessada em [localhost:8080](http://localhost:8080).
O Swagger poderá ser visualizado em [localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## API Endpoints

Para fazer as requisições HTTP abaixo, foi utilizada a ferramenta [curl](https://curl.se/):

- Adicionar um planeta (com nome, clima e terreno)
```
$ curl -X POST -H 'Content-Type: application/json' -d '{"name": "Hoth","climate": "frozen","terrain": "tundra, ice caves, mountain ranges","filmCount": "1"}' http://localhost:8080/planets 

[
  {
  "name": "Hoth",
  "climate": "frozen",
  "terrain": "tundra, ice caves, mountain ranges",
  "filmCount": "1"
  }
]
```