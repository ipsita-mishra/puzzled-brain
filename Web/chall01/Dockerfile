FROM ubuntu
ENV HOME /root

WORKDIR $HOME
RUN apt update
RUN apt install maven default-jdk wget -yy
COPY src ./
COPY pom.xml mvnw flag1.txt flag2.txt ./
RUN mvn clean package

WORKDIR /tmp
RUN wget https://dlcdn.apache.org/tomcat/tomcat-9/v9.0.65/bin/apache-tomcat-9.0.65.tar.gz -P /tmp
RUN cd /tmp
RUN tar -xf /tmp/apache-tomcat-9.0.65.tar.gz
RUN mv /tmp/apache-tomcat-9.0.65 /opt/tomcat
RUN chown -R root /opt/tomcat/*

WORKDIR $HOME/target/
RUN mv webber-0.0.1-SNAPSHOT.war webber.war
RUN cp webber.war /opt/tomcat/webapps/

WORKDIR /opt/tomcat/bin/
RUN chmod +x catalina.sh

EXPOSE 8080
CMD ["/opt/tomcat/bin/catalina.sh", "run"]


