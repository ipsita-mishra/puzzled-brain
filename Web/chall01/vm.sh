#!/bin/bash
echo "STARTING CATALINA -- $(date)"

cat /etc/java-11-openjdk/security/java.security | grep securerandom.source
cp ~/webber.war /opt/tomcat/webapps/webber.war
cp ~/flag.txt /opt/tomcat/temp/flag.txt
/opt/tomcat/bin/catalina.sh run &

echo "RELOADER SCRIPT READY -- $(date)"
sleep 3m
while [ 1 ]
do
    echo "RELOADER SCRIPT CLEANING -- $(date)"
    /opt/tomcat/bin/catalina.sh stop &
    rm -rf /opt/tomcat/webapps/webber
    /opt/tomcat/bin/catalina.sh run &
    sleep 10m
done