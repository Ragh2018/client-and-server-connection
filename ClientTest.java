import java.io.*;
import java.net.*;
class ClientTest
{
public static void main(String s[])
{
try
{
System.out.println("client started");
Socket sk=new Socket("localhost",1500);
System.out.println("connection created");
}
catch(UnknownHostException e)
{
e.printStackTrace();
}
catch(IOException e)
{
e.printStackTrace();
}
}
}