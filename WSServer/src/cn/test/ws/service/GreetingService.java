package cn.test.ws.service;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface GreetingService {
	
	public List<Object> getNames(@WebParam(name="username") String username);

	public int getNum(@WebParam(name="number") int number);
}
