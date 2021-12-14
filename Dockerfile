# Official maven/Java 8 image to create buidl artifact
FROM maven:3.8-jdk-11 as builder 

#Copy the local code to container image
WORKDIR /app
COPY pom.xml .
COPY src ./src
COPY kubernetes-config.yaml .

# Build a release artifact
RUN mvn package -DskipTests

#Use AdoptOpenJDK for the base image
FROM adoptopenjdk/openjdk11:alpine-jre

# Copy jar to the production image from the builder stage
COPY --from=builder /app/target/EurekaGCPDataBase-0.0.1-SNAPSHOT.jar /EurekaGCPDataBase-0.0.1-SNAPSHOT.jar

#Run the webservice
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/EurekaGCPDataBase-0.0.1-SNAPSHOT"]