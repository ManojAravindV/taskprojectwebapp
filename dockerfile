FROM eclipse-temurin:17
COPY target/taskprojectwebapp.jar taskprojectwebapp.jar
CMD [ "java","-jar","taskprojectwebapp.jar" ]