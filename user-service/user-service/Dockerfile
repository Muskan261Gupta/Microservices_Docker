FROM openjdk:11
EXPOSE 8083
ADD target/user-service.jar user-service.jar
ENTRYPOINT ["java","-jar","/user-service.jar"]