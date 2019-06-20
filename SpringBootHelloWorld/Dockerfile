FROM openjdk:11-jdk-stretch

WORKDIR /src/main/SpringBootHelloWorld

ADD /target/SpringBootHelloWorld-1.0-SNAPSHOT.jar src/app/SpringBootHelloWorld-1.0-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","SpringBootHelloWorld-1.0-SNAPSHOT.jar"]