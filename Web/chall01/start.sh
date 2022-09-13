#!/bin/bash
echo "STARTING CATALINA"
/opt/tomcat/bin/catalina.sh run &
# echo "STARTING RELOADER"
# python3 /root/reloader.py

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





