FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY . .

RUN chmod +x mvnw

# 🔥 FORCE spring boot build properly
RUN ./mvnw clean package spring-boot:repackage -DskipTests

EXPOSE 8080

CMD ["sh", "-c", "java -jar target/*.jar"]