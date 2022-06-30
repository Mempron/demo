# Учебныый проект

Всем привет, это мой учебный проект по написанию заглушек на Java 11 с использованием Spring и Maven

Для сборки и запуска проекта надо с помощью git склонировать данный проект или скачать его архив, распаковав после,
после чего открыть терминал из директории проекта и прописать следующую комманду:

> `mvn clean install -U dependency:copy-dependencies`

В папке `targets` появится файл `demo-Final.jar`

После запуска `demo-Final.jar` открываем [`http://localhost:8080/ok`](http://localhost:8080/ok). Если пишет, что `ok`,
то проект собран нормально. После этого можно делать HTTP запросы с JSON типа POST и PUT по следующей ссылке 
[`http://localhost:8080/createPerson`](http://localhost:8080/createPerson).

Запрос с JSON должен быть следующего формата:

> {
>   "name": "Ilya",
>   "salary": 1 000 000
> }

Ответ будет следующего формата:
> {
>   "id", 1
>   "name": "Ilya",
>   "salary": 1 000 000
> }

С каждым запросом будет возрастать ID и по данным из JSON будет создаваться Java объект.