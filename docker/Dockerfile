FROM dockerfile/java:oracle-java7

RUN apt-get update
RUN apt-get install -y --no-install-recommends maven

RUN mkdir -p /usr/src/ip-lookup; cd /usr/src/ip-lookup; git clone https://github.com/adaofeliz/ip-lookup.git app
RUN cd /usr/src/ip-lookup/app; mvn -DskipTests=true package || true

CMD ["java", "-jar", "/usr/src/ip-lookup/app/target/ip-lookup.war"]