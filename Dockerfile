FROM eclipse-temurin:17-jdk

WORKDIR /app

# 1. copy project
COPY . .

# 2. make mvnw executable
RUN chmod +x mvnw

# 3. build jar (THIS LINE YOU ASKED)
RUN ./mvnw clean package -DskipTests

# 4. run app
EXPOSE 8080

CMD ["java","-jar","target/lead-management-0.0.1-SNAPSHOT.jar"]