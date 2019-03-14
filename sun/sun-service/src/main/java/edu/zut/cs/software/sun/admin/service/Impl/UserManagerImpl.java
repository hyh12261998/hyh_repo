package edu.zut.cs.software.sun.admin.service.Impl;

import org.springframework.stereotype.Service;

import edu.zut.cs.software.sun.admin.service.UserManager;

@Service("userManager")
public class UserManagerImpl implements UserManager{
	public String sayHello(String name) {
		return  "Hello,"+name+ "!";
	}
}
