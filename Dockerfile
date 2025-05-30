
FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app
COPY target/spring-azure-app-1.0.0.jar app.jar
ENTRYPOINT ["java", "-jar", "/app/app.jar"]

