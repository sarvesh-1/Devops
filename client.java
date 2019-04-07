import java.io.*;
import java.net.*;
import java.util.*;
public class client
{
 public static void main(String a[])
 {
	 try
	 {
		Scanner sc=new Scanner(System.in);
		String st;
		 Socket ss=new Socket("localhost",3300);
		 DataOutputStream ds=new DataOutputStream(ss.getOutputStream());
		System.out.println("Enter message\n");
		st=sc.nextLine(); 	
		ds.writeUTF(st);
		ds.close();
	 }
	 catch(Exception e)
	 {
		 System.out.println("Exception is "+e.toString());
	 }
	 
 }
}
