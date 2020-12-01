# Stage 1
FROM maven:3.6.3-jdk-11-slim AS MAVEN_BUILD

WORKDIR /build/

COPY pom.xml .

RUN mvn dependency:go-offline

COPY src /build/src/

RUN mvn package -DskipTests

# Stage 2
FROM openjdk:11-jre-slim

WORKDIR /app

COPY --from=MAVEN_BUILD /build/target/app.jar /app/

ENTRYPOINT ["java", "-jar", "app.jar"]