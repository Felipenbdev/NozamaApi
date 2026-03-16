# Estágio de Build
FROM eclipse-temurin:21-jdk-jammy AS build
WORKDIR /app

# Copia os arquivos de configuração do Maven/Gradle e o código fonte
COPY . .

# Executa o build (ajuste para ./gradlew se usar Gradle)
RUN ./mvnw clean package -DskipTests

# Estágio de Execução
FROM eclipse-temurin:21-jdk-jammy
WORKDIR /app

# Copia apenas o JAR gerado no estágio anterior
COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080

# Comando para rodar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]