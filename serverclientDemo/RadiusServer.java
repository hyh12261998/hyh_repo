package pers.hyh.demo1.serverclientDemo;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class RadiusServer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket server=new ServerSocket(8080);
		System.out.println("����������ʱ�䣺"+new Date());
		while(true) {
		    Socket client=server.accept();
		    Thread thread=new Thread(new AreaRunnable(client));
		    thread.start();
		}
	}

}
