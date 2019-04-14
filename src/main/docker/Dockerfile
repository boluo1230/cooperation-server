FROM adoptopenjdk/openjdk11
VOLUME /tmp
ADD cooperation.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS=""

EXPOSE 8080
ENTRYPOINT java -Djava.security.egd=file:/dev/./urandom -Dspring.profiles.active=dev -jar /app.jar