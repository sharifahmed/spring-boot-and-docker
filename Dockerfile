FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8000
COPY greetings-0.0.1.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
