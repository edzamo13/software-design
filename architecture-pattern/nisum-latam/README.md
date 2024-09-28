#  nisum-latam


POC
user-registration-app


## Table of Contents
1. [user-registration-app](#one-binder)
2. [Descripción](#functional-reactive)
3. [java](#java-collections)
7. [FAQs](#faqs)

# user-registration-app

![nisumHexagonal (1)](https://github.com/user-attachments/assets/6e1365b0-d4cb-41d2-8cea-10d90a76c854)

## Descripción

Esta aplicación Spring Boot proporciona una API RESTful para la creación y gestión de usuarios. Utiliza H2 como base de datos en memoria y Swagger para la documentación de la API. Todos los endpoints aceptan y retornan exclusivamente JSON, incluyendo los mensajes de error.

## Endpoints
swagger: http://localhost:8080/doc/swagger-ui/index.html#/

### Registro de Usuario

- **Método**: `POST`,`GET`
- **Ruta**: `/api/user`
- **Descripción**: Registra un nuevo usuario en el sistema.

#### Solicitud

La solicitud debe ser un JSON con el siguiente formato:

```json
{
  "name": "Juan Rodriguez",
  "email": "juan@rodriguez.org",
  "password": "hunter2",
  "phones": [
    {
      "number": "1234567",
      "citycode": "1",
      "contrycode": "57"
    }
  ]
}



```
## Requisitos

Antes de comenzar, asegúrate de tener los siguientes requisitos instalados en tu máquina:

- [Java 17](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html) o superior
- [Gradle](https://gradle.org/install/) (opcional, ya que Gradle Wrapper está incluido en el proyecto)

## Clonar el Repositorio

Primero, clona el repositorio en tu máquina local:

```bash
git clone https://github.com/edzamo13/nisum-latam.git
cd nisum-latam
```

### Swagger
### TOKEN
Para usar los endPoint se detalla a continucacion:

```
curl --location --request POST 'localhost:8080/login?user=test&encryptedPass=test' \
--header 'Cookie: JSESSIONID=1AE3485ED467997C52A2A015E0257FA2'

```
### Createuser

```
curl --location 'http://localhost:8080/api/user' \
--header 'Content-Type: application/json' \
--header 'Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJqdGkiOiJlc3Bpbm96YWpnZUpXVCIsInN1YiI6InRlc3QiLCJhdXRob3JpdGllcyI6WyJST0xFX1VTRVIiXSwiaWF0IjoxNzIzNzM5MTI3LCJleHAiOjE3MjQ2MDMxMjd9.9Jbuz3o2s_GDqab0X8xqwiIs3GzdSszQoib5mnhrxzDdK_pEBvc5SapbGxaUrcrF0ndfJ_u87M9fe_RER6vr1Q' \
--header 'Cookie: JSESSIONID=1AE3485ED467997C52A2A015E0257FA2' \
--data-raw '{
    "name": "Juan Rodriguez",
    "email": "juan@rodriguez.org",
    "password": "Valid1@Password",
    "phones": [
        {
            "number": "1234567",
            "citycode": "1",
            "contrycode": "57"
        },
        {
            "number": "9898989",
            "citycode": "1",
            "contrycode": "57"
        }
    ]
}'

```

### Find All

```
curl --location 'localhost:8080/api/user' \
--header 'Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJqdGkiOiJlc3Bpbm96YWpnZUpXVCIsInN1YiI6InRlc3QiLCJhdXRob3JpdGllcyI6WyJST0xFX1VTRVIiXSwiaWF0IjoxNzIzNzM5MTI3LCJleHAiOjE3MjQ2MDMxMjd9.9Jbuz3o2s_GDqab0X8xqwiIs3GzdSszQoib5mnhrxzDdK_pEBvc5SapbGxaUrcrF0ndfJ_u87M9fe_RER6vr1Q' \
--header 'Cookie: JSESSIONID=1AE3485ED467997C52A2A015E0257FA2'
```

### Collection Postman

https://github.com/edzamo13/nisum-latam/blob/main/nisum.postman_collection.json

# Getting Started


### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/3.3.2/gradle-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.3.2/gradle-plugin/packaging-oci-image.html)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.3.2/reference/htmlsingle/index.html#web)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.3.2/reference/htmlsingle/index.html#using.devtools)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/3.3.2/reference/htmlsingle/index.html#data.sql.jpa-and-spring-data)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

