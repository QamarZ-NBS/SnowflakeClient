package me.preilly;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

import com.twitter.service.snowflake.gen.Snowflake;

public class SnowflakeClient {
 
   public static void main(String[] args) {
		String hostAddress = args[0];
		Integer portNo = Integer.parseInt(args[1]);

      String infoLine = "[INFO] ------------------------------------------------------------------------";
      System.out.println(infoLine);
      System.out.println("[INFO] Starting Snowflake Client...");
      System.out.println(infoLine);

      try {   
			long startTimeMill = System.currentTimeMillis();
			TSocket socket = new TSocket(hostAddress, portNo);
        TTransport transport = new TFramedTransport(socket);
        TProtocol protocol = new TBinaryProtocol(transport);
        transport.open();
        
        Snowflake.Client client = new Snowflake.Client(protocol);

			for (int counter = 0; counter < Integer.parseInt(args[2]); counter++) {
				System.out.println(client.get_id("QamarZ"));
			}

        transport.close();

			System.out.println("[INFO] generated " + args[2] + " IDs in "
					+ (System.currentTimeMillis() - startTimeMill)
					+ " milliseconds...");

       } catch (TTransportException e) {
          e.printStackTrace();
       } catch (TException e) {
          e.printStackTrace();
       }

   }

}
