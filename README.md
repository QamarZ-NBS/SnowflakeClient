Twitter Snowflake Client
==============
*written in Java using Thrift*

```
$ mvn clean -U install; ./run-client.sh host_address port_no no_of_ids
```

**Sample Output:**
```
$ ./run-client.sh localhost 30405 10
[INFO] ------------------------------------------------------------------------
[INFO] Starting Snowflake Client Test...
[INFO] ------------------------------------------------------------------------
1037166441528565760
1037166441553731584
1037166441562120192
1037166441562120193
1037166441566314496
1037166441578897408
1037166441583091712
1037166441583091713
1037166441591480320
1037166441591480321
[INFO] generated 10 IDs in 105 milliseconds...
```
