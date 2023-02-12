# Getting Started

### curl

#### new

```terminal
curl -d '{"name":"Bilal", "email":"bilal@gmail.com","dob":"1995-12-17"}' -H "Content-Type: application/json" -X POST http://localhost:8080/api/v1/student
```

#### delete

```terminal
curl -X DELETE http://localhost:8080/api/v1/student/3
```

#### put

```terminal
curl  -H "Content-Type: application/json" -X PUT http://localhost:8080/api/v1/student/1?name=Maria&email=maria@gmail.com
```

### run jar

```cd target```
```java -jar demo-0.0.1-SNAPSHOT.jar```
run in  different port
```java -jar demo-0.0.1-SNAPSHOT.jar --server.port=8081```


### Reference Documentation

For further reference, please consider the following sections:

- [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
- [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.8/maven-plugin/reference/html/)
- [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.8/maven-plugin/reference/html/#build-image)
- [Spring Web](https://docs.spring.io/spring-boot/docs/2.7.8/reference/htmlsingle/#web)
- [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.7.8/reference/htmlsingle/#data.sql.jpa-and-spring-data)

### Guides

The following guides illustrate how to use some features concretely:

- [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
- [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
- [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
- [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
