**java-boilerplate**

**Build**

`mvn clean install`

**Run**

`java -jar java-boilerplate-1.0-SNAPSHOT.jar`

**Test**

- GET: http://localhost:8080/getPerson?id=1
- GET: http://localhost:8080/getAllPersons
- PUT: http://localhost:8080/createPerson
request: { "name": "maria" }
response: { "id": 6, "name": "maria"}
- POST: http://localhost:8080/updatePerson
request: { "id": 6, "name": "renzo"}
response: { "id": 6, "name": "renzo"}
- DELETE: http://localhost:8080/deletePerson?id=6

Using the following

- Java 8
- Spring Boot
- Hibernate / JPA
- React
- MySQL
- Docker
- Tomcat
- Security?

Utils

C:\Program Files\MySQL\MySQL Server 8.0\bin>mysqldump.exe -e -uroot -proot -hlocalhost boilerplatedb > D:\boilerplatedb.sql