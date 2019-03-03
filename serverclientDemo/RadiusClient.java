package pers.hyh.demo1.serverclientDemo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class RadiusClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket client=new Socket("localhost",8080);
		Scanner sc=new Scanner(System.in);
		DataInputStream fromServer=new DataInputStream(client.getInputStream());
		DataOutputStream toServer=new DataOutputStream(client.getOutputStream());
		while(true) {
			System.out.println("����뾶��");
			double radius=sc.nextDouble();
			toServer.writeDouble(radius);
			toServer.flush();
			Double area=fromServer.readDouble();
			System.out.println("�ͻ��ˣ�����뾶��"+radius);
			System.out.println("�ͻ��ˣ��յ���Բ�������"+area);
		}

	}

}
