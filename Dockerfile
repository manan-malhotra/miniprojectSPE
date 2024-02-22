FROM openjdk:17
ADD target/Mini_Project.jar Mini_Project.jar
# ENTRYPOINT ["java", "-jar","Mini_Project.jar"]
# ENTRYPOINT ["bash"]