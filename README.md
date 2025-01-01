# webflux-retrofit

API para consumir datos de tipos de aeronaves desde un servicio externo

## Tecnologías

- Java 17+
- Spring Boot 3+
- Spring WebFlux 3+
- Retrofit 2+

## Ejecución

Para ejecutar la aplicación, se debe ejecutar el siguiente comando:

```shell
mvn spring-boot:run
```

## Consumo de la API

Para consumir la API, se debe realizar una petición GET a la siguiente URL:

```shell
curl -X 'GET' \
  'http://localhost:8083/webflux-retrofit/v1/aircraft/types' \
  -H 'accept: */*'
```

```shell
curl -X 'GET' \
  'http://localhost:8083/webflux-retrofit/v1/aircraft/airports' \
  -H 'accept: */*'
```

## MIT License
Licensed under the MIT License