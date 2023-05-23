package com.jaya.customerdatamanagement.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.jaya.customerdatamanagement.dto.CustomerDTO;
import com.jaya.customerdatamanagement.dto.ResponseStructure;
import com.jaya.customerdatamanagement.entity.Customer;
import com.jaya.customerdatamanagement.repository.CustomerDAO;
import com.jaya.customerdatamanagement.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerDAO dao;
	
	public ResponseStructure<Customer> saveCustomer(CustomerDTO dto) {
		Customer cus = new Customer(dto);
		Customer customer = dao.saveCustomer(cus);
		ResponseStructure<Customer> rs = new ResponseStructure<>();
		rs.setData(customer);
		rs.setStatusCode(HttpStatus.OK.value());
		rs.setTimeStamp(LocalDateTime.now());
		rs.setMessage("Customer data saved successfully");
		return rs;
	}
	
//	public Customer updateCustomer(Customer customer) {
//		return dao.saveCustomer(customer);
//	}
//	public List<Customer> getAllCustomerData(){
//		return dao.getAllCustomerData();
//	}
	public ResponseStructure<List<Customer>> getAllCustomerData(){
		List<Customer> list = dao.getAllCustomerData();
		ResponseStructure<List<Customer>> rs = new ResponseStructure<>();
		if(list.size()!=0) {
			rs.setStatusCode(HttpStatus.FOUND.value());
			rs.setData(list);
			rs.setTimeStamp(LocalDateTime.now());
			rs.setMessage("Customers entry found in database");
		}
		else {
			rs.setStatusCode(HttpStatus.NOT_FOUND.value());
			rs.setData(null);
			rs.setTimeStamp(LocalDateTime.now());
			rs.setMessage("No Customer entry found in database");
		}
		return rs;
	}
	
	public Customer getCustomerDataById(int id) {
		return dao.getCustomerDataById(id);
	}
	public Customer deleteCustomerDataById(int id) {
		return dao.deleteCustomerDataById(id);
	}
	
	public List<Customer> getCustomerByName(String name){
		return dao.getCustomerByName(name);
	}
	
	public List<Customer> validateCustomer(String name,String email){
		return dao.validateCustomer(name, email);
	}
	
	public ResponseStructure<Customer> updateCustomer(Customer customer) {
		Customer cus = dao.saveCustomer(customer);
		ResponseStructure<Customer> rs = new ResponseStructure<>();
		rs.setData(cus);
		rs.setStatusCode(HttpStatus.ACCEPTED.value());
		rs.setTimeStamp(LocalDateTime.now());
		rs.setMessage(HttpStatus.ACCEPTED.name());
		return rs;
	}
	
}
