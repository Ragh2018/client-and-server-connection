import java.net.*;
class ServerTest
{
public static void main(String s[])
{
try
{
System.out.println("Server started");
ServerSocket ss=new ServerSocket(1500);
while(true)
{
System.out.println("waiting for client request...");
Socket sk=ss.accept();
System.out.println("client connected");
}
}
catch(Exception e)
{
e.printStackTrace();
}
}
}