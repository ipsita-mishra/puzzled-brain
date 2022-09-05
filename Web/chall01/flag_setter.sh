#!/bin/bash
echo export ROBOTS=\"$( cat flag1.txt )\" >> ~/.bashrc
echo export BEANS=\"$( cat flag2.txt )\" >> ~/.bashrc
source ~/.bashrc
echo export ROBOTS=\"$( cat flag1.txt )\" >> /etc/environment
echo export BEANS=\"$( cat flag2.txt )\" >> /etc/environment
source /etc/environment