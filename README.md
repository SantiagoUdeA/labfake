[![CI/CD Pipeline](https://github.com/SantiagoUdeA/labfake/actions/workflows/build.yml/badge.svg?branch=main)](https://github.com/SantiagoUdeA/labfake/actions/workflows/build.yml) [![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=SantiagoUdeA_labfake&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=SantiagoUdeA_labfake) [![Coverage](https://sonarcloud.io/api/project_badges/measure?project=SantiagoUdeA_labfake&metric=coverage)](https://sonarcloud.io/summary/new_code?id=SantiagoUdeA_labfake) [![Bugs](https://sonarcloud.io/api/project_badges/measure?project=SantiagoUdeA_labfake&metric=bugs)](https://sonarcloud.io/summary/new_code?id=SantiagoUdeA_labfake) [![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=SantiagoUdeA_labfake&metric=code_smells)](https://sonarcloud.io/summary/new_code?id=SantiagoUdeA_labfake) [![Duplicated Lines (%)](https://sonarcloud.io/api/project_badges/measure?project=SantiagoUdeA_labfake&metric=duplicated_lines_density)](https://sonarcloud.io/summary/new_code?id=SantiagoUdeA_labfake)

# Tarea

Ejercicio Fecha de Entrega 14 de Mayo de 2025

Completar el pipeline de despliegue agregando la conexión a alguno proveedor de nube (AWS / Azure DevOps / GCP, etc).
Debe modificar el script (build.yml) para que se despliegue el artefacto JAR en un contenedor de aplicaciones según el
proveedor Cloud que elija.

Debe anexar el paso a paso que siguió en el proceso y las pruebas de ejecución del back sobre la nube.

# Desarrollo

...

# Labfake

Implementation of a Simple App with the next operations:

* Get random nations
* Get random currencies
* Get random Aircraft
* Get application version
* health check

Including integration with GitHub Actions, Sonarqube (SonarCloud), Coveralls and Snyk

### Folders Structure

In the folder `src` is located the main code of the app

In the folder `test` is located the unit tests

### How to install it

Execute:

```shell
$ mvnw spring-boot:run
```
to download the node dependencies

### How to test it

Execute:

```shell
$ mvnw clean install
```

### How to get coverage test

Execute:

```shell
$ mvwn -B package -DskipTests --file pom.xml
```
