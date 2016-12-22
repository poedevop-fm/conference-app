FROM java:8

MAINTAINER poedevop-fm <smart.training98@gmail.com>
VOLUME /tmp
ADD target/monitoring*.jar app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]