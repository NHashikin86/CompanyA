
package test2companya;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;


public class Test2CompanyA {

 
    public static void main(String[] args) {
        
        
        InetAddress ip;
        try{
           ip = InetAddress.getLocalHost(); //**get the local address**//
                          System.out.println("IP address : " + ip.getHostAddress());//** Will show the ip address**//
                          
       NetworkInterface network = NetworkInterface.getByInetAddress(ip);

            byte[] mac = network.getHardwareAddress();
                System.out.print("MAC address : ");

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < mac.length; i++) 
            {
                sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));        
            }
                System.out.println(sb.toString());

        } 
        catch (UnknownHostException | SocketException ex) 
        { 
            
             }
      
        
        
    }
    
}
