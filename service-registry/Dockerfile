FROM frolvlad/alpine-oraclejre8:slim
ADD ["target/service-registry-0.0.1-SNAPSHOT.jar","app.jar"]
EXPOSE 8900 8787
ENV JAVA_OPTS="-Xdebug -Xrunjdwp:server=y,transport=dt_socket,address=8787,suspend=n"
RUN sh -c 'touch /app.jar'
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -jar /app.jar" ]