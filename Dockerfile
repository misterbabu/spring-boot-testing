FROM openjdk:8
EXPOSE 2222
ADD target/spring-boot.jar spring-boot.jar
ENTRYPOINT ["java","-jar","/spring-boot.jar"]