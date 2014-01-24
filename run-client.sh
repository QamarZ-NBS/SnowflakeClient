#!/bin/sh
#
# assuming:
# 1."mvn clean install" has been executed
# 2. the script "run-client.sh" is executable i.e., "chmod a+x run-client.sh"
#

if [[ "$1" == "" ]] || [[ "$2" == "" ]] || [[ "$3" == "" ]]; then
    echo "--usage: host_address port_no no_of_ids i.e., ./run-client.sh localhost 30405 10";
    exit;
fi

java -jar target/SnowflakeClient-1.0-SNAPSHOT-jar-with-dependencies.jar $1 $2 $3