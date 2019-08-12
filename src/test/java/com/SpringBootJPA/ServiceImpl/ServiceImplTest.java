package com.SpringBootJPA.ServiceImpl;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import com.SpringBootJPA.domain.Customer;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ServiceImplTest {

	CustomerServiceImpl customerServiceImpl;
	
	@Test
	public void saveTest() {
		List<Customer> customerList = new LinkedList<Customer>();
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Itismita");
		customer.setLastName("Sahoo");
		customer.setLocation("Bhubaneswar");
		
		customerList.add(customer);
		//customerServiceImpl.save(customerList);
		System.out.println("Data saved Successfully");
	}
}
