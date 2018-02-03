FROM openjdk:8
ADD ./build/libs/rabbitmq-consumer-service-0.0.1.jar ./rabbitmq-consumer-service-0.0.1.jar
EXPOSE 39991
ENTRYPOINT ["java","-jar","rabbitmq-consumer-service-0.0.1.jar"]