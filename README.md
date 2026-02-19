# 📚 Sistema de Gestão de Alunos - API REST

Este projeto é uma API robusta desenvolvida para a gestão de registros estudantis, focada em escalabilidade, qualidade de código e automação de infraestrutura. Foi construído para demonstrar proficiência no ecossistema **Java 21**, **Spring Boot** e práticas modernas de **DevOps** com **Docker**. Além de um front end construido com **Angular** e arquitetura standalone.

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java 21 (LTS).
* **Frontend:** Angular 19+ com signals e arquitetura standalone.
* **Framework:** Spring Boot 3.x.
* **Banco de Dados:** PostgreSQL (Relacional).
* **Persistência:** Spring Data JPA / Hibernate.
* **Containerização:** Docker & Docker Compose.
* **Testes:** JUnit 5 & Mockito (Testes Unitários).
* **Gerenciamento de Dependências:** Maven.

## 🏗️ Arquitetura e Boas Práticas

O projeto segue os padrões de mercado exigidos para desenvolvedores Fullstack e Backend:
* **Padrão Repository:** Separação clara entre a lógica de persistência e a regra de negócio.
* **RESTful API:** Endpoints estruturados para operações CRUD.
* **Qualidade de Código:** Implementação de testes unitários automatizados para garantir a integridade das funcionalidades.
* **Infraestrutura como Código:** Uso de Docker para garantir que o ambiente de desenvolvimento seja idêntico ao de produção.
* **Busca Otimizada:** Sistema de filtro por nome que ignora maiúsculas/minúsculas, executado no lado do servidor (Server-side) para melhor performance.

Integração de Segurança: Configuração de políticas de CORS para comunicação segura entre o frontend (4200) e o backend (8080).

## 🚀 Como Executar o Projeto

### Pré-requisitos
* Docker e Docker Compose instalados.

### Passos
1. **Clonar o repositório:**
   ```bash
   git clone [https://github.com/cinema777/gestao-alunos-api.git](https://github.com/cinema777/gestao-alunos-api.git)
   ```

2. **Subir o ambiente (API + Banco de Dados)**

Execute o comando abaixo para construir as imagens e iniciar os containers da API e do banco PostgreSQL:

```
docker-compose up --build
```

Para iniciar o frontend Angular:
```
ng serve
```

A API estará disponível em: http://localhost:8080/api/alunos
Front end em: http://localhost:4200/

3. Executar Testes Unitários
Para validar a qualidade do código e garantir que as regras de negócio estão funcionando corretamente, utilize o Maven Wrapper:

```
./mvnw test
```
