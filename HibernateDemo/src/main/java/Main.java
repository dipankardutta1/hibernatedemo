import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.example.demo.pojo.Address;
import com.example.demo.pojo.User;
import com.example.demo.pojo.Util;

public class Main {

	public static void main(String[] args) {
		

		SessionFactory factory = Util.getSessionFactory();
		
		
		Session session = factory.openSession();
		
		session.beginTransaction();
		
		User user = new User();
		
		user.setName("Susmita");
		user.setPhoneNo("1111111");
		user.setDob(new Date());
		user.setUsername("susmita");
		user.setPassword("root");
		
		
		Address address1 = new Address();
		address1.setAddr("INDIA");
		address1.setCountry("INDIA");
		address1.setUser(user);
		
		
		
		List<Address> addresses = new ArrayList<Address>();
		addresses.add(address1);
		
		user.setAddressList(addresses);
		
		
		
		session.save(user);
		session.save(address1);
		
		session.getTransaction().commit();
		
		session.close();
		

	}

}
