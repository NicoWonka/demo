FROM openjdk:8
VOLUME /tmp
ADD target/ms-springbt-cfg-psql-1.0.0.jar ms-springbt-cfg-psql.jar
RUN bash -c 'touch /ms-springbt-cfg-psql.jar'
ENTRYPOINT ["java","-jar","/ms-springbt-cfg-psql.jar"]