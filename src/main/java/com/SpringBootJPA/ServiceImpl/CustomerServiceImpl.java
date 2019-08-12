package com.SpringBootJPA.ServiceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBootJPA.Reprository.CustomerRepository;

import com.SpringBootJPA.Service.CustomerService;

import com.SpringBootJPA.domain.Customer;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

	static final Logger logger = Logger.getLogger(CustomerServiceImpl.class);

	@Autowired
	CustomerRepository repository;

	@Override

	public Customer save(Customer customer) {
		logger.info("customer details saved");
		return repository.save(customer);
	}
	/*
	 * public List<Customer> save(List<Customer> customer) {
	 * logger.info("customer details saved"); return Repositories.saveall(customer);
	 */

	@Override
	public Customer update(Customer customer) {
		return repository.save(customer);
	}

	@Override
	public List<Customer> findall() {
		return repository.findAll();
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);

	}

}
