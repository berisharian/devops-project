# Use an official Maven image for ARM architecture to build the app
FROM arm64v8/maven:3.8.5-openjdk-17 AS build

# Set the working directory
WORKDIR /app

# Copy the project files to the container
COPY . .

# Package the application
RUN mvn clean package -DskipTests

# Use an official OpenJDK runtime as a parent image for ARM architecture
FROM arm64v8/openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the packaged application from the build stage
COPY --from=build /app/target/*.jar app.jar

# Expose the port the app runs on (if needed)
EXPOSE 8181

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]

