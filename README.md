# Spring Async, Events, and Scheduling

Este repositório contém exemplos e estudos sobre as funcionalidades de Async, Events e Scheduling no Spring Framework. O objetivo é demonstrar como essas funcionalidades podem ser usadas para construir aplicações Spring Boot mais eficientes e escaláveis.

## Funcionalidades

- **Spring Async:** Demonstração de execução assíncrona de métodos usando `@Async`.
- **Spring Events:** Implementação de eventos customizados e listeners no Spring.
- **Spring Scheduling:** Agendamento de tarefas com `@Scheduled`.

## Tecnologias Utilizadas

- Java 17
- Spring Boot 3
- Maven

## Estrutura do Projeto

O projeto está organizado da seguinte maneira:

- `src/main/java/dev/otthon/asynceventsscheduling/core/services/MailService.java`: Contém exemplos de execução assíncrona usando `@Async`.
- `src/main/java/dev/otthon/asynceventsscheduling/core/publishers/NewUserPublisher.java`: Contém exemplos de publicação e escuta de eventos customizados no Spring.
- `src/main/java/dev/otthon/asynceventsscheduling/core/tasks/SchedulingTasks.java`: Contém exemplos de agendamento de tarefas usando `@Scheduled`.

## Configuração e Execução

### Pré-requisitos

- Java 17 instalado
- Maven instalado

### Passos para Configurar o Projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/otthonleao/spring-async-events-scheduling.git
   cd spring-async-events-scheduling
   ```
2. Compile o projeto usando Maven:
   ```bash
   mvn clean install
   ```
3. Execute o projeto:
    ```bash
    mvn spring-boot:run
    ```
