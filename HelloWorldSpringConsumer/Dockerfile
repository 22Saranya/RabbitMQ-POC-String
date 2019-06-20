FROM openjdk:11-jdk-stretch

WORKDIR /src/main/SpringBootHelloWorld

ADD /target/HelloWorldSpringConsumer-1.0-SNAPSHOT.jar src/app/HelloWorldSpringConsumer-1.0-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","HelloWorldSpringConsumer-1.0-SNAPSHOT.jar"]