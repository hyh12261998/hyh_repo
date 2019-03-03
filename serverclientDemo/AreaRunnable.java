package pers.hyh.demo1.serverclientDemo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class AreaRunnable implements Runnable{
	private Socket client;
	public AreaRunnable(Socket client) {
		this.client=client;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		DataInputStream inputFromClient;
		try {
			inputFromClient = new DataInputStream(client.getInputStream());
			DataOutputStream outputToClient=new DataOutputStream(client.getOutputStream());
			while(true) {
				double radius=inputFromClient.readDouble();
				double area=radius*radius*Math.PI;
				System.out.println("服务器：接收到客户端半径："+radius);
				System.out.println("服务器：计算面积："+area);
				outputToClient.writeDouble(area);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	

}
