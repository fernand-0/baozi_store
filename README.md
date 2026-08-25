# Baozi Store - API RESTful

API desenvolvida como atividade prática para a disciplina de desenvolvimento web back-end.

## Tecnologias Utilizadas
* Java 21
* Spring Boot (Spring Web, Data JPA)
* H2 Database (Banco de dados em memória)
* Maven

## Estrutura da API e Endpoints

### Clientes
* `POST /clientes`: cadastra um novo cliente na base de dados.
* `GET /clientes`: retorna a lista completa de clientes cadastrados.
* `GET /clientes/{id}`: retorna os dados de um cliente especifico por ID.
* `DELETE /clientes/{id}`: remove o registro de um cliente por ID.

### Produtos
* `POST /produtos`: cadastra um novo produto no catálogo.
* `GET /produtos`: retorna a lista completa de produtos.
* `GET /produtos/{id}`: retorna os dados de um produto especifico por ID.
* `DELETE /produtos/{id}`: remove um produto do catálogo por ID.

### Pedidos
* `POST /pedidos`: registra um novo pedido vinculando cliente e produto.
* `GET /pedidos`: retorna o histórico de pedidos efetuados.
* `GET /pedidos/{id}`: retorna os detalhes de um pedido especifico por ID.
* `DELETE /pedidos/{id}`: cancela ou remove um pedido registrado por ID.
