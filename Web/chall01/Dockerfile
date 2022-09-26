FROM ubuntu
ENV HOME /root
ENV F1="flag{webber_robots_starter}"
ENV F2="flag{webber_springbeans_rce}"

WORKDIR /tmp
RUN apt update
RUN apt install maven default-jdk wget -yy
RUN wget https://archive.apache.org/dist/tomcat/tomcat-9/v9.0.2/bin/apache-tomcat-9.0.2.tar.gz -P /tmp
RUN cd /tmp
RUN tar -xf /tmp/apache-tomcat-9.0.2.tar.gz
RUN mv /tmp/apache-tomcat-9.0.2 /opt/tomcat
RUN chown root: /opt/tomcat
COPY context.xml /opt/tomcat/webapps/ROOT/manager/META-INF/context.xml
COPY java.security /etc/java-11-openjdk/security/java.security


WORKDIR $HOME
COPY src ./src
COPY pom.xml start.sh .
RUN chmod +x $HOME/start.sh 
RUN mvn clean package -DskipTests=true
RUN mv $HOME/target/webber-0.0.1-SNAPSHOT.war $HOME/target/webber.war
RUN cp $HOME/target/webber.war /opt/tomcat/webapps/webber.war
CMD ["nice","-n 5","/root/start.sh"]
EXPOSE 8080