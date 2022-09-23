#!/bin/bash
echo "STARTING CATALINA"

cat /etc/java-11-openjdk/security/java.security | grep securerandom.source

/opt/tomcat/bin/catalina.sh run &

echo "RELOADER SCRIPT READY -- $(date)"
sleep 3m
while [ 1 ]
do
    echo "RELOADER SCRIPT CLEANING -- $(date)"
    /opt/tomcat/bin/catalina.sh stop &
    rm -rf /opt/tomcat/webapps/webber 
    rm /opt/tomcat/webapps/webber.war 
    cp /root/target/webber.war /opt/tomcat/webapps/webber.war
    /opt/tomcat/bin/catalina.sh run &
    sleep 10m
done
