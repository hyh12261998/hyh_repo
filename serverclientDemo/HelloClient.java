package pers.hyh.demo1.serverclientDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class HelloClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket client=new Socket("localhost",8080);
		BufferedReader br=new BufferedReader(new InputStreamReader(client.getInputStream()));
		String context=br.readLine();
		System.out.println("当前服务器输出语句："+context);
		br.close();
		client.close();

	}

}
