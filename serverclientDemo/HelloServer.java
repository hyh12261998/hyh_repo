package pers.hyh.demo1.serverclientDemo;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class HelloServer {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ServerSocket server=new ServerSocket(8080);
		System.out.println("服务器运行，等待客户端连接");
		Socket client=server.accept();
		OutputStream out=client.getOutputStream();
		PrintWriter pw=new PrintWriter(out);
		pw.println("Hello world!");
		pw.flush();
		client.close();
		server.close();
	}

}
