FROM openjdk:11
EXPOSE 8080
ADD target/labfaker.jar labfaker.jar
LABEL authors="Santiago Zapata Barahona"

ENTRYPOINT ["java", "-jar", "/labfaker.jar"]