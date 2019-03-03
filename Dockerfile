From tomcat:9.0.16-jre8-alpine
COPY ./target/SpringBootSample-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war
CMD ["catalina.sh","run"]
