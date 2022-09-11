FROM openjdk:16.0.1

VOLUME /tmp

EXPOSE 8080

ADD /target/Spring-rest-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT [ "java"," -jar", "/app.jar" ]
