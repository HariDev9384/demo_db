# Use the official OpenJDK image as a base image
FROM openjdk:21

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container at /app
COPY /demo_db.jar ./demo_db.jar

# Specify the command to run your application
CMD ["java", "-jar", "/app/demo_db.jar"]
