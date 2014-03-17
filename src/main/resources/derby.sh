#!/bin/sh
    java -Djava.security.manager -Djava.security.policy=src/main/resources/1010_server.policy -Dderby.security.port=1527 -Dderby.install.url=file:$DERBY_HOME/lib/  -jar $DERBY_HOME/lib/derbyrun.jar server start
    java -Djava.security.manager -Djava.security.policy=src/main/resources/1010_server.policy -Dderby.security.port=1527 -Dderby.install.url=file:$DERBY_HOME/lib/  -cp $DERBY_HOME/lib/derbyrun.jar org.apache.derby.drda.NetworkServerControl start



    java -Djava.security.manager -Djava.security.policy=src\main\resources\1010_server.policy -Dderby.security.port=1527 -Dderby.install.url=file:%DERBY_HOME%/lib/  -jar %DERBY_HOME%/lib/derbyrun.jar server start
    java -Djava.security.manager -Djava.security.policy=src\main\resources\1010_server.policy -Dderby.security.port=1527 -Dderby.install.url=file:%DERBY_HOME%/lib/  -cp %DERBY_HOME%/lib/derbyrun.jar org.apache.derby.drda.NetworkServerControl start