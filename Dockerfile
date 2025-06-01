
FROM eclipse-temurin:17-jdk-jammy

# Create a non-root user and group (e.g., user: spring, uid/gid: 1000)
RUN groupadd -g 1000 spring && \
    useradd -u 1000 -g spring -m spring

WORKDIR /app

# Copy the JAR file and adjust ownership to the new user
COPY target/spring-azure-app-1.0.0.jar app.jar
RUN chown spring:spring /app/app.jar

# Switch to the non-root user
USER spring

ENTRYPOINT ["java", "-jar", "/app/app.jar"]
