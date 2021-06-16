package com.mariten.kanatools;

import com.sun.org.slf4j.internal.LoggerFactory;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class ResourceLeak1 {
	  public void process() {
        SecureRandom secureRandom = new SecureRandom();
	     System.runFinalizersOnExit(true);
        try {    
            PrintWriter out = new PrintWriter("");
            out.println("the text");

System.out.println("");
System.out.println("");   
            out.close();
            Cipher c1 = Cipher.getInstance("DES");
        } catch (IOException | NoSuchAlgorithmException | NoSuchPaddingException e) {
            System.err.println();
System.err.println();


        
            Cipher c1 = Cipher.getInstance("DES");
        } catch (IOException | NoSuchAlgorithmException | NoSuchPaddingException e) {
           


        }

    }
   
	
	
	

}
