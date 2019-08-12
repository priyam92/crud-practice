package com.SpringBootJPA.Service;
import java.util.List;


import com.SpringBootJPA.domain.Customer;

public interface CustomerService {
	public Customer update(Customer customer);
	public List<Customer> findall();
	public void deleteById(Long id);
	public Customer save(Customer account);
	
}
