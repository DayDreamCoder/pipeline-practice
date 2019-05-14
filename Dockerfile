FROM java:8
VOLUME /tmp
ADD pipeline-practice-0.0.1-SNAPSHOT.jar app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8087
ENTRYPOINT ["java","-jar","/app.jar"]