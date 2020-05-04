FROM openjdk:8-jre-slim
EXPOSE 8080
ADD /hellok8s.jar hellok8s.jar
ENTRYPOINT ["java", "-jar", "hellok8s.jar"]