package com.SpringBootJPA.Controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootJPA.Service.CustomerService;
import com.SpringBootJPA.domain.Customer;

@RestController
public class CustomerController {

	static final Logger logger = Logger.getLogger(CustomerController.class);
	@Autowired
	CustomerService customerService;


	/**
	 * @param customer
	 * @return
	 */
	@PostMapping("/saveCustomerDetails")
	
	public ResponseEntity<Customer> save(@RequestBody Customer customer) {
		Customer customer2=customerService.save(customer);
	
	return new ResponseEntity<Customer> (customer2,HttpStatus.CREATED);
	 }
	/*public ResponseEntity<List<Customer>> save(@RequestBody List<Customer> customer) {
		List<Customer> customer2= customerService.save(customer);
		return new ResponseEntity<List<Customer>>(customer2,HttpStatus.CREATED);
	}*/
	@PutMapping("/updateCustomerDetails")
	public ResponseEntity<Customer> update(@RequestBody Customer customer) {
		Customer customer2=customerService.update(customer);

		return new ResponseEntity<Customer> (customer2,HttpStatus.CREATED);
	}
	@GetMapping("/getCustomerDetails")
	public ResponseEntity<List<Customer>> findall(){
		List<Customer> acclist = customerService.findall();
		logger.info("customer details fetched..");
		return new ResponseEntity<List<Customer>>(acclist,HttpStatus.OK);
	}
	


	@DeleteMapping("/deleteCustomerDetails/{id}")
	public void deleteById(@PathVariable Long id) {
		customerService.deleteById(id);
	}
}

