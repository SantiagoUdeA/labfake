FROM openjdk:11
EXPOSE 8080
ADD target/labfaker-0.0.1-SNAPSHOT.jar labfaker-0.0.1-SNAPSHOT.jar
LABEL authors="Santiago Zapata Barahona"

ENTRYPOINT ["jav", "-jar", "/labfaker-0.0.1-SNAPSHOT.jar"]