FROM  eclipse-temurin:17-jdk
EXPOSE 8080
COPY build/libs/springboot-minikube.jar springboot-minikube.jar
ENTRYPOINT ["java","-jar","/springboot-minikube.jar"]