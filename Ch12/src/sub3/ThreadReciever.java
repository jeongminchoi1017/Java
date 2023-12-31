package sub3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ThreadReciever extends Thread {
	
	private Socket socket;
	
	public ThreadReciever(Socket socket) {
		this.socket =socket;
	}
	
		
	@Override
	public void run() {
	
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			while (true) {
				
				String msg = br.readLine();
				
				if(msg == null) {
					break;
				}
				System.out.println("수신 >" +msg);
			}
				} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
