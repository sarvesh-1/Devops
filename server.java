import java.net.*;
import java.io.*;
//import java.util.*;
public class server
{
  public static void main(String a[])
  {
	  try
	  { 
		
		  ServerSocket se=new ServerSocket(3300);
		  Socket ss=se.accept();
		  DataInputStream di=new DataInputStream(ss.getInputStream());
		  String msg=(String)di.readUTF();
		  System.out.println(msg);
	  }
	  catch(Exception e)
	  {
		  System.out.println("Exception is "+e.toString());
	  }
  }
}
