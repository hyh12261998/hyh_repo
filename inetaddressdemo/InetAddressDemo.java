package pers.hyh.demo1.inetaddressdemo;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InetAddress locAdd=null;                //声明InetAddress对象
		InetAddress remAdd=null;                //声明InetAddress对象
		locAdd=InetAddress.getLocalHost();      //得到本地的InetAddress对象
		remAdd=InetAddress.getByName("www.icourses.cn");   //获取远程的InetAddress
		System.out.println("本机IP地址："+locAdd.getHostAddress());           //输出本地的IP地址
		System.out.println("本机名："+locAdd.getHostName());                 //输出IP地址本机名
		System.out.println("是否是一个IP多点传送地址："+locAdd.isMulticastAddress());
		System.out.println("爱课程的IP地址："+remAdd.getHostAddress());        //输出远程的IP地址
		System.out.println("本机是否可达："+locAdd.isReachable(4000)); 
		System.out.println("是否是一个IP多点传送地址："+remAdd.isMulticastAddress());

	}

}


//测试InetAddress类
