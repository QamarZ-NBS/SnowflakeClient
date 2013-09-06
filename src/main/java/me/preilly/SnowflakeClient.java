package me.preilly;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;
import org.apache.thrift.transport.TFramedTransport;
import com.twitter.service.snowflake.gen.Snowflake;

public class SnowflakeClient {
 
   public static void main(String[] args) {
      String server = "192.168.11.4";
      Integer port = 7610;
      String infoLine = "[INFO] ------------------------------------------------------------------------";
      System.out.println(infoLine);
      System.out.println("[INFO] Starting Snowflake Client Test...");
      System.out.println(infoLine);
      try {   
        TSocket socket = new TSocket(server, port);
        TTransport transport = new TFramedTransport(socket);
        TProtocol protocol = new TBinaryProtocol(transport);
        transport.open();
        
        Snowflake.Client client = new Snowflake.Client(protocol);
        System.out.println(client.get_worker_id());
        System.out.println(client.get_id("awesome"));
        transport.close();
       } catch (TTransportException e) {
          e.printStackTrace();
       } catch (TException e) {
          e.printStackTrace();
       }
   }
}
