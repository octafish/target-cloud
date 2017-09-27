FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD target/eureka-service-*.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Dspring.profiles.active=container -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]