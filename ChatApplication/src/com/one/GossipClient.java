package com.one;
import java.io.*;
import java.net.*;
public class GossipClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket sock=new Socket("127.0.0.1", 3000);
		
		BufferedReader keyRead=new BufferedReader(new InputStreamReader(System.in));
		OutputStream outputStream=sock.getOutputStream();
		InputStream inputStream=sock.getInputStream();
		PrintWriter pwrite = new PrintWriter(outputStream, true); 
		BufferedReader received= new BufferedReader(new InputStreamReader(inputStream));
		
		System.out.println("Start the chitchat, type and press Enter key");
		String receiveMessage, sendMessage;
		while(true) { sendMessage = keyRead.readLine(); 
		// keyboard reading 
		pwrite.println(sendMessage); 
		// sending to server 
		pwrite.flush(); 
		// flush the data 
		if((receiveMessage = received.readLine()) != null) 
		{
			//receive from server 
			System.out.println(receiveMessage); 
			// displaying at DOS prompt 
		} 
	}
	
}
}