FROM openjdk:17
EXPOSE 8080
ADD target/springboot-ci-cd-pipeline.jar springboot-ci-cd-pipeline.jar
ENTRYPOINT ["java","jar","/springboot-ci-cd-pipeline.jar]


