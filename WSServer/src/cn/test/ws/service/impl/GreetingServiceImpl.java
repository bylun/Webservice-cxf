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
		System.out.println("调用服务端方法为：getNames()");
		return names;
	}

	@Override
	public int getNum(int number) {
		
		System.out.println("服务端的方法为：getNum(),传入参数值为："+number);
		
		return number;
	}

}
