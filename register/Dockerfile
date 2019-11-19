FROM java:8-jre

ADD ./target/demo-1-0.0.1-SNAPSHOT.jar /app/

ENTRYPOINT ["java", "-Xmx200m", "-jar", "/app/demo-1-0.0.1-SNAPSHOT.jar"]
EXPOSE 8090