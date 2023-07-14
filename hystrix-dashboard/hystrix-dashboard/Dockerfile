FROM openjdk:11
EXPOSE 9000
ADD target/hystrix-dashboard.jar hystrix-dashboard.jar
ENTRYPOINT ["java","-jar","/hystrix-dashboard.jar"]