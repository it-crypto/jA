import java.io.Console; // imports all the required libraries
import java.security.*;
import java.io.*;
import javax.xml.bind.DatatypeConverter;
import java.util.*;

class Main1{
	 public static void main(String[] args){
	    String str;
		Console console =  System.console();
		if( console == null ) {
	     System.out.print("Console unavailable");
	    return;
	  }
       System.out.print("Enter the password:");
		str=console.readLine(); // for reading the password from the console
		try{
			SecureRandom salt = new SecureRandom();
		     int salt_len = 16;
		     byte salt_bytes[] = new byte[salt_len];
		     salt.nextBytes(salt_bytes);
			 String sl = DatatypeConverter.printHexBinary(salt_bytes);
			 console.printf(sl);
           }
		   catch(Exception e){
		   e.printStackTrace();
		   	System.out.println(e);
		   }
	 }
}
