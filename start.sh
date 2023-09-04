./gradlew clean build -x test
java --add-opens java.base/java.lang=ALL-UNNAMED -javaagent:./lib/spring-instrument-5.3.10.jar  -jar ./build/libs/spring-ltw-demo-0.0.1-SNAPSHOT.jar
