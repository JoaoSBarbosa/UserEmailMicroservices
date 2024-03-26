

---

# Projeto de Microserviços com Spring Boot

[![Java](https://img.shields.io/badge/Java-11-blue)](https://www.java.com) [![Maven](https://img.shields.io/badge/Maven-3.8.4-blue)](https://maven.apache.org) [![PostgreSQL](https://img.shields.io/badge/PostgreSQL-14-blue)](https://www.postgresql.org) [![RabbitMQ](https://img.shields.io/badge/RabbitMQ-3.9.7-blue)](https://www.rabbitmq.com) [![Spring Boot](https://img.shields.io/badge/Spring_Boot-2.6.2-blue)](https://spring.io/projects/spring-boot)
[![Spring Web](https://img.shields.io/badge/Spring_Web-5.3.13-blue)](https://spring.io/guides/gs/spring-boot/) [![Spring Data JPA](https://img.shields.io/badge/Spring_Data_JPA-2.6.2-blue)](https://spring.io/projects/spring-data-jpa) [![Spring Validation](https://img.shields.io/badge/Spring_Validation-5.3.13-blue)](https://spring.io/guides/gs/validating-form-input/) [![Spring AMQP](https://img.shields.io/badge/Spring_AMQP-2.6.2-blue)](https://spring.io/projects/spring-amqp) [![Spring Mail](https://img.shields.io/badge/Spring_Mail-2.6.2-blue)](https://docs.spring.io/spring-framework/docs/current/reference/html/integration.html#mail)

O presente projeto administra dois microserviços, sendo eles um microserviço de usuário e um microserviço de e-mail. É importante salientar que os microserviços trabalham com a comunicação assíncrona por meio do RabbitMQ.

## Microserviço de Usuário

O microserviço de usuário tem a responsabilidade de cadastrar novos usuários em uma base de dados. As requisições post HTTP com um método POST no endpoint /register devem ser feitas para criar um novo usuário. Conclusão, o usuário é criado e salvo em uma base de dados PostgreSQL e então é enviada uma mensagem com os dados do usuário para um broker do RabbitMQ.

### Tecnologias Utilizadas

- Java
- Maven
- PostgreSQL
- RabbitMQ
- Spring Boot
- Spring Web
- Spring Data JPA
- Spring Validation
- Spring AMQP

### Como Executar

1. Clone o repositório.
2. Navegue até o diretório do microserviço de usuário.
3. Execute o comando `mvn spring-boot:run`.

## Microserviço de E-mail

O microserviço de e-mail é responsável por receber mensagens do broker RabbitMQ e roteá-las para enviar e-mails para os usuários cadastrados.

### Tecnologias Utilizadas

- Java
- Maven
- RabbitMQ
- Spring Boot
- Spring AMQP
- Spring Mail

### Como Executar

1. Clone o repositório.
2. Navegue até o diretório do microserviço de e-mail.
3. Execute o comando `mvn spring-boot:run`.

## Configuração do RabbitMQ

Certifique-se de que o RabbitMQ esteja configurado e em execução. Você pode usar o CloudAMQP como uma opção de hospedagem em nuvem.

## Configuração do SMTP Gmail

Para o envio de e-mails, é necessário configurar as propriedades SMTP do Gmail no arquivo `application.properties` ou `application.yml` do microserviço de e-mail.

```properties
spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username=seu-email@gmail.com
spring.mail.password=sua-senha
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true
```

## Contribuindo

Contribuições são bem-vindas! Sinta-se à vontade para abrir uma issue ou enviar um pull request.

## Estado do Projeto

[![GitHub commits](https://img.shields.io/github/commits-since/usuario/projeto/ultima-versao.svg)](https://github.com/usuario/projeto/commits/master)

---

