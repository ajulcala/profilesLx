FROM openjdk:11
VOLUME /tmp
EXPOSE 8010
ADD ./target/profiles-0.0.1-SNAPSHOT.jar profiles.jar
ENTRYPOINT ["java","-jar","/profiles.jar"]