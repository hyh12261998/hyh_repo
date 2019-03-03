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
				System.out.println("�����������յ��ͻ��˰뾶��"+radius);
				System.out.println("�����������������"+area);
				outputToClient.writeDouble(area);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	

}
