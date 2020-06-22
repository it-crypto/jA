import java.io.Console; // imports all the required libraries
import java.security.MessageDigest;
import javax.xml.bind.DatatypeConverter; //for converting to hexdecimal characters
import java.security.*;

class Main{
	public static void main(String[] args)
	{
	    String str; // for storing the password from the console
		Console console =  System.console();
		System.out.print("Enter the password:");
		str=console.readLine(); // for reading the password from the console
		console.printf("The password entered is:"+str); // prints the password to the console
		System.out.println("");//for new line
		
		try{
		      MessageDigest md = MessageDigest.getInstance("MD5");
			  md.update(str.getBytes());//for updating
			  byte[] digest = md.digest();//for storing the digest
              String hash_pwd = DatatypeConverter.printHexBinary(digest).toUpperCase();//converting hash
			  console.printf("the MD5 hash for the password "+str+" is:"+hash_pwd);
			  System.out.println("");
		}
		 catch (NoSuchAlgorithmException e) { 
            e.printStackTrace();
			System.out.println(e); 
        }
	}
}