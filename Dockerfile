FROM openjdk:17-jdk-slim
COPY /starter_code/target/auth-course.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]