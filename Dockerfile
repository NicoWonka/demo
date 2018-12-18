FROM java:8-jre
VOLUME /tmp
ADD target/ms-springbt-cfg-psql-1.0.1.jar ms-demo.jar
RUN bash -c 'touch /ms-demo.jar'
ENTRYPOINT ["java","-jar","/ms-demo.jar"]