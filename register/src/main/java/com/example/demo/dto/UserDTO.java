package com.example.demo.dto;


import java.util.List;


public class UserDTO{
   
    private Integer id;

  
   
    private String email;
   
    private String password;

    private String name;

    private String prefferedPayment;

    private String address;
    
   
    private List<Integer> roles;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPrefferedPayment() {
		return prefferedPayment;
	}


	public void setPrefferedPayment(String pay) {
		this.prefferedPayment = pay;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public List<Integer> getRoles() {
		return roles;
	}


	public void setRoles(List<Integer> roles) {
		this.roles = roles;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", password=" + password + ", name=" + name + ", prefferedPay=" + prefferedPayment
				+ ", address=" + address + ", roles=" + roles + "]";
	}
    
	
  
	


	


}
