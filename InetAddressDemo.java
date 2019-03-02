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
		InetAddress locAdd=null;                //����InetAddress����
		InetAddress remAdd=null;                //����InetAddress����
		locAdd=InetAddress.getLocalHost();      //�õ����ص�InetAddress����
		remAdd=InetAddress.getByName("www.icourses.cn");   //��ȡԶ�̵�InetAddress
		System.out.println("����IP��ַ��"+locAdd.getHostAddress());           //������ص�IP��ַ
		System.out.println("��������"+locAdd.getHostName());                 //���IP��ַ������
		System.out.println("�Ƿ���һ��IP��㴫�͵�ַ��"+locAdd.isMulticastAddress());
		System.out.println("���γ̵�IP��ַ��"+remAdd.getHostAddress());        //���Զ�̵�IP��ַ
		System.out.println("�����Ƿ�ɴ"+locAdd.isReachable(4000)); 
		System.out.println("�Ƿ���һ��IP��㴫�͵�ַ��"+remAdd.isMulticastAddress());

	}

}


//����InetAddress��
