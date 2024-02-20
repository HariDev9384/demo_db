# Use the official OpenJDK image as a base image
FROM openjdk:21

# Set the working directory in the container
WORKDIR /app

# Create the target directory inside the container
RUN mkdir target

# Copy the JAR file into the container at /app/target
COPY target/demo_db.jar ./target/demo_db.jar

# Specify the command to run your application
CMD ["java", "-jar", "target/demo_db.jar"]
