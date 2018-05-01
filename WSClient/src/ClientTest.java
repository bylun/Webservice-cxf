import java.util.ArrayList;
import java.util.List;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
public class ClientTest { 
	public static void main(String[] args) {
		String wsUrl = "http://127.0.0.1:8080/WS/GreetingService?wsdl";
		String method1 ="getNames";
		String method2 =  "getNum";
		 try {
			JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
			Client client = dcf.createClient(wsUrl);
			Object[] objects =client.invoke(method1,"TEST");
			List list =(ArrayList)objects[0];
			for(int i=0;i<list.size();i++) {
				System.out.println(list.get(i).toString());
			}
			System.out.println("集合的长度："+list.size());
			System.out.println(objects);
			Object[] numbers =client.invoke(method2,6);
			System.out.println(objects[0].toString());
			System.out.println(numbers[0]);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
