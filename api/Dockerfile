FROM openjdk:17-alpine

ENV JAR_FILE=eriko.jar
ENV JAVA_DEBUG="-agentlib:jdwp=transport=dt_socket,address=*:5005,server=y,suspend=n"

WORKDIR /app

COPY ./target/${JAR_FILE}  ./

ENTRYPOINT java $JAVA_DEBUG -jar $JAR_FILE

