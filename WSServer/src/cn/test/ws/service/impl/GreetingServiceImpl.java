package cn.test.ws.service.impl;

import java.util.ArrayList;
import java.util.List;

import cn.test.ws.service.GreetingService;

public class GreetingServiceImpl implements GreetingService {

	@Override
	public List<Object> getNames(String username) {
		List<Object> names = new ArrayList<Object>();
		names.add("xiaoming");
		names.add("zhangsan");
		names.add("lisi");
		System.out.println("���÷���˷���Ϊ��getNames()");
		return names;
	}

	@Override
	public int getNum(int number) {
		
		System.out.println("����˵ķ���Ϊ��getNum(),�������ֵΪ��"+number);
		
		return number;
	}

}
