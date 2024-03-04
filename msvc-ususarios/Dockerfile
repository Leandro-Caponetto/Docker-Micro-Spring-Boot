FROM openjdk:17.0.2

WORKDIR /app

COPY ./target/msvc-ususarios-0.0.1-SNAPSHOT.jar .

EXPOSE 8001

ENTRYPOINT ["java", "-jar", "msvc-ususarios-0.0.1-SNAPSHOT.jar"]