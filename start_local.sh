#!/usr/bin/env bash

#default_network_device=en0
#network_device=${1:-$default_network_device}
#export HOSTIP=`ifconfig $network_device | sed -En 's/127.0.0.1//;s/.*inet (addr:)?(([0-9]*\.)
# {3}[0-9]*).*/\2/p'`
#echo ${HOSTIP}

#./activator  compile reload -J-XX:-OmitStackTraceInFastThrow -J-Xms4G -J-Xmx4G -jvm-debug 9090
# -DES_CLUSTER_NAME="$HOSTNAME" -DJOB_SERVER="http://192.168.0.17:7777/sparkjob" -DJOB_SERVER2="http://52.24.201.146:8090" -DETHERWS_SERVER="http://${HOSTIP}:9000" -DES_USE_IPV4=true \~run

./bin/activator  compile reload -jvm-debug 9999 "run 8880"

