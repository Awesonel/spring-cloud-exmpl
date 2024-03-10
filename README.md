# Пример проекта Spring Cloud: Producer и Consumer

Проект, представленный здесь, является демонстрацией архитектуры микросервисов с использованием Spring Cloud. В нем реализованы два основных компонента: Producer (поставщик) и Consumer (потребитель). Producer имитирует предоставление данных, а Consumer выполняет запрос к Producer и получает эти данные.

## Описание компонентов

### Producer (data-producer)
- **Описание**: Простой микросервис, предоставляющий эмулированные данные.
- **Реализация**: Использует Spring Boot и Spring Cloud для обеспечения масштабируемости и отказоустойчивости.
- **Эндпоинты**:
  - `/data` - возвращает эмулированные данные.

### Consumer (data-consumer)
- **Описание**: Микросервис, который выполняет запрос к сервису Producer для получения данных.
- **Реализация**: Использует Spring Boot и Spring Cloud, а также Feign для упрощения взаимодействия с микросервисами.
- **Эндпоинты**:
  - `/consume-data` - выполняет запрос к сервису Producer для получения данных.

## Запуск проекта

1. **Запуск Eureka Server:**
   - Перейдите в директорию `eureka-server`.
   - Выполните `./mvnw spring-boot:run` (или `mvn spring-boot:run`, если Maven установлен).
   - Eureka Server будет доступен по адресу [http://localhost:8761/](http://localhost:8761/).

2. **Запуск Producer (data-producer):**
   - Перейдите в директорию `data-producer`.
   - Выполните `./mvnw spring-boot:run` (или `mvn spring-boot:run`).
   - Producer будет зарегистрирован в Eureka и готов обслуживать запросы.

3. **Запуск Consumer (data-consumer):**
   - Перейдите в директорию `data-consumer`.
   - Выполните `./mvnw spring-boot:run` (или `mvn spring-boot:run`).
   - Consumer также будет зарегистрирован в Eureka и готов обращаться к сервису Producer.

## Взаимодействие с микросервисами

- Откройте [http://localhost:8761/](http://localhost:8761/) для просмотра статуса регистрации микросервисов в Eureka.
- Выполните GET-запрос к Consumer по адресу [http://localhost:8082/consume-data](http://localhost:8082/consume-data) для получения эмулированных данных от Producer.
