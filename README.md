# Projeto exemplo de comunicação assíncrona entre dois microserviços usando kafka

Esse projeto demonstra a utilização do kafka como message broker para a realização de envio e consumo de mensagem. 


## 📦 Implementação realizada

Foram criados dois microserviços, um consumidor e um produtor, criamos dois projetos spring boot com as dependencias spring web e spring apache for kafka.

## 🛠️ Tecnologias utilizadas

* [Java 21](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html) 
* [Spring Boot](https://spring.io/projects/spring-boot) 
* [Kafka](https://kafka.apache.org/) 


## 🖇️ Executando o projeto

suba o servidor do kafka e os dois microserviços e utilize uma ferramenta para realizar requisições.dispare um requisição post para http://localhost:8081/mensagem, enviando uma string qualquer. verifique se a string 
foi enviada pelo microserviço escritor e consumida pelo microserviço leitor.





---
