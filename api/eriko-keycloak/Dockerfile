FROM arm64v8/openjdk:17.0.2

ENV JAR_FILE=eriko-keycloak.jar
ENV JAVA_DEBUG="-agentlib:jdwp=transport=dt_socket,address=*:5005,server=y,suspend=n"

WORKDIR /app

COPY ./target/${JAR_FILE}  ./

ENTRYPOINT java $JAVA_DEBUG -jar $JAR_FILE

