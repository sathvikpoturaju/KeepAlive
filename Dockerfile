FROM jelastic/maven:3.9.5-openjdk-21 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:21-jdk-slim
COPY --from=build /target/KeepAlive-0.0.1-SNAPSHOT.jar KeepAlive.jar
EXPOSE 4000
ENTRYPOINT ["java","-jar","KeepAlive.jar"]