FROM openjdk:8
COPY ${JAR_FILE} EurekaGCPDataBase-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","EurekaGCPDataBase-0.0.1-SNAPSHOT.jar"]
