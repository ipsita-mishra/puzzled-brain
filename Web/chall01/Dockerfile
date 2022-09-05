FROM ubuntu
ENV HOME /root
ENV F1="flag{webber_robots_starter}"
ENV F2="flag{webber_springbeans_rce}"

WORKDIR /tmp
RUN apt update
RUN apt install maven default-jdk wget cron -yy
RUN wget https://archive.apache.org/dist/tomcat/tomcat-9/v9.0.2/bin/apache-tomcat-9.0.2.tar.gz -P /tmp
RUN cd /tmp
RUN tar -xf /tmp/apache-tomcat-9.0.2.tar.gz
RUN mv /tmp/apache-tomcat-9.0.2 /opt/tomcat
RUN chown root: /opt/tomcat
RUN chmod +x /opt/tomcat/bin/startup.sh
RUN bash /opt/tomcat/bin/startup.sh

WORKDIR $HOME
COPY src ./src
COPY pom.xml reload.sh .
RUN mvn clean package
RUN mv $HOME/target/webber-0.0.1-SNAPSHOT.war $HOME/target/webber.war
RUN cp $HOME/target/webber.war /opt/tomcat/webapps/webber.war
CMD ["/opt/tomcat/bin/catalina.sh","run"]
EXPOSE 8080