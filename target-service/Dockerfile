FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
COPY target/target-service-*.jar /opt/spring-cloud/app.jar
COPY wait-start.sh /opt/spring-cloud/wait-start.sh
RUN sh -c 'touch /opt/spring-cloud/app.jar'
RUN chmod 755 /opt/spring-cloud/wait-start.sh
ENTRYPOINT /opt/spring-cloud/wait-start.sh